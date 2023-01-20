package com.example.Obrabook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Obrabook.model.Engenheiro;

@Repository
public interface EngenheiroRepository extends MongoRepository<Engenheiro, Integer> {
    
}
