package com.example.crud.Controller;
import com.example.crud.Service.ProductServiceimp;
import org.springframework.stereotype.Service;
import com.example.crud.Service.ProductService;
import com.example.crud.module.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetails")
public class ProductController {
    @Autowired
    private ProductServiceimp productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDTO product) {

        Integer id = productService.saveProduct(product);
        return new ResponseEntity<String>("Product with'" + id + "'has been saved", HttpStatus.OK);
    }

    @GetMapping("/productList")
    public ResponseEntity<List<Product>> getAllProductDetails() {
        List<Product> list = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
    }

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {

        Product p = productService.getProductById(id);
        return new ResponseEntity<Product>(p , HttpStatus.OK);
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<String>updateProduct(@PathVariable("id")Integer id,@RequestBody ProductDTO product){
        Product pFromDb = productService.getProductById(id);
        pFromDb.setName(product.name());
        pFromDb.setPrice(product.price());
        pFromDb.setQuantity(product.quantity());
        pFromDb.setDescription(product.description());
        Integer id1 = productService.editProduct(pFromDb);
        return new ResponseEntity<String>("Student with '"+id1+"'has been updated",HttpStatus.OK);

    }
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<String>deleteProduct(@PathVariable("id")Integer id){
        productService.deleteProduct(id);
        return new ResponseEntity<String>("Product with'"+id+"'has been deleted",HttpStatus.OK);

    }


}
