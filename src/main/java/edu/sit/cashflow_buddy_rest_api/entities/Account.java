package edu.sit.cashflow_buddy_rest_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Accounts", uniqueConstraints = {
        @UniqueConstraint(name = "UNIQUE_ACCOUNT_NAME_USER", columnNames = {"user_id", "name"})
})
public class Account {
    @Id
    @Column(name = "account_id", nullable = false, length = 50)
    private String accountId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ColumnDefault("0.00")
    @Column(name = "balance", nullable = false, precision = 10, scale = 2)
    private BigDecimal balance;

}