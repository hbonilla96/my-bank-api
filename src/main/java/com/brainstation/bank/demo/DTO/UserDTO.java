package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "user")
public class UserDTO implements UserDetails {

    private static final long serialVersionUID = 5926468583005150707L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="user_id")
    private String userId;
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
    @Column(name = "gender")
    private String gender;

    public UserDTO(){

    }

    public UserDTO(String userId, String name, String lastName, Date birth_date, int age, String email, String address, String phoneNumber, String password, String gender) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.birth_date = birth_date;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.gender = gender;
    }

    /*This constructor converts de User to a DTO
         so the repository doesn't work with the model*/
    public UserDTO(User user){
        this.id = user.getId();
        this.userId = user.getUserId();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.birth_date = user.getBirthDate();
        this.age = user.getAge();
        this.email = user.getEmail();
        this.address = user.getAddress();
        this.phoneNumber = user.getPhoneNumber();
        this.password = user.getPassword();
        this.gender = user.getGender();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
