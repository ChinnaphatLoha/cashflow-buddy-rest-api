package edu.sit.cashflow_buddy_rest_api.dto;

import edu.sit.cashflow_buddy_rest_api.entities.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link edu.sit.cashflow_buddy_rest_api.entities.Transaction}
 */
@Data
public class TransactionDto {
    private final String transactionId;
    private final String accountAccountId;
    private final BigDecimal amount;
    private final String description;
    private final Category category;
    private final Instant date;
}