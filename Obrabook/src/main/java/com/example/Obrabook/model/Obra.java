package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "obras")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Obra {
    @Id
    private int obraId;
    private int clienteId;
    private int engenheiroId;
    private String nome;
    private String nomeCliente;
     
}
