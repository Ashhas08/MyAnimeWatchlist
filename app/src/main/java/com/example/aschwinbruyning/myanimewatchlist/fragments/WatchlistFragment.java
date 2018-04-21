package com.example.aschwinbruyning.myanimewatchlist.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aschwinbruyning.myanimewatchlist.R;
import com.example.aschwinbruyning.myanimewatchlist.handlers.ApiCallHandler;
import com.example.aschwinbruyning.myanimewatchlist.model.Anime;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Aschwin Bruyning on 14-4-2018.
 */

public class WatchlistFragment extends Fragment{
    Anime timelyAnime;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View returnView = inflater.inflate(R.layout.fragment_watchlist, null);


        TextView txtOne = (TextView) returnView.findViewById(R.id.messageWatch);

       timelyAnime = ApiCallHandler.getInstance().getAnime("36563/");


        txtOne.setText(timelyAnime.getMal_id());

        return returnView;
    }
}
