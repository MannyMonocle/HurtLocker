import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataReaderTest {
    static String simple = "First2Items";
    static String hurtFile = "RawData.txt";
    static String jawn = "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016";
    static String badJawn = "naMe:;price:3.23;type:Food^expiration:1/04/2016##";

    @Test
    public void turnFileStringIntoStringArrayTest() throws Exception{
        DataReader test = new DataReader();
        String[] two = test.turnFileStringIntoStringArray(simple);
        Assert.assertEquals(2,two.length);
    }

    @Test
    public void examineSizeOfHurtLockerFile() throws Exception{
        DataReader test = new DataReader();
        String[] examine = test.turnFileStringIntoStringArray(hurtFile);
        Integer size = examine.length;
        System.out.println(size);
    }

    @Test
    public void turnStringIntoItemTest(){
        DataReader test = new DataReader();
        Item item = test.turnStringIntoItem(jawn);
        String cost = item.getPrice();
        Assert.assertEquals("3.23",cost);
    }

}