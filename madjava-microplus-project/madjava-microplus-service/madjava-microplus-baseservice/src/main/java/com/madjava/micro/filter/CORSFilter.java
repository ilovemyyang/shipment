package com.madjava.micro.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

//@Configuration
//@WebFilter(filterName="corsFilter",urlPatterns="/*")
public class CORSFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse, final FilterChain filterChain) throws IOException, ServletException {
		final HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
		httpResponse.addHeader("Access-Control-Allow-Origin", "*");
		httpResponse.addHeader("Access-Control-Allow-Headers", "Origin, No-Cache, Accept, Authorization, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With, channelCode, lang, uid");
		httpResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(final FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
