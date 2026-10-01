package com.solvane.api.repository;

import com.solvane.api.entity.ContactLead;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactLeadRepository extends MongoRepository<ContactLead, String> {
}