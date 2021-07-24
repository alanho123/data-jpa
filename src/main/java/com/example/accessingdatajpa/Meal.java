package com.example.accessingdatajpa;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "meal")
@Data
class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    BigDecimal price;

    @OneToOne(mappedBy = "meal")
    Allergens allergens;

//    @OneToMany(mappedBy = "meal")
//    List<Allergens> allergens;

    // standard getters and setters
}
