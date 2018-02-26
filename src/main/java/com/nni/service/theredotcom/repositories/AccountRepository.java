package com.nni.service.theredotcom.repositories;

import com.nni.service.theredotcom.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account getAccountByUserId(Long userId);
}
