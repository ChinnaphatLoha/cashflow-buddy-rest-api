package edu.sit.cashflow_buddy_rest_api.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

/**
 * DTO for {@link edu.sit.cashflow_buddy_rest_api.entities.User}
 */
@Data
public class UserDto {
    String userId;
    String username;
    String email;
    String firstName;
    String lastName;
    Set<AccountDto> accounts;

    /**
     * DTO for {@link edu.sit.cashflow_buddy_rest_api.entities.Account}
     */
    @Data
    public static class AccountDto {
        String accountId;
        String name;
        BigDecimal balance;
    }
}