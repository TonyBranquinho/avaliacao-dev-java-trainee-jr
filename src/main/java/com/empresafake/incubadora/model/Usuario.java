package com.empresafake.incubadora.model;

public class Usuario {
	private String nome;
    private int nivelAcesso; // 1 = Comum, 2 = Gestor, etc.

    public Usuario(String nome, int nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
}

