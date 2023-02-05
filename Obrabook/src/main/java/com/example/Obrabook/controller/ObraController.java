package com.example.Obrabook.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Fase;
import com.example.Obrabook.model.Obra;
import com.example.Obrabook.service.ObraService;

@RestController
@RequestMapping("/obras")
@CrossOrigin(origins = "http://localhost:3000")

public class ObraController {
    @Autowired
    private ObraService service;

    
    
    @GetMapping("/{obraId}")
    public Obra getObra(@PathVariable int obraId){
        return service.getObra(obraId);
    }

    @GetMapping("/{obraId}/fases")
    public List<Fase> getAllFases(@PathVariable int obraId){
        return service.getFases(obraId);
    }

   

    

}
