package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "producer")
	private String producer;
	
	@Column(name = "musicCompose")
	private String musicComposer;
	
	@Column(name = "production_house")
	private String production_house;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "language")
	private String language;
	
	@Column(name ="releases")
	private String releases;
	

	public String getRelease() {
		return releases;
	}
	public void setRelease(String releases) {
		this.releases = releases;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getMusicComposer() {
		return musicComposer;
	}
	public void setMusicComposer(String musicComposer) {
		this.musicComposer = musicComposer;
	}
	public String getProduction_house() {
		return production_house;
	}
	public void setProduction_house(String production_house) {
		this.production_house = production_house;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
