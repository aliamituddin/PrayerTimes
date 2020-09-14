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
    public void onResume() {
        super.onResume();
        ((SalatActivity) requireActivity()).hideToolBar(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        ((SalatActivity) requireActivity()).hideToolBar(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_adhan_web_view, container, false);
        WebView wv = rootView.findViewById(R.id.wv_adhan);

        if(getArguments()!=null && getArguments().getBoolean("wakt"))
            wv.loadUrl("https://r5---sn-h557sns7.googlevideo.com/videoplayback?expire=1600097252&ei=hDdfX9WQCMa71gKA-ZfgDQ&ip=95.174.67.50&id=o-AJQKGP-8NBxCTKJ3ACMhKQMePwP_0hbVjQK5w7L9yCqk&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&gir=yes&clen=8331371&ratebypass=yes&dur=187.268&lmt=1540723193245110&fvip=1&c=WEB&txp=5431432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgAZrxUjcD0zHlQGTaUSf92BaHPq6DnpmSZ9TXbga6WggCIEfu4D9jnUXCTussHKsm-IpE1d1wIYpX0a1InSjpz7A7&video_id=bFaIHrol5ck&title=Fajr+Adhan&rm=sn-4g5ele7e&fexp=23812955&req_id=cd1c927c9c83a3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-jputapo3jvhcq-q5je7e&cms_redirect=yes&mh=zS&mip=103.125.28.148&mm=29&mn=sn-h557sns7&ms=rdu&mt=1600075603&mv=m&mvi=1&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAPoo--OCloOalL9urFU0FBP8Skikx0KIu_cq5bAHh2ryAiAlaXcCiyoMOeUcR1lPpF4_AgIBxJZHq70WG7MLVCkhQQ%3D%3D&ir=1&rr=12");
        else
            wv.loadUrl("https://r3---sn-h557snlz.googlevideo.com/videoplayback?expire=1600097148&ei=GzdfX8zjO-6vmLAPn8-qSA&ip=123.108.90.158&id=o-AKtUgY8ECoIg9s8nqwyg--6PV80JZCvDl8auWdmCIopE&itag=18&source=youtube&requiressl=yes&gcr=bd&vprv=1&mime=video%2Fmp4&gir=yes&clen=7476064&ratebypass=yes&dur=238.190&lmt=1597607594895894&fvip=3&c=WEB&txp=5432434&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cgcr%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAInwKLQCAlNnchRbu4MN6bnTtlQMDGnC4AYw2frrUCbjAiEA63jsiO7EbXzf-RqyKRJZX0t2fts-6pO8-CcgjnD8HBk%3D&video_id=9Y-8AtTDx20&title=Most+Beautiful+Azan+Ever+Heard.+Subscribe.&rm=sn-n5hvoapoxcq-q5je7s,sn-nposz7s&req_id=585b699f62a6a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mh=va&mip=103.125.28.148&mm=29&mn=sn-h557snlz&ms=rdu&mt=1600075488&mv=m&mvi=3&pl=24&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhANMuuWTcf7bmDiFCcFrLPBSvOWFq9Zkzo5tLTE4iZigoAiEAktG0Mrgy-O6f-huZACEC5hoOA-5V3Y-o2zkQaB5n2pQ%3D");
        return  rootView;
    }
}
