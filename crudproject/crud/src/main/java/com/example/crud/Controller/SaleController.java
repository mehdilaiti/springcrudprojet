package com.example.crud.Controller;

import com.example.crud.module.Categorie;
import com.example.crud.module.Sale;
import com.example.crud.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/Sales")
@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("/saveSales")
    public ResponseEntity<Sale> createSale(@RequestBody SaleDTO sale) {
        return ResponseEntity.ok(saleService.saveSale(new Sale(0,sale.quantity(),sale.amount(),sale.saleDate(),null)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> getSaleById(@PathVariable int id) {
        return ResponseEntity.ok(saleService.getSaleById(id));
    }

    @GetMapping
    public ResponseEntity<List<Sale>> getAllSales() {
        return ResponseEntity.ok(saleService.getAllSales());
    }
}
