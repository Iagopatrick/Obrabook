package com.example.Obrabook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Cliente;
import com.example.Obrabook.service.ClienteService;

@RestController
@RequestMapping("/perfil")
public class ClienteController {
/*
 É preciso colocar um botao para cada informação no perfil, ou seja, la no perfil da pessoa é preciso aparecer
    as informações da obra.
 */
   @Autowired
   private ClienteService service;


   @GetMapping
   public Cliente getCliente(@PathVariable int clienteId){
      return service.getClient(clienteId);
   } 
}
