package com.pubablibank.pibanking;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndPoints {

    @GET("todos/{id}")
    Call<JsonElement> getTodo(@Path("id") int id);

    @GET("products/{id}")
    Call<JsonElement> getProduct(@Path("id") int id);
}
