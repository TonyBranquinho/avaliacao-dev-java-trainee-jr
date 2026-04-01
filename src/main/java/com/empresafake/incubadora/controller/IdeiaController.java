package com.empresafake.incubadora.controller;

import com.empresafake.incubadora.model.Ideia;
import com.empresafake.incubadora.service.IdeiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ideias")
@CrossOrigin(origins = "*")
@Service
public class IdeiaController {

	@Autowired 
    private IdeiaService ideiaService;

    @PostMapping
    public Ideia adicionar(@RequestParam String titulo, @RequestParam String descricao) {
        return ideiaService.adicionarIdeia(titulo, descricao);
    }

    @GetMapping
    public List<Ideia> listar() {
        return ideiaService.listarIdeias();
    }
}
