package edu.sit.cashflow_buddy_rest_api.dto;

import lombok.Data;

@Data
public class UserUpdateDto {
    private String username;
    private String firstName;
    private String lastName;
}
