package com.empresafake.incubadora.service;

import org.springframework.stereotype.Service;
import com.empresafake.incubadora.model.Ideia;
import com.empresafake.incubadora.model.Usuario;

@Service
public class AprovacaoService {

	public String processarAprovacao(Ideia ideia, Usuario usuario) {
	    if (ideia == null || usuario == null) {
	        throw new IllegalArgumentException("Ideia e usuário não podem ser nulos.");
	    }
	
	    if (usuario.getNivelAcesso() == 1) {
	    	return "REPROVADO - Sem Permissão";
	    }
	
	    String titulo = ideia.getTitulo();
	
	    if (titulo == null || titulo.isEmpty()) {
	        throw new IllegalArgumentException("Título da ideia não pode ser nulo ou vazio.");
	    }
	
	    String statusFinal;
	
	    if (titulo.equals("Inovacao")) {
	        statusFinal = "Aprovado Especial";
	    } else {
	        statusFinal = "Aprovado Normal";
	    }
	
	    if (ideia.getTags() != null && !ideia.getTags().isEmpty()) {
	        statusFinal = statusFinal + " - Com Tags";
	    }
	
	    return statusFinal;
	}
}