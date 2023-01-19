package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")

public class Cliente {
    @Id
    private int idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
}
