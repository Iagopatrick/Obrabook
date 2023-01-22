package com.example.Obrabook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Obrabook.model.Fase;
import com.example.Obrabook.repository.FaseRepository;



@Service
public class FaseService {
    @Autowired
    private FaseRepository repository;

    public List<Fase> findAllFases(){
        return repository.findAll();
    }

    public Fase getFase(int faseId){
        return repository.findById(faseId).get();
    }

    public List<Fase> getAllFasesByClienteId(int cleinteId){
        return repository.findAllByClienteId(cleinteId);
    }


}
