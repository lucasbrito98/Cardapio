package com.example.cardapio.repository;

import com.example.cardapio.Comida.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida, Long> {
}
