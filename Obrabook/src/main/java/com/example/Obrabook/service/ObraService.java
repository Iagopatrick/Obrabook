package com.example.Obrabook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.example.Obrabook.model.Engenheiro;
import com.example.Obrabook.model.Fase;
import com.example.Obrabook.model.Obra;
import com.example.Obrabook.repository.EngenheiroRepository;
import com.example.Obrabook.repository.FaseRepository;
import com.example.Obrabook.repository.ObraRepository;

@Service
public class ObraService {
    @Autowired
    private ObraRepository repository;
    @Autowired 
    private FaseRepository faseRepository;
    @Autowired
    private EngenheiroRepository engenheiroRepository;

    public List<Obra> findAllObras(){
        return repository.findAll();
    }

    public Obra getObra(int obraId){
        return repository.findById(obraId).get();
    }

    public List<Fase> getFases(int obraId){
        return faseRepository.findAllByObraId(obraId);
    }

    public Engenheiro getEngenheiro(int engenheiroId){
        return engenheiroRepository.findByEngenheiroId(engenheiroId);
    }

    public Obra updateObra(int id, Obra updatedObra) {
        Obra obra = repository.findById(id).get();
        if (obra == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Obra com id " + id + " não encontrada");
        }
        // atualiza os campos da obra com os valores do updatedObra
        obra.setNome(updatedObra.getNome());
        obra.setEngenheiroId(updatedObra.getEngenheiroId());
        // ...
        return repository.save(obra);
    }
    
}
