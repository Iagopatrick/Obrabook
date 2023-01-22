package com.example.Obrabook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Obrabook.model.Obra;
import com.example.Obrabook.repository.ObraRepository;

@Service
public class ObraService {
    @Autowired
    private ObraRepository repository;

    public List<Obra> findAllObras(){
        return repository.findAll();
    }

    public Obra getObra(int obraId){
        return repository.findById(obraId).get();
    }

    public List<Obra> findByClienteId(int clienteId){
        return repository.findByClienteId(clienteId);
    }

    
}
