package com.example.crud.Service;

import com.example.crud.module.Categorie;

import java.util.List;

public interface CategorieService {

    Categorie SaveCategorie(Categorie categorie) ;
    Categorie getCategorie(int id);
    List<Categorie> getAllCategories();
    Categorie updateCategorie(int id, Categorie categorie);
    void deleteCategorie(int id);
}
