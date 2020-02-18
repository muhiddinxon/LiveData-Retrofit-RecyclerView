package com.example.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    @GET("marvel/")
    Call<List<Hero>> getHeros();
}
