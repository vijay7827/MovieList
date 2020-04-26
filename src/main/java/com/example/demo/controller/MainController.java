package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.WikiService;

@RestController
@RequestMapping("/api/v1/movie")
public class MainController {
	
	@Autowired
	private WikiService wikiservice;
	
	@RequestMapping("/save/{movie}")
	public Movie htmlData(@PathVariable String name) {
		return wikiservice.getHtmlData(name);
	}

}
