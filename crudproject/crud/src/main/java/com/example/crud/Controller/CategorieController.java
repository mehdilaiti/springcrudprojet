package com.example.crud.Controller;

import com.example.crud.Service.CategorieService;
import com.example.crud.Service.SaleService;
import com.example.crud.module.Categorie;
import com.example.crud.module.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RequestMapping("/Categorie")

@RestController
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/saveCategory")
    public ResponseEntity<Categorie> createCategorie(@RequestBody CategorieDTO categorie) {
        return ResponseEntity.ok(categorieService.SaveCategorie(new Categorie(0,categorie.name(),null)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> getCategorieById(@PathVariable int id) {
        return ResponseEntity.ok(categorieService.getCategorie(id));
    }

    @GetMapping
    public ResponseEntity<List<Categorie>> getAllCategorie() {
        return ResponseEntity.ok(categorieService.getAllCategories());
    }
}