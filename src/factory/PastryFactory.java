package factory;

import model.Bread;
import model.Khinkali;

/**
 * Created by Master on 12/23/15.
 */
public class PastryFactory extends AbstractFactory{


    @Override
    public Product getProduct(String pastry) {
        if (pastry == null)
            return null;

        if (pastry.equalsIgnoreCase("BREAD")){
            return new Bread();
        }else if (pastry.equalsIgnoreCase("Khinkali")){
            return new Khinkali();
        }

        return null;
    }

}
