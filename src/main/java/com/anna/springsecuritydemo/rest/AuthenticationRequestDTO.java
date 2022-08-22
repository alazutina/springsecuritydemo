package com.anna.springsecuritydemo.rest;

import lombok.*;

//@Data
@Setter
@Getter
public class AuthenticationRequestDTO {
    private  String email;
    private  String password;
}
