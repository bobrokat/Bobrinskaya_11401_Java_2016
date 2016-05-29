package itis.bobrinskaya.service;


import com.itis.bobrinskaya.model.Product;
import org.springframework.http.ResponseEntity;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public interface ProductService {

ResponseEntity<Product[]> getProds();

    void deleteProduct(String name);
    void addProd(String name, String price, String description, String type);
}
