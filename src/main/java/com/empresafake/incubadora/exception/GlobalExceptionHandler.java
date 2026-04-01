package com.empresafake.incubadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgument(IllegalArgumentException ex) {
        Map<String, String> erro = new HashMap<>();
        erro.put("mensagem", ex.getMessage());
        erro.put("status", "400");
        
        // Retorna 400 (Bad Request) em vez do 500 (Erro Interno)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}