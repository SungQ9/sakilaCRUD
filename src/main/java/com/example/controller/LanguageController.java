package com.example.controller;

import com.example.domain.Language;
import com.example.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
