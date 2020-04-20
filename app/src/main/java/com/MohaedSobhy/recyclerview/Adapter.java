package com.MohaedSobhy.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.MohaedSobhy.Model.UserModel;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder> {

    private List<UserModel> models;
    private Context context;

    Adapter(List<UserModel> models , Context context)
    {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String username = models.get(position).getName();
        String status = models.get(position).getStatus();
        int image = models.get(position).getImage();

        holder.userNameTextView.setText(username);
        holder.statusTextView.setText(status);
        holder.imageView.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
