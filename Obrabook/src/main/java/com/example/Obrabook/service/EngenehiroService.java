package com.example.Obrabook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Obrabook.model.Engenheiro;
import com.example.Obrabook.repository.EngenheiroRepository;

@Service
public class EngenehiroService {
    @Autowired
    private EngenheiroRepository repository;

    public Engenheiro getEngenheiro(int engenheiroId){
        return repository.findById(engenheiroId).get();
    }


    
}
