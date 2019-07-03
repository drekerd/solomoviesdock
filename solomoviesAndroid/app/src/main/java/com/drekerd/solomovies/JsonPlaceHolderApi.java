package com.drekerd.solomovies;

import com.drekerd.solomovies.movies.Movie;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @GET("year?year=2018")
    Call<List<Movie>> getMovies();
}
