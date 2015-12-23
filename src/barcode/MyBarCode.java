package barcode;

import java.util.Random;

/**
 * Created by Master on 12/23/15.
 */
public abstract class MyBarCode {

    public static String getRandChars(){

        Random r = new Random();
        String barcode = "";
        String alphabet = "0123456789";
        for (int i = 0; i < 13; i++) {
             barcode = String.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
        }

        return barcode;
    }
}
