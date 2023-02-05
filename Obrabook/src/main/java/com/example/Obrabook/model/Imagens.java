package com.example.Obrabook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "imagens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Imagens {
    @Id
    private int imagemId;
    private int obraId;
    private int engenheiroId;
    private String nomeDaImagem;
    private String imagem;
}
