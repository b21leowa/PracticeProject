package com.example.practiceproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BergsAdapter extends RecyclerView.Adapter<BergsAdapter.BergsAdapterViewHolder> {
    private List<String> berg;

    public BergsAdapter(List<String> berg) {
        this.berg = berg;
    }

    @NonNull
    @Override
    public BergsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new BergsAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BergsAdapterViewHolder holder, int position) {
        holder.bergsNamn.setText(berg.get(position));
    }

    @Override
    public int getItemCount() {
        return this.berg.size();
    }

    public class BergsAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView bergsNamn;
        public BergsAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            bergsNamn = itemView.findViewById(R.id.bergs_namn);
        }
    }
}
