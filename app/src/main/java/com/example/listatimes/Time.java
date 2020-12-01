package com.example.listatimes;

import java.util.List;

public class Time {
    private String nome;
    private String cidadeEstado;
    private int img;
    private String titulos;

    public Time(String nome, String cidadeEstado, int img, String titulos) {
        this.nome = nome;
        this.cidadeEstado = cidadeEstado;
        this.img = img;
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }
}
