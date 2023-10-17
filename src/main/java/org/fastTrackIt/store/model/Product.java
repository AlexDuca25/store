package org.fastTrackIt.store.model;

import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String product_name;
    private String product_description;
    private String product_brand;
    private int product_quantity;
    private double product_price;
    ProductType product_type;
    Category product_category;

    public Product(int product_id, String product_name, String product_description, String product_brand, int product_quantity, double product_price, ProductType product_type, Category product_category) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_brand = product_brand;
        this.product_quantity = product_quantity;
        this.product_price = product_price;
        this.product_type = product_type;
        this.product_category = product_category;
    }

    public Product(String product_name, String product_description, String product_brand, int product_quantity, double product_price, ProductType product_type, Category product_category) {
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_brand = product_brand;
        this.product_quantity = product_quantity;
        this.product_price = product_price;
        this.product_type = product_type;
        this.product_category = product_category;
    }

    public Product() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public ProductType getProduct_type() {
        return product_type;
    }

    public void setProduct_type(ProductType product_type) {
        this.product_type = product_type;
    }

    public Category getProduct_category() {
        return product_category;
    }

    public void setProduct_category(Category product_category) {
        this.product_category = product_category;
    }
}
