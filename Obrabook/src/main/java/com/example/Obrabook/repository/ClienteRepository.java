package com.example.Obrabook.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Obrabook.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
  
}
