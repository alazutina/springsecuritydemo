package com.anna.springsecuritydemo.model;

import lombok.Data;

import com.anna.springsecuritydemo.model.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Data
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String fistName;

    @Column(name="last_name")
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    @Column(name="role")
    private Role role;

    @Enumerated(value = EnumType.STRING)
    @Column(name="status")
    private Status status;

}
