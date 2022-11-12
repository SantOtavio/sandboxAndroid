package com.example.recyclerviewcomjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class JogoAdapter extends RecyclerView.Adapter<JogoViewHolder> {

    private Context context;
    private ArrayList<Jogo> itens;
    private String text;
    private MyClick click;

    public JogoAdapter(Context context, ArrayList<Jogo> itens, MyClick click) {
        this.context = context;
        this.itens = itens;
        this.click = click;
    }

    @NonNull
    @Override
    public JogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jogo_linha, parent, false);
        JogoViewHolder viewHolder = new JogoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JogoViewHolder holder, int position) {
        Jogo jogo = itens.get(position);
        holder.nome.setText(jogo.getNome());
        holder.plataforma.setText(jogo.getPlataforma());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.click(view, itens.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
