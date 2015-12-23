package globals;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Master on 12/23/15.
 */
public class Globals {
    public static void printData(Collection collection){
        for (int i = 0; i < collection.size(); i++) {
            Iterator it = collection.iterator();
            System.out.println(it.next().toString());
        }
    }
}
