package com.MohaedSobhy.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Holder extends RecyclerView.ViewHolder {

    public CircleImageView imageView;
    public TextView userNameTextView;
    public TextView statusTextView;

    public Holder(View itemView){
        super(itemView);

        imageView = itemView.findViewById(R.id.image_circle);
        userNameTextView = itemView.findViewById(R.id.username_text_view);
        statusTextView = itemView.findViewById(R.id.status_text_view);
    }
}
