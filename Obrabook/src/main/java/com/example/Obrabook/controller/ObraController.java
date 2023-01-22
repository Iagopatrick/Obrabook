package com.example.Obrabook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Obra;
import com.example.Obrabook.service.ObraService;

@RestController
@RequestMapping("/obra")
public class ObraController {
    @Autowired
    private ObraService service;
    
    @GetMapping("/obra/{nome}")
    public Obra getObra(@PathVariable int obraId){
        return service.getObra(obraId);
    }

    @GetMapping("/obra/{clienteId}")
    public List<Obra> getAllObrasClienteId(int clienteId){
        return service.findByClienteId(clienteId);
    }
}
