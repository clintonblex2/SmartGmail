package com.example.root.smartgmail.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// This class creates static retrofit instance
public class ApiClient {
    public static Retrofit retrofit = null;
    private static final String BASE_URL = "https://api.androidhive.info/json/";

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
