package com.empresafake.incubadora.service;

import com.empresafake.incubadora.model.Ideia;
import java.util.ArrayList;
import java.util.List;

public class IdeiaService {

    private List<Ideia> ideias = new ArrayList<>();
    private Long proximoId = 1L;

    public Ideia adicionarIdeia(String titulo, String descricao) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }

        Ideia ideia = new Ideia(proximoId++, titulo, descricao, "PENDENTE");
        ideias.add(ideia);
        return ideia;
    }

    public List<Ideia> listarIdeias() {
        return ideias;
    }
}
