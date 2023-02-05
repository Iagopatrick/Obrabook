package com.example.Obrabook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Obrabook.model.Imagens;
import com.example.Obrabook.repository.ImagensRepository;

@Service
public class ImagensService {
    @Autowired
    private ImagensRepository repository;

    public Imagens getImagens(int imagemId){
        return repository.findById(imagemId).get();
    }

    public Imagens getImagensByObraId(int obraId){
        return repository.findByObraId(obraId);
    }

    public List<Imagens> getImagensByEngenheiroId(int engenheiroId){
        return repository.findByEngenheiroId(engenheiroId);
    }
}
