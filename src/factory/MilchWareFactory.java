package factory;

import interfaces.MilchWare;
import interfaces.Pastry;
import model.Cheese;
import model.Milk;


/**
 * Created by Master on 12/23/15.
 */
public class MilchWareFactory extends AbstractFactory {

    @Override
    public Product getProduct(String choice) {
        if (choice == null)
            return null;
        else if (choice.equalsIgnoreCase("MILK")){
            return new Milk();
        }else if (choice.equalsIgnoreCase("CHEESE")){
            return new Cheese();
        }

        return null;
    }


}
