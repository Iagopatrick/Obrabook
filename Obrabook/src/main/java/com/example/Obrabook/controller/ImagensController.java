package com.example.Obrabook.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Obrabook.model.Imagens;
import com.example.Obrabook.service.ImagensService;

@RestController
@RequestMapping("/imagens")
@CrossOrigin(origins = "http://localhost:3000")
public class ImagensController {
    @Autowired
    private ImagensService service;

    @GetMapping("/{imagensId}")
    public Imagens getPhoto(@PathVariable int imagensId) {
        return service.getImagens(imagensId);
    }

    @GetMapping("/eng/{engenheiroId}")
    public List<Imagens> getPhotoByEngenheiroId(@PathVariable int engenheiroId) {
      return service.getImagensByEngenheiroId(engenheiroId);
    }
    @GetMapping("/obra/{obraId}")
    public Imagens getPhotoByObraId(@PathVariable int obraId) {
      return service.getImagensByObraId(obraId);
    }

    


}
