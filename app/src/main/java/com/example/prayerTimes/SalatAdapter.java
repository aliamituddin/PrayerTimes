package com.example.prayerTimes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SalatAdapter extends Adapter<SalatAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SalatDataModel> filteredData;
    private OnItemClickListener listener;


    SalatAdapter(Context context2, OnItemClickListener onItemClickListener) {
        this.context = context2;
        this.listener= onItemClickListener;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.salat_row, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.salatName.setText(filteredData.get(i).getSalatName());
        viewHolder.salatTime.setText( this.filteredData.get(i).getSalatStartTime());
        if (i == 0) {
            viewHolder.salatIcon.setImageResource(R.drawable.fazr_prayer_icon);
        } else if (i == 1) {
            viewHolder.salatIcon.setImageResource(R.drawable.dhuhr_prayer_icon);
        } else if (i == 2) {
            viewHolder.salatIcon.setImageResource(R.drawable.asr_prayer_icon);
        } else if (i == 3) {
            viewHolder.salatIcon.setImageResource(R.drawable.maghrib_prayer_icon);
        } else if (i == 4) {
            viewHolder.salatIcon.setImageResource(R.drawable.isha_prayer_icon);
        }
    }
    class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        ImageView salatIcon;
        TextView salatName;
        TextView salatTime;

        ViewHolder(View view) {
            super(view);
            salatName = view.findViewById(R.id.salat_name);
            salatTime =  view.findViewById(R.id.salat_time);
            salatIcon = view.findViewById(R.id.salat_icon);

            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    SalatAdapter.this.listener.onItemClick(view, SalatAdapter.this.filteredData.get(ViewHolder.this.getAdapterPosition()), ViewHolder.this.getAdapterPosition());
                }
            });
        }
    }

    public int getItemCount() {
        return this.filteredData.size();
    }

    void addall(ArrayList<SalatDataModel> arrayList) {
        this.filteredData = arrayList;
        notifyDataSetChanged();
    }
}
