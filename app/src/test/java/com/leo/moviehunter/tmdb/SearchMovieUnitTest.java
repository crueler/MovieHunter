package com.leo.moviehunter.tmdb;

import com.leo.moviehunter.tmdb.response.SearchMovie;
import com.leo.moviehunter.tmdb.response.SearchMovie.Results;
import com.leo.moviehunter.tmdb.service.TMDBService;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchMovieUnitTest {

    private TMDBService mService;

    @Before
    public void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TMDBConstants.TMDB_API_3_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mService = retrofit.create(TMDBService.class);
    }

    @Test
    public void searchMovie() throws Exception {
        System.out.println("start test");

        Call<SearchMovie> call = mService.searchMovie(TMDBConstants.TMDB_API_KEY, "Jack ", "en", 1, false, 2016);

        Response<SearchMovie> response = call.execute();

        System.out.println("response successful: " + response.isSuccessful());

        SearchMovie searchMovie = response.body();
        for (Results result : searchMovie.results) {
            System.out.println("title: " + result.title + ", overview: " + result.overview);
        }

        Assert.assertTrue(response.isSuccessful());
    }
}


