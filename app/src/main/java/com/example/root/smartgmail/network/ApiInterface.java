package com.example.root.smartgmail.network;

import com.example.root.smartgmail.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This class contains the REST API interface endpoints and the type of response
 * is expecting. In this case, we have only one endpoint i.e. inbox.json
 */

public interface ApiInterface {

    @GET("inbox.json")
    public Call<List<Message>> getInbox();

}
