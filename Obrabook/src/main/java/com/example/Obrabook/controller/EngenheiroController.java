package com.example.Obrabook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Engenheiro;

import com.example.Obrabook.service.EngenehiroService;


@RestController
@RequestMapping("/engenheiros")
@CrossOrigin(origins = "http://localhost:3000")
public class EngenheiroController {
    @Autowired
    private EngenehiroService service;

    @GetMapping("/engenheiro/{engenheiroId}")
    public Engenheiro getEngenheiro(@PathVariable int engenheiroId){
        return service.getEngenheiro(engenheiroId);
    }

    
    
}
