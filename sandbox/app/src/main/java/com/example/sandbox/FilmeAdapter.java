package com.example.sandbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeViewHolder> {

    private Context context;
    private ArrayList<Filme> itens;
    private MyClick click;

    public FilmeAdapter(Context context, ArrayList<Filme> itens, MyClick click) {
        this.context = context;
        this.itens = itens;
        this.click = click;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.filme_linha, parent, false);
        FilmeViewHolder viewHolder = new FilmeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Filme filme = itens.get(position);
        holder.nome.setText(filme.getNome());
        holder.cardView.setOnClickListener(view -> click.click(view, itens.get(position), position));
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
