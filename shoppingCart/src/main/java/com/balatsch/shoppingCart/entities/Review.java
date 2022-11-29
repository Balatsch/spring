package com.balatsch.shoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    Integer rating;

    @NotBlank(message = "Headline is mandatory ")
    @Size(min = 20,max = 128)
    String headline;

    @NotBlank
    @Size(max = 500)
    String comment;
    Date reviewTime;
}
