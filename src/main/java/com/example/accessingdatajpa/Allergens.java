package com.example.accessingdatajpa;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;

@Entity
@Table(name = "allergens")
@Data
class Allergens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "meal_id")
    Meal meal;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @PrimaryKeyJoinColumn(name = "meal_id")
//    Meal meal;

    @Column(name = "peanuts")
    boolean peanuts;

    @Column(name = "celery")
    boolean celery;

    @Column(name = "sesame_seeds")
    boolean sesameSeeds;

    @Column(name = "tentno")
    String tentno;

    @Column(name = "tentname")
    String tentName;

    // standard getters and setters
}
