package com.smsl.msa.plansuscripcion.service;

import com.smsl.msa.plansuscripcion.entity.PlanSuscripcionEntity;
import com.smsl.msa.plansuscripcion.repository.PlanSuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanSuscripcionService {
    @Autowired
    private PlanSuscripcionRepository planSuscripcionRepository;

    public PlanSuscripcionEntity createPlanSuscripcion(PlanSuscripcionEntity planSuscripcionEntity) {
        return planSuscripcionRepository.save(planSuscripcionEntity);
    }
    public PlanSuscripcionEntity getPlanSuscripcionById(Long id) {
        return planSuscripcionRepository.findById(id).orElse(null);
    }
    public PlanSuscripcionEntity updatePlanSuscripcion(Long id, PlanSuscripcionEntity planSuscripcionEntity) {
        planSuscripcionEntity.setId(id);
        return planSuscripcionRepository.save(planSuscripcionEntity);
    }
    public List<PlanSuscripcionEntity> getAllPlanSuscripciones() {
        return planSuscripcionRepository.findAll();
    }
    public void deletePlanSuscripcion(Long id) {
        planSuscripcionRepository.deleteById(id);
    }
}
