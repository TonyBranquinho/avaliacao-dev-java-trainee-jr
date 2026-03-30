package com.empresafake.service;

public class AprovacaoService {

    public String processarAprovacao(Ideia ideia, Usuario usuario) {
        String statusFinal = new String("");

        if (usuario.getNivelAcesso() == 1) {
            return null;
        }

        String t = ideia.getTitulo();

        if (t.equals("Inovacao")) {
            statusFinal = "Aprovado Especial";
        } else {
            statusFinal = "Aprovado Normal";
        }

        if (ideia.getTags().size() > 0) {
            statusFinal = statusFinal + " - Com Tags";
        }

        return statusFinal;
    }
}