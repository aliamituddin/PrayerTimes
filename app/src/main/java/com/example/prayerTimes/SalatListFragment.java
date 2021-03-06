package com.example.prayerTimes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prayerTimes.responses.SalatResponseData;

import com.google.gson.Gson;
import java.util.ArrayList;

public class SalatListFragment extends Fragment{


    private SalatAdapter adapter;
    private ArrayList<SalatDataModel> model = new ArrayList<>();
    private SalatResponseData responseData;
    private View rootView;
    private RecyclerView rvSalat;

    private OnItemClickListener salatRowListener = new OnItemClickListener() {
        public void onItemClick(View view, Object obj, int i) {
            Toast.makeText(getContext(), "Under Construction", Toast.LENGTH_LONG).show();

        }
    };


    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rootView = layoutInflater.inflate(R.layout.fragment_salat_list, viewGroup, false);
        initView();
        return rootView;
    }

    private void initView() {

        model = new ArrayList<>();
        responseData = new SalatResponseData();
        if (getArguments() != null) {
            responseData =  new Gson().fromJson(getArguments().getString("data"), SalatResponseData.class);
        }
        rvSalat =rootView.findViewById(R.id.rvSalatList);
        rvSalat.setLayoutManager(new LinearLayoutManager(requireActivity()));
        SalatAdapter salatAdapter = new SalatAdapter(getContext(), salatRowListener);
        adapter = salatAdapter;
        rvSalat.setAdapter(salatAdapter);


        int i = 0;
        while (i < 5) {
            if (i == 0) {
                model.add(new SalatDataModel());
                model.get(i).setSalatName("Fajr");
                model.get(i).setSalatStartTime(responseData.getData().getTimings().getFajr());
                model.get(i).setSalatStartTimeInMS(Utils.dateStringToEpoch((responseData.getData().getTimings().getFajr()),"hh:mm"));

            } else if (i == 1) {
                model.add(new SalatDataModel());
                model.get(i).setSalatName("Dhuhr");
                model.get(i).setSalatStartTime(responseData.getData().getTimings().getDhuhr());
                model.get(i).setSalatStartTimeInMS(Utils.dateStringToEpoch((responseData.getData().getTimings().getDhuhr()),"hh:mm"));

            } else if (i == 2) {
                model.add(new SalatDataModel());
                (model.get(i)).setSalatName("Asr");
                model.get(i).setSalatStartTime(responseData.getData().getTimings().getAsr());
                model.get(i).setSalatStartTimeInMS(Utils.dateStringToEpoch((responseData.getData().getTimings().getAsr()),"hh:mm"));

            } else if (i == 3) {
                model.add(new SalatDataModel());
                (model.get(i)).setSalatName("Maghrib");
                (model.get(i)).setSalatStartTime(responseData.getData().getTimings().getMaghrib());
                model.get(i).setSalatStartTimeInMS(Utils.dateStringToEpoch((responseData.getData().getTimings().getMaghrib()),"hh:mm"));

            } else if (i == 4) {
                model.add(new SalatDataModel());
                (model.get(i)).setSalatName("Isha");
                (model.get(i)).setSalatStartTime(responseData.getData().getTimings().getIsha());
                model.get(i).setSalatStartTimeInMS(Utils.dateStringToEpoch((responseData.getData().getTimings().getIsha()),"hh:mm"));
            }
            (model.get(i)).setSalatId(i+1);
            i++;
        }
        adapter.addall(model);
    }


}
