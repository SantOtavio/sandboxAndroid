package com.example.sandbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TelaFilme extends AppCompatActivity {

    ImageView fotoFilme;
    TextView nomeFilme;
    TextView sinopseFilme;
    TextView editoraFilme;
    TextView anoFilme;
    Button botaoVolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filme);

        Intent intent = getIntent();
        Integer pos = intent.getIntExtra("position", 0);

        fotoFilme = findViewById(R.id.imagemFilme);
        nomeFilme = findViewById(R.id.nomeFilme);
        sinopseFilme = findViewById(R.id.sinopseFilme);
        editoraFilme = findViewById(R.id.editoraFilme);
        anoFilme = findViewById(R.id.anoFilme);
        botaoVolar = findViewById(R.id.btnVoltar);

        Log.println(Log.ERROR, "a", MainActivity.itens.get(pos).getFoto().toString());
        fotoFilme.setImageDrawable(new BitmapDrawable(MainActivity.itens.get(pos).getFoto()));
        nomeFilme.setText(MainActivity.itens.get(pos).getNome());
        sinopseFilme.setText(MainActivity.itens.get(pos).getSinopse());
        editoraFilme.setText(MainActivity.itens.get(pos).getEditora());
        anoFilme.setText(Integer.toString(MainActivity.itens.get(pos).getAno()));

        botaoVolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }


}