package com.example.paola_criollo_retrofit_guia;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface{
    @GET("posts")
    Call<List<Modelo>> getPosts();
}
