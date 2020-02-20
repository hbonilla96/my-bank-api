package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDTO, Long> {

    @Query("select balance from AccountDTO a where a.id = :accountNumber")
    int findAllByAccountNumber(@Param("accountNumber") int accountNumber);

    @Modifying
    @Query("update AccountDTO a set a.balance = a.balance + :transferAmount where a.id = :destinationAccount")
    void updateBalanceDestination(@Param("transferAmount") int transferAmount,@Param("destinationAccount") int destinationAccount);

    @Modifying
    @Query("update AccountDTO a set a.balance = a.balance - :transferAmount where a.id = :originAccount")
    void updateBalanceOrigin(@Param("transferAmount") int transferAmount,@Param("originAccount") int originAccount);
}
