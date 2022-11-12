package com.example.sandbox;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class FilmeViewHolder extends RecyclerView.ViewHolder {

    TextView nome;
//    ImageView imagem;
    CardView cardView;

    public FilmeViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nome);
        cardView = itemView.findViewById(R.id.cardView);
//        imagem = itemView.findViewById(R.id.imagemFilme);
    }
}
