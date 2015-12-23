import DB.StoreDB;
import factory.Product;
import globals.Globals;

import java.util.ArrayList;

/**
 * Created by Master on 12/22/15.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Product> products;

        try {
            StoreDB db = new StoreDB();

            products =  db.initMarketProducts();
            System.out.println(products.size());

            Globals.printData(products);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
