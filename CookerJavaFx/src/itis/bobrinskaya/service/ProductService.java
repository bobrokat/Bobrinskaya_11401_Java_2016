package itis.bobrinskaya.service;


import com.itis.bobrinskaya.model.Product;
import org.springframework.http.ResponseEntity;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public interface ProductService {

ResponseEntity<Product[]> getProds();
    ResponseEntity<Product> getOneProd(String name);
    void deleteProduct(int id);

    void createProd(Product product);
}
