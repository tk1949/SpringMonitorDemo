package com.example.account;

import com.example.core.Monitor;
import com.example.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Monitor
    @GetMapping("account-get-{accountID}")
    public Account get(@PathVariable String accountID) {
        Account account = new Account();
        account.setAccountID(accountID);
        return account;
    }

    @Monitor
    @GetMapping("account-delete-{accountID}")
    public boolean delete(@PathVariable String accountID) {
        throw new RuntimeException("runtime");
//        return true;
    }

    @Monitor
    @PostMapping("account-add")
    public Account add(Account account) {
        return account;
    }

    @Monitor
    @PostMapping("account-update")
    public Account update(Account account) {
        return account;
    }
}
