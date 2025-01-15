package com.smsl.msa.contenidostreaming.service;

import com.smsl.msa.contenidostreaming.entity.ContenidoEntity;
import com.smsl.msa.contenidostreaming.repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenidoService {
    @Autowired
    private ContenidoRepository contenidoRepository;

    public ContenidoEntity createContenido(ContenidoEntity contenidoEntity) {
        return contenidoRepository.save(contenidoEntity);
    }

    public List<ContenidoEntity> getAllContenidos() {
        return contenidoRepository.findAll();
    }

    public ContenidoEntity getContenidoById(String id) {
        return contenidoRepository.findById(id).orElse(null);
    }

    public ContenidoEntity updateContenido(String id, ContenidoEntity contenidoEntity) {
        contenidoEntity.setId(id);
        return contenidoRepository.save(contenidoEntity);
    }

    public void deleteContenido(String id) {
        contenidoRepository.deleteById(id);
    }
}
