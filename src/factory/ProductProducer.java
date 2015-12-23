package factory;

/**
 * Created by Master on 12/23/15.
 */
public class ProductProducer {

    public static AbstractFactory getFactory(String choice){

        if (choice.equalsIgnoreCase("MILCHWARE")){
            return new MilchWareFactory();

        }else if (choice.equalsIgnoreCase("PASTRY")){
            return new PastryFactory();
        }

        return null;
    }
}
