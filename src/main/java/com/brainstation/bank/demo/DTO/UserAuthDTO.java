package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.UserAuth;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "user_credential")
public class UserAuthDTO {

    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name="user_id")
    private String userId;

    public UserAuthDTO(UserAuth userAuth) {
        this.userName = userAuth.getUserName();
        this.password = userAuth.getPassword();
        this.userId = userAuth.getId();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
