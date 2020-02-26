package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.brainstation.bank.demo.DTO.UserDTO;

import java.util.List;
import java.util.Optional;

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

    @Query("select currency from AccountDTO a where a.id = :destinationAccount")
    String find(@Param("destinationAccount") int destinationAccount);

    List<AccountDTO> getAccountDTOByUserId(@Param("userId") int userId);
    
    List<AccountDTO> getAccountDTOByAccountNumberAndUserName(@Param("accountNumber") String accountNumber, @Param("userName") String userName);
}
