package com.madjava.micro.service;

import java.util.Locale;
import java.util.Optional;

public interface LanguageService {
	
	void setCurrentLanguage(Locale value);

    Optional<Locale> getCurrentLanguage();
    
    void remove();

}
