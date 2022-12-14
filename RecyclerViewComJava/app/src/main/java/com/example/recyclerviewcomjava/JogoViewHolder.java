package com.example.recyclerviewcomjava;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class JogoViewHolder extends RecyclerView.ViewHolder {

    TextView nome, plataforma;
    CardView cardView;

    public JogoViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nome);
        plataforma = itemView.findViewById(R.id.plataforma);
        cardView = itemView.findViewById(R.id.cardView);
    }
}
