package com.example.cardapio.controller;

import com.example.cardapio.Comida.Comida;
import com.example.cardapio.dto.ComidaResponseDto;
import com.example.cardapio.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comida")
public class ComidaController {
    @Autowired
    private ComidaRepository repository;
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PostMapping
    public void salvarComida(@RequestBody ComidaResponseDto data){
        Comida comidaData = new Comida(data);
        repository.save(comidaData);
    return;
    }

    @GetMapping
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    public List<ComidaResponseDto> gettAll() {
        List<ComidaResponseDto> comidaList = repository.findAll().stream().map(ComidaResponseDto::new).toList();
        return comidaList;

    }

}
