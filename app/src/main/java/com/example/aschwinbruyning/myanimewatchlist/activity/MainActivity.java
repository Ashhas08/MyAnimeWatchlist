package com.example.aschwinbruyning.myanimewatchlist.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aschwinbruyning.myanimewatchlist.R;
import com.example.aschwinbruyning.myanimewatchlist.fragments.HomeFragment;
import com.example.aschwinbruyning.myanimewatchlist.fragments.NotificationFragment;
import com.example.aschwinbruyning.myanimewatchlist.fragments.WatchlistFragment;
import com.example.aschwinbruyning.myanimewatchlist.handlers.ApiCallHandler;
import com.example.aschwinbruyning.myanimewatchlist.model.Anime;
import com.example.aschwinbruyning.myanimewatchlist.rest.API;
import com.example.aschwinbruyning.myanimewatchlist.rest.ResponseCallBack;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ResponseCallBack, BottomNavigationView.OnNavigationItemSelectedListener {

    ArrayList<Anime> mAnimeList;
    @BindView(R.id.message)
    TextView mTextMessage;
    @BindView(R.id.messageWatch)
    TextView watch;

    private Retrofit mRetrofit;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    //mTextMessage.setText(R.string.title_home);
//                    return true;
//                case R.id.navigation_dashboard:
//                    //mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    //mTextMessage.setText(R.string.title_notifications);
//                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiCallHandler.getInstance().getAnime("36563/");

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_dashboard:
                fragment = new WatchlistFragment();
                break;

            case R.id.navigation_notifications:
                fragment = new NotificationFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void OnCallSucces(Anime result, int responseType) {

    }

    @Override
    public void OnCallFailed(int responseType) {
        mTextMessage.setText("Fake");
    }
}
