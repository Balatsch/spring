package com.balatsch.shoppingCart.entities;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
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

    @Size(min = 10,max = 128)
    @NotBlank(message = "Address is mandatory ")
    String address;

    @Size(min = 3,max = 32)
    @NotBlank(message = "City is mandatory ")
    String city;

    @Size(min = 3,max = 64)
    @NotBlank(message = "Country is mandatory ")
    String country;

    @Size(min = 10,max = 15)
    @NotBlank(message = "Phone Number is mandatory ")
    String phoneNumber;

    @Size(min = 3,max = 24)
    @NotBlank(message = "Zip Code is mandatory ")
    String zipCode;

    @Size(min = 8,max = 16)
    @NotBlank(message = "Password is mandatory ")
    String password;

    @NotBlank(message = "Date is mandatory ")
    Date  registerDate;



}
