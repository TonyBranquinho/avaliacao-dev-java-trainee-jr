package com.empresafake.incubadora.service;

import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import com.empresafake.incubadora.model.Ideia;


@Service
public class RelatorioService {

     public void gerarRelatorio(List<Ideia> ideiasCadastradas) {
    	 Objects.requireNonNull(ideiasCadastradas, "A lista fornecida é nula");
    	 
         for (Ideia ideia : ideiasCadastradas) {
        	 String nomeAutor = "Autor não informado";
             
             if (ideia.getAutor() != null) {
            	 nomeAutor = ideia.getAutor().getNome();
             }
             
             System.out.println("Ideia: " + ideia.getTitulo() + " | Autor: " + nomeAutor);
         }
     }
}