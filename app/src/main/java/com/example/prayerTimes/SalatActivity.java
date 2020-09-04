package com.example.prayerTimes;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.example.prayerTimes.responses.SalatResponseData;
import com.google.gson.Gson;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SalatActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView countDownTv;
    private SalatResponseData salatResponseData;
    private Handler handler;
    private Runnable runnable;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.topToolbar);
        countDownTv = toolbar.findViewById(R.id.next_salat_tv);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.container, new AdhanFragmentWebView(), SalatListFragment.class.getCanonicalName()).
                        show(new AdhanFragmentWebView()).
                        addToBackStack(SalatListFragment.class.getCanonicalName()).
                        commit();
            }
        });
        new WebCallThread().start();
    }

    class WebCallThread extends Thread {
        WebCallThread() {
        }

        public void run() {
            try {
                Response execute = new OkHttpClient().newCall(new Request.Builder().url("https://aladhan.p.rapidapi.com/timingsByCity?method=5&school=1&city=dhaka&country=bn").get().addHeader("x-rapidapi-host", "aladhan.p.rapidapi.com").addHeader("x-rapidapi-key", "d34cdd5d5bmshfc5f286d2deaf1cp188ae0jsn0446ce127f14").build()).execute();
                salatResponseData = new Gson().fromJson(execute.body().string(), SalatResponseData.class);

                SalatListFragment salatListFragment = new SalatListFragment();
                Bundle bundle = new Bundle();
                bundle.putString("data", new Gson().toJson(salatResponseData));
                salatListFragment.setArguments(bundle);
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.container, salatListFragment, SalatListFragment.class.getCanonicalName()).
                        show(salatListFragment).
                        addToBackStack(SalatListFragment.class.getCanonicalName()).
                        commit();

                findNextSalatName();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void findNextSalatName() {

        Calendar calendar = Calendar.getInstance();
        long time = 0;
        String nextSalatName = "";
        Calendar today = Calendar.getInstance();
        if (today.getTimeInMillis() < Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getFajr()), "dd MMM yyyy HH:mm")) {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getFajr()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Fazr ";
        } else if (today.getTimeInMillis() < Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getDhuhr()), "dd MMM yyyy HH:mm")) {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getDhuhr()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Dhuhr ";
        } else if (today.getTimeInMillis() < Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getAsr()), "dd MMM yyyy HH:mm")) {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getAsr()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Asr ";
        } else if (today.getTimeInMillis() < Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getMaghrib()), "dd MMM yyyy HH:mm")) {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getMaghrib()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Maghrib ";
        } else if (today.getTimeInMillis() < Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getIsha()), "dd MMM yyyy HH:mm")) {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getIsha()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Isha";
        } else {
            time = Utils.dateStringToEpoch((salatResponseData.getData().getDate().getReadable() + " " + salatResponseData.getData().getTimings().getMidnight()), "dd MMM yyyy HH:mm")-today.getTimeInMillis();
            nextSalatName = "Midnight";
        }

        try {
            startTimer(time, nextSalatName);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }

    public void startTimer(final long time, final String nextSalatName) throws ParseException {
        final Date futureDate = new Date();
        futureDate.setTime(time);

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                CountDownTimer cdt = new CountDownTimer(time, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        long days = TimeUnit.MILLISECONDS.toDays(millisUntilFinished);
                        millisUntilFinished -= TimeUnit.DAYS.toMillis(days);

                        long hours = TimeUnit.MILLISECONDS.toHours(millisUntilFinished);
                        millisUntilFinished -= TimeUnit.HOURS.toMillis(hours);

                        long minutes = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
                        millisUntilFinished -= TimeUnit.MINUTES.toMillis(minutes);

                        long seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);

                        countDownTv.setText(String.format("Next Salat:%s  %02d:%02d:%02d", nextSalatName, hours, minutes, seconds));
                        if(nextSalatName.equalsIgnoreCase("midnight")){
                            countDownTv.setText(String.format("%s %02d:%02d:%02d", nextSalatName, hours, minutes, seconds));

                        }
                    }

                    @Override
                    public void onFinish() {
                        findNextSalatName();

                        AdhanFragmentWebView webView = new AdhanFragmentWebView();
                        Bundle b=new Bundle();
                        if(nextSalatName.equalsIgnoreCase("fazr"))
                            b.putBoolean("wakt",true);
                        else{
                            b.putBoolean("wakt",false);
                        }
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.container, webView , AdhanFragmentWebView.class.getCanonicalName()).
                                show(webView).
                                addToBackStack(AdhanFragmentWebView.class.getCanonicalName()).
                                commit();
                    }
                };
                cdt.start();
            }
        });
    }
}
