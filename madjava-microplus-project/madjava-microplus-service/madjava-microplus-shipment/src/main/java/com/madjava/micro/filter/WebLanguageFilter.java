package com.madjava.micro.filter;

import java.io.IOException;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;

import com.madjava.micro.data.ThreadLocalData;
import com.madjava.micro.service.LanguageService;
import com.madjava.micro.service.SessionService;

//@Configuration
//@WebFilter(filterName="languageFilter",urlPatterns="/*")
public class WebLanguageFilter implements Filter {
	
	@Resource(name = "microLanguageService")
	private LanguageService languageService;
	
	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String lang = httpRequest.getHeader("lang");
		if(StringUtils.isBlank(lang)) {
			languageService.setCurrentLanguage(Locale.SIMPLIFIED_CHINESE);
		} else {
			Locale local = null;
			switch (lang) {
			case "zh_CN":
				local = Locale.SIMPLIFIED_CHINESE;
				break;
			case "en_US":
				local = Locale.US;
				break;
			default:
				local = Locale.SIMPLIFIED_CHINESE;
				break;
			}
			languageService.setCurrentLanguage(local);
		}
		
		String siteId = httpRequest.getHeader("siteId");
		String userId = httpRequest.getHeader("userId");
		String userName = httpRequest.getHeader("userName");
		ThreadLocalData ThreadLocalData = new ThreadLocalData();
		
		if(StringUtils.isNotBlank(siteId)) {
			ThreadLocalData.setSiteId(siteId);
		}
		
		if(StringUtils.isNotBlank(userId)) {
			ThreadLocalData.setUserId(userId);
		}
		
		if(StringUtils.isNotBlank(userName)) {
			ThreadLocalData.setUserName(userName);
		}
		
		sessionService.setSessionData(ThreadLocalData);
		
		try {
			chain.doFilter(request, response);
		} finally {
			languageService.remove();
			sessionService.remove();
		}
	}

}
