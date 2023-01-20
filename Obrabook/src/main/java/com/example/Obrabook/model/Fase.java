package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "fases")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
