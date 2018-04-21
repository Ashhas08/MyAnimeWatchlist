package com.example.aschwinbruyning.myanimewatchlist.handlers;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import com.example.aschwinbruyning.myanimewatchlist.activity.MainActivity;
import com.example.aschwinbruyning.myanimewatchlist.model.Anime;
import com.example.aschwinbruyning.myanimewatchlist.rest.API;
import com.example.aschwinbruyning.myanimewatchlist.rest.ResponseCallBack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Aschwin Bruyning on 13-4-2018.
 */

public class ApiCallHandler {
    final String BASE_URL = "https://api.jikan.moe/";
    final String BASE_URL_ANIME = "https://api.jikan.moe/anime/";
    final String ANIME_WATCHLIST = "https://myanimelist.net/malappinfo.php?u=Ashhas&status=all&type=anime";
    ArrayList<Anime> result = new ArrayList<>();
    Anime receivedShow = new Anime();

    private static ApiCallHandler handlerInstance;
    ResponseCallBack responseCallBack;

    public static ApiCallHandler getInstance() {
        if (handlerInstance == null) {
            handlerInstance = new ApiCallHandler();
        }

        return handlerInstance;
    }

    public API RetrofitApiCall(String URL) {
        Retrofit Retro = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return Retro.create(API.class);
    }

    public Anime getAnime(String animeId) {
        String url = BASE_URL_ANIME + animeId;
        Call<Anime> call = RetrofitApiCall(url).getAnime(url);

        call.enqueue(new Callback<Anime>() {
            @Override
            public void onResponse(Call<Anime> call, Response<Anime> response) {
                Log.d("Second response", response.toString());
                receivedShow.setMal_id(response.body().getMal_id());
            }


            @Override
            public void onFailure(Call<Anime> call, Throwable t) {
                Log.d("Failed", t.getMessage());
            }
        });

        return receivedShow;
    }

    public ArrayList<Anime> getAnimeList(String animeId) {
        String url = ANIME_WATCHLIST;
        Call<List<Anime>> call = RetrofitApiCall(url).getAnimeList(url);

        call.enqueue(new Callback<List<Anime>>() {
            @Override
            public void onResponse(Call<List<Anime>> call, Response<List<Anime>> response) {
                Log.d("List", response.body().toString());

            }

            @Override
            public void onFailure(Call<List<Anime>> call, Throwable t) {

            }
        });

        return result;
    }
}
