package factory;

import interfaces.IProducts;

import java.util.ArrayList;

/**
 * Created by Master on 12/23/15.
 */
public abstract class Product implements IProducts {
    private String productName;
    private double cost;
    private String barCode;


    private ArrayList<Product> products;

    @Override
    public void addToBusket(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void setCost(double price) {
        this.cost = price;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public String getBarCode() {
        return this.barCode;
    }

    @Override
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product" +
                "productName ='" + productName + '\'' +
                ", cost=" + cost +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
