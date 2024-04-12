package edu.sit.cashflow_buddy_rest_api.dto;

import lombok.Data;

/**
 * DTO for {@link edu.sit.cashflow_buddy_rest_api.entities.User}
 */
@Data
public class NewGoogleUserDto {
    String userId;
    String googleId;
    String username;
    String email;
    String firstName;
    String lastName;
}