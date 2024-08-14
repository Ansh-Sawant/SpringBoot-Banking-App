package com.ansh.banking_app.service;

import com.ansh.banking_app.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    void deleteAccount(Long id);

}
