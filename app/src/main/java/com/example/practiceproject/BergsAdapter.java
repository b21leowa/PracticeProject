package com.example.practiceproject;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BergsAdapter extends RecyclerView.Adapter<BergsAdapter.BergsAdapterViewHolder> {

    @NonNull
    @Override
    public BergsAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BergsAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BergsAdapterViewHolder extends RecyclerView.ViewHolder {

        public BergsAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
