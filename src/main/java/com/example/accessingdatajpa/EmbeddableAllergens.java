package com.example.accessingdatajpa;

import lombok.Data;

import javax.persistence.*;

@Embeddable
@Data
class EmbeddableAllergens {

    @Column(name = "peanuts", table = "allergens")
    boolean peanuts;

    @Column(name = "celery", table = "allergens")
    boolean celery;

    @Column(name = "sesame_seeds", table = "allergens")
    boolean sesameSeeds;

    @Column(name = "tentno", table = "allergens")
    String tentno;

    @Column(name = "tentname", table = "allergens")
    String tentName;
}
