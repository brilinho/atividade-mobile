package com.senai.xarantpreferencs.entidades;

import java.util.Objects;

public class course {

    private long id;

    private String nome;

    private int quantidade;

    public course(long id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        course course = (course) o;
        return id == course.id && nome.equals(course.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
