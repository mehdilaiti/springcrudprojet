package com.example.crud.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    private String name ;
    @OneToMany
    private List<Product> product ;
}
