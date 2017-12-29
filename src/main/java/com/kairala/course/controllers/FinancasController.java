package com.kairala.course.controllers;

import com.kairala.course.models.Entrada;
import com.kairala.course.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/financas")
public class FinancasController {

    @Autowired
    private FinancasService financasService;

    @PostMapping
    public Entrada criarEntrada(@RequestBody Entrada entrada) {
        return financasService.salvarEntrada(entrada);
    }

    @GetMapping
    public Iterable<Entrada> buscarEntradas() {
        return financasService.buscarEntradas();
    }

    @PutMapping
    public Entrada atualizaEntrada(@RequestBody Entrada entrada) {
        return financasService.salvarEntrada(entrada);
    }

    @DeleteMapping("/{id}/")
    public String removeEntrada(@PathVariable("id") Long id) {
        financasService.removeEntrada(id);
        return "Removido com sucesso";
    }
}
