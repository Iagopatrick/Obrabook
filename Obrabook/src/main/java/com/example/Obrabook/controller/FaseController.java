package com.example.Obrabook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Fase;
import com.example.Obrabook.service.FaseService;

@RestController
@RequestMapping("/perfil/fase")
public class FaseController {
    @Autowired
    private FaseService service;


    @GetMapping("/perfil/{nomeDaFase}")
    public Fase getFase(@PathVariable int faseId){
        return service.getFase(faseId);
    }
}
