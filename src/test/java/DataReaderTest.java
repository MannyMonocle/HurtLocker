import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataReaderTest {
    static String simple = "First2Items";
    static String hurtFile = "RawData.txt";
    static String jawn = "NAME:MilK;price:3.23;type:Food;expiration:1/17/2016";

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
    public void organizeAsLinesTest() {
        DataReader test = new DataReader();
        String output = test.organizeAsLines(jawn);
        System.out.println(output);
    }

    @Test
    public void examineOrganizedRawData()throws Exception{
        DataReader test = new DataReader();
        String raw = test.getFileAsString(hurtFile);
        String output = test.organizeAsLines(raw);
        System.out.println(output);
    }
}