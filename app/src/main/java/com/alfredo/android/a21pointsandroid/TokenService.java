package com.alfredo.android.a21pointsandroid;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TokenService {
    @POST("/api/authenticate")
    Call<UserToken> requestToken(@Body UserData userData);
    @POST("/api/register")
    Call<Void> register(@Body UserData userData);
}