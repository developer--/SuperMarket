package factory;

/**
 * Created by Master on 12/23/15.
 */
public abstract class AbstractFactory extends Product{
//    public abstract Product getMilchWare(String milchWare);
//    public abstract Pastry getPastry(String pastry);
    public abstract Product getProduct(String prodType);

}
