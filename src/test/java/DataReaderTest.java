import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataReaderTest {
    static String simple = "First2Items";
    static String hurtFile = "RawData.txt";
    static String jawn = "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016";
    static String badJawn = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";
    static String anotha = "naME:BreaD;price:1.23;type:Food;expiration:1/02/2016";

//    @Test
//    public void turnFileStringIntoStringArrayTest() {
//        DataReader test = new DataReader();
//        String[] two = test.turnFileStringIntoStringArray(simple);
//        Assert.assertEquals(2,two.length);
//    }
//
//    @Test
//    public void turnFileStringIntoStringArrayLook() {
//        DataReader test = new DataReader();
//        String[] two = test.turnFileStringIntoStringArray(simple);
//        for(String item : two){System.out.println(item);}
//    }
//
//    @Test
//    public void examineSizeOfHurtLockerFile() {
//        DataReader test = new DataReader();
//        String[] examine = test.turnFileStringIntoStringArray(hurtFile);
//        Integer size = examine.length;
//        System.out.println(size);
//    }
//
//    @Test
//    public void turnStringIntoItemTest() {
//        DataReader test = new DataReader();
//        Item item = test.turnStringIntoItem(jawn);
//        String cost = item.getPrice();
//        Assert.assertEquals("3.23",cost);
//    }
//
//    @Test
//    public void turnStringIntoItemTest2() {
//        DataReader test = new DataReader();
//        Item item = test.turnStringIntoItem(anotha);
//        String cost = item.getPrice();
//        Assert.assertEquals("1.23",cost);
//    }
//
//    @Test
//    public void turnStringIntoErroredItemTest() {
//        DataReader test = new DataReader();
//        Item item = test.turnStringIntoItem(badJawn);
//        String cost = item.getPrice();
//        Assert.assertEquals("3.23",cost);
//        System.out.println(item);
//    }

    @Test
    public void fileIntoItemsSimpleTest() {
        DataReader test = new DataReader();
        ArrayList<Item> items = test.turnFileIntoItemList(simple);
        Assert.assertEquals(2,items.size());
    }

    @Test
    public void fileIntoItemsHurtTest() {
        DataReader test = new DataReader();
        ArrayList<Item> items = test.turnFileIntoItemList(hurtFile);
        Assert.assertEquals(24,items.size());
    }



}