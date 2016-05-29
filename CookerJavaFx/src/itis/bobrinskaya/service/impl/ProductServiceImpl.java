package itis.bobrinskaya.service.impl;


import com.itis.bobrinskaya.model.Product;
import itis.bobrinskaya.service.ProductService;
import itis.bobrinskaya.web.WebLinks;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ekaterina on 27.05.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {


    RestTemplate restTemplate= new RestTemplate();

    @Override
    public void deleteProduct(String name) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        System.out.println(name);
        params.add("name", name);
        restTemplate.postForEntity(WebLinks.DELETE_PROD, params, null);
    }


    @Override
    public void addProd(String name, String price, String description, String type) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("name", name);
        params.add("price", price);
        params.add("description", description);
        params.add("type", type);
        restTemplate.postForEntity(WebLinks.ADD_PROD, params, null);
    }


    @Override
    public ResponseEntity<Product[]> getProds() {
        return restTemplate.postForEntity(WebLinks.GET_PRODS, null, Product[].class);
    }
}
