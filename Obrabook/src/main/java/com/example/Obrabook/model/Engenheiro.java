package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "engenheiros")
public class Engenheiro {
    @Id
    private int idEngenheiro;
    private String nome;
    private String email;
    private String senha;
}
