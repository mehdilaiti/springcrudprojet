package com.example.crud.Service;
import com.example.crud.Controller.ProductDTO;
import com.example.crud.module.Product;
import java.util.List;


public interface ProductService {
    public Integer saveProduct( ProductDTO product) ;
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
    public void deleteProduct(Integer id);


}
