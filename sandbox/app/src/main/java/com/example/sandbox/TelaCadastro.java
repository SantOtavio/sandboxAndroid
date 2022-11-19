package com.example.sandbox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;

public class TelaCadastro extends AppCompatActivity {

    private Button btnFoto;
    private Uri caminhoImagem;
    private ImageView fotoFilme;
    private Filme filme;
    private Button botaoCadastro;
    private EditText nomeFilme;
    private EditText sinopseFilme;
    private EditText editoraFilme;
    private EditText anoFilme;
    private Bitmap fotoFilmeBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        btnFoto = (Button) findViewById(R.id.botaoFoto);
        fotoFilme = findViewById(R.id.fotoFilme);
        botaoCadastro = findViewById(R.id.botaoCadastrarFilme);
        nomeFilme = findViewById(R.id.nomeFilmeText);
        sinopseFilme = findViewById(R.id.sinopseFilmeText);
        editoraFilme = findViewById(R.id.editoraFilmeText);
        anoFilme = findViewById(R.id.anoText);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarFoto();
            }
        });

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrarFilme();
            }
        });
    }

    private void cadastrarFilme() {
        filme = new Filme(nomeFilme.getText().toString(), sinopseFilme.getText().toString(), editoraFilme.getText().toString(), Integer.parseInt(anoFilme.getText().toString()), fotoFilmeBitmap);
        MainActivity.itens.add(filme);
        filme = null;
        finish();
    }

    private void selecionarFoto() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            caminhoImagem = data.getData();
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), caminhoImagem);
                fotoFilmeBitmap = bitmap;
                fotoFilme.setImageDrawable(new BitmapDrawable(bitmap));
                btnFoto.setAlpha(0);
            } catch (IOException e) {

            }
        }
    }
}