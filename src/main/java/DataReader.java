import org.apache.commons.io.IOUtils;

public class DataReader {

    public  String getFileAsString(String fileName) throws  Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        return result;
    }

    public String[] turnFileStringIntoStringArray(String file) throws Exception{
        String fileAsString = getFileAsString(file);
        String[] items = fileAsString.split("##");
        return items;
    }

    public String organizeAsLines(String itemAsString){
        String formated = itemAsString.replaceAll("[:@^*%;]","\n");
        return formated;
    }



}
