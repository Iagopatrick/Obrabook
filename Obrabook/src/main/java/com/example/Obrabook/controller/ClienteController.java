package com.example.Obrabook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Cliente;
import com.example.Obrabook.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

   @Autowired
   private ClienteService service;
   @GetMapping("/clientes/{clienteId}")
   public Cliente getCliente(@PathVariable Long clienteId){
      return service.getClient(clienteId);
   } 

   @GetMapping("/clientes")
   public List<Cliente> getAllClients(){
      return service.findAllClient();
   }

   
}
