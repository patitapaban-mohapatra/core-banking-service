package com.banking.application.corebankingservice.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * To store third party utility payment numbers.
 * Here this core banking service will send payments
 * to defined number when user send a Utility payment
 * with a reference from the internet banking side.
 */
@Getter
@Setter
@Entity
@Table(name = "banking_core_utility_account")
public class UtilityAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String providerName;

}
