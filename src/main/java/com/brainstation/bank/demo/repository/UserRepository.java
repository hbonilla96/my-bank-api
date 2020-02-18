package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO, Long> {
}
