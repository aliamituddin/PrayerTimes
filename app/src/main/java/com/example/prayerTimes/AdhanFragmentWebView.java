package com.example.prayerTimes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdhanFragmentWebView extends Fragment {
    private View rootView;
    public AdhanFragmentWebView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_adhan_web_view, container, false);
        WebView wv = rootView.findViewById(R.id.wv_adhan);
        if(getArguments()!=null && getArguments().getBoolean("wakt"))
            wv.loadUrl("https://r2---sn-h5576n7k.googlevideo.com/videoplayback?expire=1599249204&ei=1EZSX8ngDJCR1gLexqDoBw&ip=95.174.67.50&id=304cce3b5d8b5a43&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&gir=yes&clen=6627322&ratebypass=yes&dur=287.091&lmt=1517805834789996&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgI17oqv2OhtmeOTVJbX-BuLSk7dG-QhHAd2hCJRHlcFwCIQCZHvDLOSz6imrYIrvQKOnbz3mYcXLrCLKdpRbV4PgmpA%3D%3D&video_id=MEzOO12LWkM&title=Mishary+Alafasy+Fajr+Adhan&redirect_counter=1&cm2rm=sn-jputapo3jvhcq-q5je7l&req_id=6fbc50e5ff6aa3ee&cms_redirect=yes&mh=SB&mip=103.125.28.250&mm=29&mn=sn-h5576n7k&ms=rdu&mt=1599227804&mv=m&mvi=3&pl=24&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgHYfBOJMtEtUuTqHt2djqDwCq3gTD1ShQVgIhbmBZEWUCICcwxFlyXVWy4_Zg8em_3OBV5JhtgcZXe9Fi5V9_hqdz&ir=1&rr=12");
        else
            wv.loadUrl("https://r1---sn-jputapo3jvhcq-q5je.googlevideo.com/videoplayback?expire=1599250592&ei=QExSX-6qL4-K8gSDjIGoCg&ip=192.241.67.113&id=o-ANwOqNNXTpYQuwncCJmRsiJQsOEonodTNE55Qx05IeBs&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&gir=yes&clen=19790542&ratebypass=yes&dur=261.549&lmt=1422365395102897&fvip=1&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhANA71ue5qas9vawGOSbBhqzM3k6xY4_dfMow6eNu57sTAiBJXeJ_za3Hzk9RhDDi58MpkNbl-fnNFfbl1xiwm0BD2g%3D%3D&video_id=qkcZg0tJ7Po&title=HD+-+Adhan+Al-Dhuhr+16th+August+2014+Sheikh+Daghreeree&redirect_counter=1&rm=sn-ab5ee77e&req_id=84e6528660bfa3ee&cms_redirect=yes&ipbypass=yes&mh=7d&mip=103.125.28.250&mm=31&mn=sn-jputapo3jvhcq-q5je&ms=au&mt=1599228881&mv=m&mvi=1&pcm2cms=yes&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pcm2cms,pl&lsig=AG3C_xAwRgIhAIiM2xBN_QPTF-NohgdEW6OQ2CUuYQ5uXxPvK9RLs_r6AiEA9r-B-lqZSY_kTY3J1zu-q2niGrL_48IVP74fjR3ln44%3D");
        return  rootView;
    }
}
