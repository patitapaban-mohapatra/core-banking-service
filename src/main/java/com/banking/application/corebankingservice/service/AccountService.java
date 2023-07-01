package com.banking.application.corebankingservice.service;

import com.banking.application.corebankingservice.dto.BankAccount;
import com.banking.application.corebankingservice.dto.UtilityAccount;
import com.banking.application.corebankingservice.model.entity.BankAccountEntity;
import com.banking.application.corebankingservice.model.entity.UtilityAccountEntity;
import com.banking.application.corebankingservice.model.mapper.BankAccountMapper;
import com.banking.application.corebankingservice.model.mapper.UtilityAccountMapper;
import com.banking.application.corebankingservice.repository.BankAccountRepository;
import com.banking.application.corebankingservice.repository.UtilityAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}
