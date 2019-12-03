import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    static String simple = "First2Items";
    static String hurtFile = "RawData.txt";
    static String jawn = "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016";
    static String badJawn = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";

//    @Test
////    public void itemToStringTest() {
////        DataReader test = new DataReader();
////        Item item = test.turnStringIntoItem(jawn);
////        System.out.println(item.toString());
////    }
////
////    @Test
////    public void errorToStringTest() {
////        DataReader test = new DataReader();
////        Item item = test.turnStringIntoItem(badJawn);
////        System.out.println(item.toString());
////    }


}