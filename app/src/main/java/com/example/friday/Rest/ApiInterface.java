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

    @GET("todos")
    Call<ComptonOperation> getComptonModel();

//    @FormUrlEncoded;
//    @POST("compton")
//    Call<ComptonView> postComptonModel(@Field("userId") String userId, @Field("id") String id,
//                                       @Field("title") String title, @Field("completed") String completed);
//
//    @FormUrlEncoded
//    @PUT("compton")
//    Call<ComptonView> putComptonModel (@Field("id") String id, @Field("title") String title, @Field("completed") String completed);
//
//    @FormUrlEncoded
//    @HTTP(method = "DELETE", path = "compton", hasBody = true)
//    Call<ComptonView> deleteComtonModel(@Field("id") String id);
}
