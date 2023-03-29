package ro.itschool.springwebservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;
    private String description;
    private double price;
    private boolean inStock;
    private int stock;
}
