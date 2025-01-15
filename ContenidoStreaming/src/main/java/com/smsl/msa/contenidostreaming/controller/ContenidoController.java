package com.smsl.msa.contenidostreaming.controller;

import com.smsl.msa.contenidostreaming.entity.ContenidoEntity;
import com.smsl.msa.contenidostreaming.service.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contenidos")
public class ContenidoController {

    @Autowired
    private ContenidoService contenidoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ContenidoEntity> getAllContenidos() {
        return contenidoService.getAllContenidos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContenidoEntity getContenidoById(String id) {
        return contenidoService.getContenidoById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContenidoEntity createContenido(@RequestBody ContenidoEntity contenidoEntity) {
        return contenidoService.createContenido(contenidoEntity);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ContenidoEntity updateContenido(@PathVariable String id, @RequestBody ContenidoEntity contenidoEntity) {
        return contenidoService.updateContenido(id, contenidoEntity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContenido(@PathVariable String id) {
        contenidoService.deleteContenido(id);
    }
}
