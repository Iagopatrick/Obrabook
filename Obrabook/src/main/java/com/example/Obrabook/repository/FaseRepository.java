package com.example.Obrabook.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Obrabook.model.Fase;

@Repository
public interface FaseRepository extends MongoRepository<Fase, Integer>{

    List<Fase> findAllByObraId(int obraId);
}
