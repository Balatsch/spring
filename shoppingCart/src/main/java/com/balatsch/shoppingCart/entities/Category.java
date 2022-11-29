package com.balatsch.shoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Entity
public class Category {
    @Id
    Long id;

    @NotBlank(message = "Category Name is mandatory ")
    @Size(min = 5,max = 30)
    String categoryName;
}
