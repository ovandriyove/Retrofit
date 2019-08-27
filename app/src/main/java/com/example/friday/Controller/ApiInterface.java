package com.example.friday.Controller;

import com.example.friday.Model.ComptonModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("todos")
    Call<ComptonModel> getComptonModel();
}
