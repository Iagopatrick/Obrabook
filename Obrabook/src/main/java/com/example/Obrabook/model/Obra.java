package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "obras")
    


public class Obra {
    @Id
    private int idObra;
    private int idCliente;
    private int idEngenheiro;
    private String nome;
    private String nomeCliente;
     
}
