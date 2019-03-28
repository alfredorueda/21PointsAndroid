package com.alfredo.android.a21pointsandroid;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RestAPIService {
    @GET("/api/points/{id}")
    Call<Points> getPointsById(@Path("id") Integer id, @Header("Authorization") String token);
    @POST("/api/authenticate")
    Call<UserToken> requestToken(@Body UserData userData);
    @POST("/api/register")
    Call<Void> register(@Body UserData userData);
}