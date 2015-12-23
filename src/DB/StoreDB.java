package DB;

import factory.AbstractFactory;
import factory.Product;
import factory.ProductProducer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 12/23/15.
 */
public  class StoreDB {
    public static final String storeName = "pricelist.txt";

    InputStream ips = getClass().getResourceAsStream(storeName);


    public  ArrayList<Product> initMarketProducts() throws Exception{


        ArrayList<String> listAsString = new ArrayList<>();

        //reading
        try{;
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;

            while ((line=br.readLine())!=null){

                listAsString.add(line);
            }

            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


        return fillProductsFromList(listAsString);
    }


    private   ArrayList<Product> fillProductsFromList(List<String> list) throws Exception {

        ArrayList<Product> convertedList = new ArrayList<>();

        AbstractFactory factory;

        for (String aList : list) {
            String[] parts = aList.split(" ");
            // გავიგოთ რა ტიპის პროდუქტია;
            String productType = parts[parts.length-1];
            String productName = parts[parts.length-2];


            //დავაბრუნოთ რძის ნაწარმი ან ცომეულის;
            factory = ProductProducer.getFactory(productType);
            assert factory != null;
            Product product = factory.getProduct(productName);

            product.setCost(Double.parseDouble(parts[parts.length-3]));
            product.setProductName(productName);
            product.setBarCode(parts[parts.length-4]);

            convertedList.add(product);
        }

        return convertedList;
    }



}
