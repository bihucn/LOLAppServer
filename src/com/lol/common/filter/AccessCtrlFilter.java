package com.lol.common.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccessCtrlFilter implements Filter {
	// 系统中不需要做登录控制的  画面和Action
	private String[] noCheckSession ;
	
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		// 如果处理HTTP请求，并且需要访问诸如getHeader或getCookies等在ServletRequest中无法得到的方法，
		// 就要把此request对象构造成HttpServletRequest
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		// 取得当前访问的   路径
		String currentURL = request.getServletPath().substring(1).trim();
		Arrays.sort(noCheckSession);
		if(Arrays.binarySearch(noCheckSession, currentURL) < 0 && !isUrlEnabal(currentURL)){
			HttpSession session = request.getSession(false);
			if (session == null
					|| session.getAttribute("SYSTEMUSER") == null) {
				// 如果session为空表示用户没有登录 则抛出用户未登录异常
				response.sendError(401) ;
				return  ;
			}
		}
		// 在调用此对象的doFilter方法时，激活下一个相关的过滤器。如果没有另一个过滤器与servlet或JSP页面关联，则servlet或JSP页面被激活。
		filterChain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// 通过配置文件获取  不需要检查session 访问路径
		noCheckSession = filterConfig.getInitParameter("nochecksession").split(",") ;
		for(int i=0 ;i<noCheckSession.length ;i++){
			noCheckSession[i] = noCheckSession[i].trim() ;
		}
	}
	
	private boolean isUrlEnabal(String url){
		if(noCheckSession==null){
			return false;
		}
		for(String s:noCheckSession){
			if(s.indexOf("/*")!=-1){
				if(url.indexOf(s.substring(0,s.length()-1))!=-1){
					return true;
				}
			}
		}
		return false;
	}

	public void destroy() {

	}

}
