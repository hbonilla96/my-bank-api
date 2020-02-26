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

    @Query("select balance from AccountDTO a where a.accountNumber = :accountNumber")
    int findAllByAccountNumber(@Param("accountNumber") String accountNumber);

    @Modifying
    @Query("update AccountDTO a set a.balance = a.balance + :transferAmount where a.accountNumber = :destinationAccount")
    void updateBalanceDestination(@Param("transferAmount") int transferAmount,@Param("destinationAccount") String destinationAccount);

    @Modifying
    @Query("update AccountDTO a set a.balance = a.balance - :transferAmount where a.accountNumber = :originAccount")
    void updateBalanceOrigin(@Param("transferAmount") int transferAmount,@Param("originAccount") String originAccount);

    @Query("select currency from AccountDTO a where a.accountNumber = :destinationAccount")
    String find(@Param("destinationAccount") String destinationAccount);

    List<AccountDTO> getAccountDTOByUserId(@Param("userId") int userId);
    
    List<AccountDTO> getAccountDTOByAccountNumberAndUserName(@Param("accountNumber") String accountNumber, @Param("userName") String userName);
}
