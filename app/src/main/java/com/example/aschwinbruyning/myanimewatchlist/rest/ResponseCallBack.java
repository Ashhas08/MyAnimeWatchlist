package com.example.aschwinbruyning.myanimewatchlist.rest;

import com.example.aschwinbruyning.myanimewatchlist.model.Anime;

import java.util.ArrayList;

/**
 * Created by Aschwin Bruyning on 13-4-2018.
 */

public interface ResponseCallBack {

    public final int RESPONSE_TYPE_ANIME = 0;
    public final int RESPONSE_TYPE_ANIME_LIST = 1;

    public void OnCallSucces(Anime result, int responseType);
    public void OnCallFailed(int responseType);
}
