package com.example.sandbox;

public class Filme {
    private String nome;
    private String categoria;
    private String indicacao;
//    private Integer foto;

    public Filme(String nome, String categoria, String indicacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.indicacao = indicacao;
//        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

//    public Integer getFoto() {
//        return foto;
//    }
//
//    public void setFoto(Integer foto) {
//        this.foto = foto;
//    }
}
