package com.balatsch.shoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;
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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @UniqueElements(message = "Title is already used")
    @NotBlank(message = "Title is mandatory ")
    @Size(min = 10,max = 128)
    String title;

    @Size(min = 3,max = 64)
    String author;

    @Size(max = 2000)
    String description;

    @Size(min = 10,max = 15)
    String isbn;
    String image;
    BigDecimal price;
    Date publishDate;
    Date lastUpdateTime;


    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

}
