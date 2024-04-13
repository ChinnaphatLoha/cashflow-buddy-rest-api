package edu.sit.cashflow_buddy_rest_api.dto;

import lombok.Data;

/**
 * DTO for {@link edu.sit.cashflow_buddy_rest_api.entities.User}
 */
@Data
public class NewGoogleUserDto {
    private String userId;
    private String googleId;
    private String username;
    private String email;
    private String firstName;
    private String lastName;

    public String getUserId() {
        return "google:" + googleId;
    }
}