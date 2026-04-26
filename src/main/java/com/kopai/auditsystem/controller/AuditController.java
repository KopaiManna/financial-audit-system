package com.kopai.auditsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kopai.auditsystem.model.Audit;
import com.kopai.auditsystem.repository.AuditRepository;

@RestController
@RequestMapping("/audits")
public class AuditController {

    private final AuditRepository auditRepository;

    public AuditController(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @GetMapping
    public List<Audit> getAllAudits() {
        return auditRepository.findAll();
    }

    @PostMapping
    public Audit createAudit(@RequestBody Audit audit) {
        return auditRepository.save(audit);
    }
}