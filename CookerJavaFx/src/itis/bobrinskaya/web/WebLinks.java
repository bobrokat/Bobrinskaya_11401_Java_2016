package itis.bobrinskaya.web;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public interface WebLinks {
    String DOMAIN = "http://localhost:8080/api";
    String SIGN_IN = DOMAIN + "/login";
    String GET_PRODS = DOMAIN + "/getProds";
    String DELETE_PROD = DOMAIN + "/deleteProd";
    String ADD_PROD = DOMAIN  + "/addProd";
}
