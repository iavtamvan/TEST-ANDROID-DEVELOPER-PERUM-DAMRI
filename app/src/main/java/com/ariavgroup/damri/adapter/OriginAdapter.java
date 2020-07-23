package com.ariavgroup.damri.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ariavgroup.damri.R;
import com.ariavgroup.damri.model.DataItem;

import java.util.ArrayList;

public class OriginAdapter extends RecyclerView.Adapter<OriginAdapter.ViewHolder> {
    Context context;
    private ArrayList<DataItem> dataItems;
    private ArrayList<DataItem> search;


    public OriginAdapter(Context context, ArrayList<DataItem> dataItems) {
        this.context = context;
        this.dataItems = dataItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNameKota.setText(dataItems.get(position).getNmKota());
        holder.tvNameTerminal.setText(dataItems.get(position).getNmAsal());
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNameKota;
        private TextView tvNameTerminal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameKota = itemView.findViewById(R.id.tv_name_kota);
            tvNameTerminal = itemView.findViewById(R.id.tv_name_terminal);
        }
    }
}
