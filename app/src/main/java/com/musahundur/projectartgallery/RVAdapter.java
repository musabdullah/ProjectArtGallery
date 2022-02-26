package com.musahundur.projectartgallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ArtHolder> {

    @NonNull
    @Override
    public ArtHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row,parent,false);
        return new ArtHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ArtHolder extends RecyclerView.ViewHolder{

        public ArtHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
