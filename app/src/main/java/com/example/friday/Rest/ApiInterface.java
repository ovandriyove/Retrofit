package com.example.friday.Rest;

import com.example.friday.Model.ComptonDao;
import com.example.friday.Model.ComptonService;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class ApiInterface {

    @GET("compton_android")
    Call<ComptonDao> getComptonModel();

    @FormUrlEncoded;
    @POST("compton")
    Call<ComptonService> postComptonModel(@Field("name") String name, @Field("email") String email);

    @FormUrlEncoded
    @PUT("compton")
    Call<ComptonService> putComptonModel (@Field("bp") String bp, @Field("name") String name, @Field("email") String email);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "compton", hasBody = true)
    Call<ComptonService> deleteComtonModel(@Field("bp") String bp);
}
