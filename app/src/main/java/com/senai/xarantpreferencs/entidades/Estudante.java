package com.senai.xarantpreferencs.entidades;

import java.util.Objects;

public class Estudante {


    private long id;

    private String nome,email,senha;

    public Estudante(long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return id == estudante.id && nome.equals(estudante.nome) && email.equals(estudante.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }
}
