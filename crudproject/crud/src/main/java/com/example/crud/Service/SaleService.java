package com.example.crud.Service;

import com.example.crud.module.Sale;
import java.util.List;

public interface SaleService {
    Sale saveSale(Sale sale);

    Sale getSaleById(int id);

    List<Sale> getAllSales();
}