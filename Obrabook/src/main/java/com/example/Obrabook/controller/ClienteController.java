package com.example.Obrabook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Cliente;
import com.example.Obrabook.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

   @Autowired
   private ClienteService service;

   @GetMapping("/clientes/{clienteId}")
   @ResponseStatus(HttpStatus.FOUND)
   public Cliente getCliente(@PathVariable Long clienteId){
      return service.getClient(clienteId);
   } 

   @GetMapping("/clientes")
   public List<Cliente> getAllClients(){
      return service.findAllClient();
   }

   @PutMapping
   @ResponseStatus(HttpStatus.CREATED)
   public Cliente creatCliente(@RequestBody Cliente cliente){
      return service.addCliente(cliente);
   }

   
}
