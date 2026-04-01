package com.empresafake.incubadora.model;

import java.util.List;

public class Ideia {
    private Long id;
    private String titulo;
    private String descricao;
    private String status;
    
    private Autor autor;
    private List<String> tags;

    public Ideia(Long id, String titulo, String descricao, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getStatus() { return status; }
    public Autor getAutor() { return autor; }
    public List<String> getTags() { return tags; }

    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setStatus(String status) { this.status = status; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public void setTags(List<String> tags) { this.tags = tags; }
}