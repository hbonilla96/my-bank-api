package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteAccountRepository extends JpaRepository<FavoriteAccountDTO, Long> {
}
