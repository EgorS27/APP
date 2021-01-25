package com.example.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends   RecyclerView.ViewHolder {

    ImageView flagView;
    TextView fioView;
    TextView opisaniyeView;

    // @itemView: recyclerview_item_layout.xml
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);

        this.flagView = (ImageView) itemView.findViewById(R.id.imageView_flag);
        this.fioView = (TextView) itemView.findViewById(R.id.textView_fioName);
        this.opisaniyeView = (TextView) itemView.findViewById(R.id.textView_opisaniye);
    }
}
