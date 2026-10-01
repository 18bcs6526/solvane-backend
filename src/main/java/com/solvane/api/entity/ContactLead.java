package com.solvane.api.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;

@Document(collection = "contact_leads")
@Data
public class ContactLead {

    @Id
    private String id; // MongoDB uses String for its ObjectId

    private String name;
    private String company;
    private String email;
    private String phone;
    private String requirement;
    private String budget;
    private String message;

    @CreatedDate
    @Field("created_at")
    private LocalDateTime createdAt;
}