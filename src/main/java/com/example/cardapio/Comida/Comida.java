package com.example.cardapio.Comida;

import com.example.cardapio.dto.ComidaResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "comida")
@Table(name = "comida")

public class Comida {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private BigDecimal preco;
    private String imagem;

    public Comida (ComidaResponseDto data){
        this.imagem = data.imagem();
        this.preco = data.preco();
        this.texto = data.texto();
    }

}
