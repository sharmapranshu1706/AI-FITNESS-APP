package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank (message = "Email is Required")
    @Email (message = "Invalid Email Format")
    private String email;

    @NotBlank (message = "Password is Required")
    @Size( message = "Password must be at least 8 characters", min = 8)
    private String password;
    
    private String firstName;
    private String lastName;

}
