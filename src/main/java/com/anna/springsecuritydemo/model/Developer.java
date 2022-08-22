package com.anna.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
@AllArgsConstructor
public class Developer {

    private  Long id;
    private  String firstName;
    private String lastName;
}
