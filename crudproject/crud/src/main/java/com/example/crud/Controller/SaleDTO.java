package com.example.crud.Controller;

import java.util.Date;
import java.util.List;

public record SaleDTO(int quantity , double amount , Date saleDate) {
}
