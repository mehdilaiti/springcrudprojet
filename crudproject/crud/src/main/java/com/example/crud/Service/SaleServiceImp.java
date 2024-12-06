package com.example.crud.Service;
import com.example.crud.Repository.SaleRepository;
import com.example.crud.module.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class SaleServiceImp implements SaleService{

    @Autowired
    private SaleRepository saleRepository;

        @Override
        public Sale saveSale(Sale sale) {
            return saleRepository.save(sale);
        }

        @Override
        public Sale getSaleById(int id) {
            return saleRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Sale not found with id " + id));
        }

        @Override
        public List<Sale> getAllSales() {
            return saleRepository.findAll();
        }

}
