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
    ResponseEntity<Account> register(@RequestBody User user){
        User newUser = userRepository.save(user);

        Account account = accountRepository.getAccountByUserId(newUser.getId());
        return new ResponseEntity<Account>(account, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    ResponseEntity<Account> login(@RequestBody User user){
        User returnedUser = userRepository.getUser(user);

        Account account = accountRepository.getAccountByUserId(returnedUser.getId());
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
}