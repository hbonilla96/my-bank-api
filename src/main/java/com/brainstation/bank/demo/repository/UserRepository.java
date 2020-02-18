package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {

    @Modifying
    @Query("update UserDTO u set u.password = :newPassword where u.userId = :userId")
    void changePassword(@Param("userId") String userId, @Param("newPassword") String newPassword);

}
