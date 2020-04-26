package com.example.demo.client;

import com.example.demo.model.Result;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WikiClient {
	
	@GET("api.php?action=parse&section=0&prop=text&format=json")
	Single<Response<Result>> getMovie(@Query(value = "page",encoded = true) String name);


}
