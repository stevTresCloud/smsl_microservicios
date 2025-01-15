package com.smsl.msa.plansuscripcion.repository;

import com.smsl.msa.plansuscripcion.entity.PlanSuscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanSuscripcionRepository extends JpaRepository<PlanSuscripcionEntity, Long> {
}
