package com.drekerd.solomovies;

import android.telecom.Call;

import java.util.List;

import retrofit2.http.POST;

enum DownloadStatus {IDLE, PROCESSING, NOT_INITIALIZED, FAILE_OR_EMPTY, OK}

public class GetMovies{
    private static final String TAG = "GetMovies";
    private DownloadStatus mDownloadStatus;

    public GetMovies(){
        this.mDownloadStatus = DownloadStatus.IDLE;
    }



}
