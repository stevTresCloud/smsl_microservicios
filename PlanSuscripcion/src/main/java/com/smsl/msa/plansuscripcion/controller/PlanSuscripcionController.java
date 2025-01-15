package com.smsl.msa.plansuscripcion.controller;

import com.smsl.msa.plansuscripcion.entity.PlanSuscripcionEntity;
import com.smsl.msa.plansuscripcion.service.PlanSuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planes-suscripcion")
public class PlanSuscripcionController {

    @Autowired
    private PlanSuscripcionService planSuscripcionService;

    public PlanSuscripcionController(PlanSuscripcionService planSuscripcionService) {
        this.planSuscripcionService = planSuscripcionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PlanSuscripcionEntity> getAllPlanSuscripciones() {
        return planSuscripcionService.getAllPlanSuscripciones();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PlanSuscripcionEntity getPlanSuscripcionById(Long id) {
        return planSuscripcionService.getPlanSuscripcionById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PlanSuscripcionEntity createPlanSuscripcion(@RequestBody PlanSuscripcionEntity planSuscripcionEntity) {
        return planSuscripcionService.createPlanSuscripcion(planSuscripcionEntity);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PlanSuscripcionEntity updatePlanSuscripcion(@PathVariable Long id, @RequestBody PlanSuscripcionEntity planSuscripcionEntity) {
        return planSuscripcionService.updatePlanSuscripcion(id, planSuscripcionEntity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlanSuscripcion(@PathVariable Long id) {
        planSuscripcionService.deletePlanSuscripcion(id);
    }
}
