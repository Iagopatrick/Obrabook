package com.example.Obrabook.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Obrabook.model.Cliente;
import com.example.Obrabook.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAllClient(){
        return repository.findAll();
    }

    public Cliente getClient(Long clienteId){
        return repository.findById(clienteId).get();
    }

    public Cliente addCliente(Cliente cliente) {
        cliente.setClienteId((long) Math.random());
        return repository.save(cliente);
    }


}
