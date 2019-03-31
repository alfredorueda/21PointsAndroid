package com.alfredo.android.a21pointsandroid;

public interface PointsAPICallBack extends RestAPICallBack {
    void onPostPoints(Points points);
    void onGetPoints(Points points);
}
