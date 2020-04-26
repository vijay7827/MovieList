package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	
	@JsonProperty("*")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
