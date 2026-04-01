package com.empresafake.incubadora.service;

import com.empresafake.incubadora.model.Ideia;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class IdeiaService {

    private List<Ideia> ideias = new ArrayList<>();
    private Long proximoId = 1L;

    public Ideia adicionarIdeia(String titulo, String descricao) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }

        
        String statusFinal = "Pendente";
        if (descricao != null && descricao.toLowerCase().contains("urgente")) {
            statusFinal = "ALTA PRIORIDADE";
        }
        
        
        Ideia ideia = new Ideia(proximoId++, titulo, descricao, statusFinal);
        ideias.add(ideia);
        return ideia;
    }

    public List<Ideia> listarIdeias() {
        return ideias;
    }
}
