package com.example.service;

import com.example.domain.Language;
import com.example.dao.LanguageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageDAO languageDAO;

	@Override
	public List<Language> getLanguageList() {
		return languageDAO.getLanguageList();
	}

	@Override
	public void addLanguage(Language language) {
		 languageDAO.addLanguage(language);

	}

	@Override
	public void updateLanguage(Language language) {
		 languageDAO.updateLanguage(language);

	}

	@Override
	public void deleteLanguage(int languageId) {
		 languageDAO.deleteLanguage(languageId);

	}
}
