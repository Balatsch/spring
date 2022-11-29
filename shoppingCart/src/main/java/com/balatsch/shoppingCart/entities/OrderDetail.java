package com.balatsch.shoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    Orders orders;

    @ManyToMany
    Set<Book> book;

    @NotBlank(message = "quantity is mandatory ")
    Integer quantity;

    @NotBlank
    BigDecimal subTotal;

}
