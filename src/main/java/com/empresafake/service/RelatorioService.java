package com.empresafake.service;

public class RelatorioService {

     public void gerarRelatorio(List<Ideia> ideiasCadastradas) {
         for (Ideia ideia : ideiasCadastradas) {
             String nomeAutor = ideia.getAutor().getNome();
             System.out.println("Ideia: " + ideia.getTitulo() + " | Autor: " + nomeAutor);
         }
     }
}