package com.example.aschwinbruyning.myanimewatchlist.rest;

import com.example.aschwinbruyning.myanimewatchlist.model.Anime;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Aschwin Bruyning on 13-4-2018.
 */

public interface API {
    @GET
    Call<Anime> getAnime(@Url String url);

    @GET
    Call<List<Anime>> getAnimeList(@Url String url);

}
