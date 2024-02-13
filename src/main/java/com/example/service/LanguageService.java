package com.example.service;

import java.util.List;

import com.example.domain.Language;

public interface LanguageService {

	List<Language> getLanguageList();

	void addLanguage(Language language);

	void updateLanguage(Language language);

	void deleteLanguage(int languageId);

}
