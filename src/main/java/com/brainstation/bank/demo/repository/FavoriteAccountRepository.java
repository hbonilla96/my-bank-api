package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteAccountRepository extends JpaRepository<FavoriteAccountDTO, Long> {
    @Query("select 1  from FavoriteAccountDTO f where f.idNumber = :userId and f.accountNumber = :accountNumber")
    String countFavoriteAccountDTO(@Param("userId") String userId, @Param("accountNumber") String accountNumber);
}
