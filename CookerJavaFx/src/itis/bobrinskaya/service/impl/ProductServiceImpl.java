package itis.bobrinskaya.service.impl;


import com.itis.bobrinskaya.model.Product;
import itis.bobrinskaya.service.ProductService;
import itis.bobrinskaya.web.WebLinks;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public class ProductServiceImpl implements ProductService {
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public ResponseEntity<Product> getOneProd(String name) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("name", name);
        return restTemplate.postForEntity(WebLinks.GET_PROD, params, Product.class);
    }

    @Override
    public void deleteProduct(int id) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        System.out.println(id);
        params.add("id", id);
       // restTemplate.delete(WebLinks.DELETE_PROD, params);
    }

    @Override
    public void createProd(Product product) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("product", product);
//        restTemplate.postForEntity(WebLinks.EDIT_PROD, params, Product.class);
    }


    @Override
    public ResponseEntity<Product[]> getProds() {
        return restTemplate.postForEntity(WebLinks.GET_PRODS, null, Product[].class);
    }
}
