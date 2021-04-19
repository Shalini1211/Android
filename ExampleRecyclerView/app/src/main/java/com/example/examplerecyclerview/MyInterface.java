package com.example.examplerecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyInterface {
    @GET("top-headlines?sources=bbc-news&apiKey=2aeb9ecfd2f44b41960b7c698e7b3075")
    Call<String> value();

}
