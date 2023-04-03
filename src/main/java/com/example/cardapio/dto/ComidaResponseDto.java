package com.example.cardapio.dto;

import com.example.cardapio.Comida.Comida;

import java.math.BigDecimal;

public record ComidaResponseDto (Long id, String texto, BigDecimal preco, String imagem) {
    public ComidaResponseDto(Comida comida){
        this(comida.getId(),
                comida.getTexto(), comida.getPreco(), comida.getImagem());
    }
}
