package com.alfredo.android.a21pointsandroid;

public interface RestAPICallBack {
    void onGetPoints(Points points);
    void onLoginSuccess(UserToken userToken);
    void onFailure(Throwable t);
}