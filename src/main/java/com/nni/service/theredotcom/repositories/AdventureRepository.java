package com.nni.service.theredotcom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nni.service.theredotcom.domain.Adventure;

public interface AdventureRepository extends JpaRepository<Adventure, Long> {

	List<Adventure> findAllByAccountId(Long accountId);

}