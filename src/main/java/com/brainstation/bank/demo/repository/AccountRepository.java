package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDTO, Long> {
    @Query("select 1  from AccountDTO a where a.userId = :userId and a.accountNumber = :accountNumber")
    String countAccountDTO(@Param("userId") int userId, @Param("accountNumber") String accountNumber);
}
