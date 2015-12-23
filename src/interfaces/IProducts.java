package interfaces;

import factory.Product;


public interface IProducts {
    double getCost();

    void setCost(double price);

    String getProductName();

    void setProductName(String name);

    String getBarCode();


    void addToBusket(Product product);

    public void setBarCode(String barCode);


}
