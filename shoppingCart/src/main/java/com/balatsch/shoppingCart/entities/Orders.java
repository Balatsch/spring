package com.balatsch.shoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    Date orderDate;

    @NotBlank(message = "Shipping Address is mandatory ")
    @Size(min = 20,max = 256)
    String shippingAddress;

    @NotBlank(message = "Recipient Name is mandatory ")
    @Size(min = 8,max = 30)
    String recipientName;

    @NotBlank(message = "Recipient Phone is mandatory ")
    @Size(min = 10,max = 15)
    String recipientPhone;

    @NotBlank(message = "Payment method is mandatory ")
    @Size(min = 5,max = 20)
    String paymentMethod;

    BigDecimal orderTotal;

    @NotBlank
    @Size(min = 5,max = 20)
    String orderStatus;


}
