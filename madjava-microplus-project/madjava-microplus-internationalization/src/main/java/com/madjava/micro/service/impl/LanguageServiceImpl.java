package com.madjava.micro.service.impl;

import java.util.Locale;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.madjava.micro.service.LanguageService;

@Component(value = "microLanguageService")
public class LanguageServiceImpl implements LanguageService {
	
	private static final ThreadLocal<Locale> languageThreadLocal = new ThreadLocal<>();

	@Override
	public void setCurrentLanguage(Locale value) {
		languageThreadLocal.set(value);
	}

	@Override
	public Optional<Locale> getCurrentLanguage() {
		return Optional.ofNullable(languageThreadLocal.get());
	}

	@Override
	public void remove() {
		languageThreadLocal.remove();
	}
}
