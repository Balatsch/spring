package com.balatsch.shoppingCart.entities;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @UniqueElements(message = "E-mail is already used")
    @NotBlank(message = "E-Mail is mandatory ")
    @Size(min = 10,max = 64)
    String email;

    @NotBlank(message = "Name is mandatory ")
    @Size(min = 8,max = 30)
    String fullName;

    @Size(min = 8,max = 16)
    @NotBlank(message = "Password is mandatory ")
    String password;
}
