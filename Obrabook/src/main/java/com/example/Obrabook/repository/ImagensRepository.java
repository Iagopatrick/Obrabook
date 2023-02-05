package com.example.Obrabook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Obrabook.model.Imagens;

@Repository
public interface ImagensRepository extends MongoRepository<Imagens, Integer> {
    Imagens findByObraId(int obraId);

    List<Imagens> findByEngenheiroId(int engenheiroId);
}
