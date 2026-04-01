package com.empresafake.incubadora.controller;

import com.empresafake.incubadora.model.Ideia;
import com.empresafake.incubadora.service.IdeiaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ideias")
@CrossOrigin(origins = "*")
public class IdeiaController {

    private IdeiaService ideiaService = new IdeiaService();

    @PostMapping
    public Ideia adicionar(@RequestParam String titulo, @RequestParam String descricao) {
        return ideiaService.adicionarIdeia(titulo, descricao);
    }

    @GetMapping
    public List<Ideia> listar() {
        return ideiaService.listarIdeias();
    }
}
