package com.example.crud.Service;

import com.example.crud.Controller.ProductDTO;
import com.example.crud.Repository.Productrepo;
import com.example.crud.module.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimp implements ProductService {

   @Autowired
    private Productrepo repository ;
    @Autowired
    private CategorieService categorieService ;


    public Integer editProduct(Product product) {
        return repository.save(product).getId();
    }

    @Override
    public Integer saveProduct(ProductDTO product) {
        Product productToSave = new Product();
        productToSave.setName(product.name());
        productToSave.setQuantity(product.quantity());
        productToSave.setDescription(product.description());
        productToSave.setPrice(product.price());
        productToSave.setCategorie(categorieService.getCategorie(product.id()));
        return repository.save(productToSave).getId();
    }

    @Override
    public List<Product> getAllProducts() {

        return (List<Product>) repository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);

    }
}
