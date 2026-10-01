package com.solvane.api.controller;

import com.solvane.api.dto.ContactLeadDto;
import com.solvane.api.service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<String> submitContactForm(@Valid @RequestBody ContactLeadDto leadDto) {
        contactService.processNewLead(leadDto);
        return ResponseEntity.ok("Inquiry submitted successfully");
    }
}