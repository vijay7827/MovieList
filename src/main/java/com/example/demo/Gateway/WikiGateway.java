package com.example.demo.Gateway;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.client.WikiClient;
import com.example.demo.model.Result;

import retrofit2.Response;

@Component
public class WikiGateway {
	
	@Autowired
	private WikiClient wikiclient; 
	
	public Result getHTMLResponse(String name) {
		Response<Result> response = wikiclient.getMovie(name).blockingGet();
		if(Objects.nonNull(response)) {
			return response.body();
		}
		return null;
	}

}
