package com.smsl.msa.contenidostreaming.repository;

import com.smsl.msa.contenidostreaming.entity.ContenidoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContenidoRepository extends MongoRepository<ContenidoEntity, String> {
}
