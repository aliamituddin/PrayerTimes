package com.example.prayerTimes;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.example.prayerTimes.responses.SalatResponseData;
import com.google.gson.Gson;
import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SalatActivity extends AppCompatActivity {

    private Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.topToolbar);

        new WebCallThread().start();
    }

    class WebCallThread extends Thread {
        WebCallThread() {
        }

        public void run() {
            try {
                Response execute = new OkHttpClient().newCall(new Request.Builder().url("https://aladhan.p.rapidapi.com/timingsByCity?method=5&school=1&city=dhaka&country=bn").get().addHeader("x-rapidapi-host", "aladhan.p.rapidapi.com").addHeader("x-rapidapi-key", "d34cdd5d5bmshfc5f286d2deaf1cp188ae0jsn0446ce127f14").build()).execute();
                SalatResponseData salatResponseData =new Gson().fromJson(execute.body().string(), SalatResponseData.class);
                SalatListFragment salatListFragment = new SalatListFragment();
                Bundle bundle = new Bundle();
                bundle.putString("data", new Gson().toJson(salatResponseData));
                salatListFragment.setArguments(bundle);
                SalatActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.container, salatListFragment, SalatListFragment.class.getCanonicalName()).show(salatListFragment).addToBackStack(SalatListFragment.class.getCanonicalName()).commit();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
