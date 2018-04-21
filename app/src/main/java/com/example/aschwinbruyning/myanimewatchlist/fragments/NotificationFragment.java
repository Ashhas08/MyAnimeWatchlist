package com.example.aschwinbruyning.myanimewatchlist.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aschwinbruyning.myanimewatchlist.R;

/**
 * Created by Aschwin Bruyning on 14-4-2018.
 */

public class NotificationFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notifications, null);
    }
}
