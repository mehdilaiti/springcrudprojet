package com.example.crud.Service;

import com.example.crud.module.Categorie;
import com.example.crud.Repository.CategorieRepo;
import com.example.crud.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImp implements CategorieService{
    @Autowired

    private CategorieRepo categorieRepository ;

    @Override

    public Categorie SaveCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    @Override

    public Categorie getCategorie(int id){
        return categorieRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found with id : " + id));

    }
    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }
    @Override
    public Categorie updateCategorie(int id, Categorie updatedCategorie) {
        Categorie existingCategorie = getCategorie(id);
        existingCategorie.setName(updatedCategorie.getName());
        return categorieRepository.save(existingCategorie);
    }

    @Override
    public void deleteCategorie(int id) {
        if (!categorieRepository.existsById(id)) {
            throw new RuntimeException("Category not found with id: " + id);
        }


            categorieRepository.deleteById(id);
        }
    }
