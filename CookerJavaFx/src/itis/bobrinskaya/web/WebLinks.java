package itis.bobrinskaya.web;

/**
 * Created by Ekaterina on 27.05.2016.
 */
public interface WebLinks {
    String DOMAIN = "http://localhost:8080/api";
    String SIGN_IN = DOMAIN + "/login";
    String GET_PRODS = DOMAIN + "/getProds";
    String GET_NAMES = DOMAIN + "/getNames";
    String GET_PROD = DOMAIN + "/getProd";
    String DELETE_PROD = DOMAIN + "/deleteProd";
    String EDIT_PROD = DOMAIN + "/editProd";
}
