package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Language;
import com.example.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping
    public List<Language> getLanguageList() {
    	System.out.println("getLanguageList Controller Call");
        return languageService.getLanguageList();
    }
    
    @PostMapping("/add")
    public void addLanguage(@RequestBody Language language) {
    	System.out.println("addLanguage Controller Call");
        languageService.addLanguage(language);
    }

    @PutMapping("/{languageId}")
    public void updateLanguage(@PathVariable int languageId, @RequestBody Language language) {
    	System.out.println("updateLanguage Controller Call");
        language.setLanguageId(languageId);
        languageService.updateLanguage(language);
    }

    @DeleteMapping("/{languageId}")
    public void deleteLanguage(@PathVariable int languageId) {
    	System.out.println("deleteLanguage Controller Call");
        languageService.deleteLanguage(languageId);
    }
}
