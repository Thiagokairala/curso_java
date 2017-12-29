package com.kairala.course.services;

import com.kairala.course.models.Entrada;
import com.kairala.course.repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancasService {

    @Autowired
    private EntradaRepository entradaRepository;

    public Entrada salvarEntrada(Entrada entrada) {
        return entradaRepository.save(entrada);
    }

    public Iterable<Entrada> buscarEntradas() {
        return entradaRepository.findAll();
    }

    public void removeEntrada(Long id) {
        entradaRepository.delete(id);
    }
}
