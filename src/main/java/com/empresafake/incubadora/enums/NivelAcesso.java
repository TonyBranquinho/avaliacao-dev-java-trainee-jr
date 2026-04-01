package com.empresafake.incubadora.enums;

public enum NivelAcesso {
	COMUM(1),
    GESTOR(2),
    ADMIN(3);

    private final int valor;

    NivelAcesso(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
