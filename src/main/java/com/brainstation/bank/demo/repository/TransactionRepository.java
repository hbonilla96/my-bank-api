package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.TransactionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionDTO, Long> {
}
