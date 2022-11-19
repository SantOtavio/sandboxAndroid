package com.example.sandbox;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class Filme {
    private String nome;
    private String sinopse;
    private String editora;
    private Integer ano;
    private Bitmap foto;

    public Filme(String nome, String sinopse, String editora, Integer ano, Bitmap foto) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

//    public Integer getFoto() {
//        return foto;
//    }
//
//    public void setFoto(Integer foto) {
//        this.foto = foto;
//    }
}
