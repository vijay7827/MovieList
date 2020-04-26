package com.example.demo.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.Movie;

public class HTMLParser {
	
	private static final Logger logger = LoggerFactory.getLogger(HTMLParser.class);
	public static Movie parse(Movie movie, String htmlData) {
		logger.info("==================== parsing data ==============");
		Document doc = Jsoup.parse(htmlData);
		Element table = doc.select("table").get(0);
		Elements rows = table.select("tr");
		System.out.println("Rows size  " +rows.size());
		String director = rows.get(2).select("td").text();
		String producer = rows.get(3).select("td").text();

		String musicComposer = rows.get(8).select("td").text();
		String production_house = rows.get(9).select("td").text();
		String relase = rows.get(11).select("td").text();
		String duration = rows.get(12).select("td").text();
		String language = rows.get(14).select("td").text();
		
		System.out.println(director);
		System.out.println(producer);
	
		System.out.println(musicComposer);
		System.out.println(production_house);
		System.out.println(relase);
		System.out.println(duration);
		System.out.println(language);
		
		movie.setDirector(director);
		movie.setDuration(duration);
		movie.setLanguage(language);
		movie.setProduction_house(production_house);
		movie.setMusicComposer(musicComposer);
		movie.setProducer(producer);
		movie.setRelease(relase);
		
		return movie;
		
	}

}
