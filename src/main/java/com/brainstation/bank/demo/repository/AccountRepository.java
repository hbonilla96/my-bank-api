package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.AccountDTO;
import com.brainstation.bank.demo.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDTO, Long> {
}
