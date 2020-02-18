package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.UserAuthDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthRepository extends JpaRepository<UserAuthDTO, Long> {
}
