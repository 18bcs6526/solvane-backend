package com.solvane.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ContactLeadDto {

    @NotBlank(message = "Name is required")
    private String name;

    private String company;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone is required")
    @Pattern(regexp = "^[+0-9\\s-]{7,15}$", message = "Invalid phone format")
    private String phone;

    @NotBlank(message = "Requirement type is required")
    private String requirement;

    @NotBlank(message = "Budget range is required")
    private String budget;

    @NotBlank(message = "Message is required")
    @Size(min = 10, message = "Message must be at least 10 characters long")
    private String message;
}
