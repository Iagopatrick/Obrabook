package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "engenheiros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engenheiro {
    @Id
    private int engenheiroId;
    private String nome;
    private String email;
    private String senha;
}
