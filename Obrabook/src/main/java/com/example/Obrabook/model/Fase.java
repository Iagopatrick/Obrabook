package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fases")
public class Fase {
    @Id
    private int idFase;
    private String nomeDaFase;
    private int valorEsperado;
    private int valorAtual;
    private int idObra;
    private int idCliente;
    private int idEngenheiro; 
}
