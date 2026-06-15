package com.fitness.userservice.model;

/**
 * User roles used by the application. Mapped as a string in the DB via
 * @Enumerated(EnumType.STRING) on the owning entity.
 */
public enum UserRole {
    USER,
    ADMIN
}