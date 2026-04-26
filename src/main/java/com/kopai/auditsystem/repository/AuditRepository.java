package com.kopai.auditsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kopai.auditsystem.model.Audit;

public interface AuditRepository extends JpaRepository<Audit, Long> {
}