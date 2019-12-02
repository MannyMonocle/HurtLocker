import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    static String rawData = "RawData.txt";

    public String readRawDataToString(String fileName) throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        return result;
    }

    public static void main(String[] args) throws Exception{

        String output = (new Main()).readRawDataToString(rawData);
        System.out.println(output);

    }

}
