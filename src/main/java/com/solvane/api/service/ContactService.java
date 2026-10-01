package com.solvane.api.service;

import com.solvane.api.dto.ContactLeadDto;
import com.solvane.api.entity.ContactLead;
import com.solvane.api.repository.ContactLeadRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContactService {

    private final ContactLeadRepository repository;

    public void processNewLead(ContactLeadDto dto) {
        log.info("Processing new contact lead from: {}", dto.getEmail());

        ContactLead lead = new ContactLead();
        lead.setName(dto.getName());
        lead.setCompany(dto.getCompany());
        lead.setEmail(dto.getEmail());
        lead.setPhone(dto.getPhone());
        lead.setRequirement(dto.getRequirement());
        lead.setBudget(dto.getBudget());
        lead.setMessage(dto.getMessage());

        repository.save(lead);
        log.info("Successfully saved lead for company: {}", dto.getCompany());
    }
}