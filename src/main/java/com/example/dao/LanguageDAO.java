package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Language;

@Mapper
public interface LanguageDAO {

	List<Language> getLanguageList();

	void addLanguage(Language language);

	void updateLanguage(Language language);

	void deleteLanguage(int languageId);

}
