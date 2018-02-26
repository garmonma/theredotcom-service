package com.nni.service.theredotcom.repositories;

import com.nni.service.theredotcom.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUser(User user);
}
