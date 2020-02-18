package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class UserDTO {

    @Id
    @Column(name = "user_id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    private Date birth_date;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name="password")
    private String password;

    public UserDTO(){

    }

    /*This constructor converts de User to a DTO
     so the repository doesn't work with the model*/
    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.birth_date = user.getBirthDate();
        this.age = user.getAge();
        this.email = user.getEmail();
        this.address = user.getAddress();
        this.phoneNumber = user.getPhoneNumber();
        this.password = user.getPassword();
    }
}
