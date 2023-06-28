package com.banking.application.corebankingservice.dto;

import com.banking.application.corebankingservice.model.AccountStatus;
import com.banking.application.corebankingservice.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
