package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Gateway.WikiGateway;
import com.example.demo.client.WikiClient;
import com.example.demo.dao.MovieDao;
import com.example.demo.model.Movie;
import com.example.demo.model.Result;
import com.example.demo.utils.HTMLParser;
@Service
public class WikiService {
	
	@Autowired
	private WikiGateway wikiGateway;
	
	@Autowired
	private MovieDao movieDao;
	
	public Movie getHtmlData(String name) {
		Result response = wikiGateway.getHTMLResponse(name);
		Movie movie = new Movie();
		movie.setTitle(response.getParse().getTitle());
		movie=HTMLParser.parse(movie, response.getParse().getText().getDescription());	
		return movieDao.save(movie);	
	}	

}
