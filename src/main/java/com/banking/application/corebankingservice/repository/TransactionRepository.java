package com.banking.application.corebankingservice.repository;

import com.banking.application.corebankingservice.model.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {}

