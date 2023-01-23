package com.example.Obrabook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Cliente;
import com.example.Obrabook.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "localhost:3000")
public class ClienteController {

   @Autowired
   private ClienteService service;

   @GetMapping("/cliente/{clienteId}")
   @ResponseStatus(HttpStatus.FOUND)
   public Cliente getCliente(@PathVariable int clienteId){
      return service.getClient(clienteId);
   } 

   @GetMapping("/clientes")
   public List<Cliente> getAllClients(){
      return service.findAllClient();
   }

   

   
}
