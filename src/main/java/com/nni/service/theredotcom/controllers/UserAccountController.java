package com.nni.service.theredotcom.controllers;

import com.nni.service.theredotcom.domain.Account;
import com.nni.service.theredotcom.domain.Adventure;
import com.nni.service.theredotcom.domain.User;
import com.nni.service.theredotcom.repositories.AccountRepository;
import com.nni.service.theredotcom.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserAccountController {

    private final AccountRepository accountRepository;

    private final UserRepository userRepository;

    @Autowired
    public UserAccountController(AccountRepository accountRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    ResponseEntity<Account> register(@RequestBody Account account){
        User user = new User();
        user.setPassword(account.getUser().getPassword());
        user.setUsername(account.getUser().getUsername());

        User newUser = userRepository.save(user);

        account.setUser(newUser);
        Account newAccount  = accountRepository.save(account);

        return new ResponseEntity<Account>(newAccount, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    ResponseEntity<Account> login(@RequestBody User user){
        User returnedUser = userRepository.getUser(user);

        Account account = accountRepository.getAccountByUserId(returnedUser.getId());
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
}