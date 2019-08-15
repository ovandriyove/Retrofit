package com.example.friday.Rest;

import com.example.friday.Model.ComptonOperation;
import com.example.friday.Model.ComptonView;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class ApiInterface {

    @GET("comptons")
    Call<ComptonOperation> getComptonModel();

    @FormUrlEncoded;
    @POST("compton")
    Call<ComptonView> postComptonModel(@Field("userId") String userId, @Field("email") String email);

    @FormUrlEncoded
    @PUT("compton")
    Call<ComptonView> putComptonModel (@Field("bp") String bp, @Field("name") String name, @Field("email") String email);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "compton", hasBody = true)
    Call<ComptonView> deleteComtonModel(@Field("bp") String bp);
}
