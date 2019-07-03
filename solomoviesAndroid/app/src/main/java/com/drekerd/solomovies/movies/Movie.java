package com.drekerd.solomovies.movies;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Movie {

    @SerializedName("id")
    private long mId;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("name")
    private String mName;
    @SerializedName("popularity")
    private String mPopularity;
    @SerializedName("thumbnailFullLink")
    private String mThumbnailFullLink;
}
