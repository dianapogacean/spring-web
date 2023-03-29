package ro.itschool.springwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.springwebservice.model.GetProductsResponse;
import ro.itschool.springwebservice.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
        Product product1 =  new Product("cas","cas cas", 20.0, true, 200);
        Product product2 =  new Product("cas","cas cas", 20.0, true, 200);
        Product product3 =  new Product("cas","cas cas", 20.0, true, 200);
        //Arrays.asList returns an unmodifiable list. If we want to add products in a list, we use the
        //ArrayList constructor
        List<Product> storage = new ArrayList<>(Arrays.asList(product1, product2, product3));


    @GetMapping
    public GetProductsResponse getAllProducts(){

        return new GetProductsResponse(storage , "cluj");
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){

        storage.add(product);
        System.out.println("stop here for a moment");
    }
}
