package com.example.crud.Repository;

import com.example.crud.module.Product;
import org.springframework.data.repository.CrudRepository;

public interface Productrepo extends CrudRepository <Product, Integer >{
}
