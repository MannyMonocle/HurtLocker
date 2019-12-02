import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class DataReader {

    public  String getFileAsString(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            return IOUtils.toString(classLoader.getResourceAsStream(fileName));
        }
        catch (Exception e) {return "Error in File";}
    }

    public String[] turnFileStringIntoStringArray(String file) {
        String fileAsString = getFileAsString(file);
        String[] items = fileAsString.split("##");
        return items;
    }

    public String[] splitIntoFieldArray(String itemAsString) {
        return itemAsString.split("[:@^*%;]");
    }

    public Item makeItemFromFieldArray(String[] fields) {
        String name = fields[1].toLowerCase();
        String price = fields[3].toLowerCase();
        String type = fields[5].toLowerCase();
        String expiration =fields[7];

        return new Item(name,price,type,expiration);
    }

    public Item turnStringIntoItem(String itemAsString){
        String[] fields = splitIntoFieldArray(itemAsString);
        return makeItemFromFieldArray(fields);
    }

    public ArrayList<Item> turnFileStringIntoItemList(String file) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        String[] itemStrings = turnFileStringIntoStringArray(file);
        for(String stuff : itemStrings){
            Item item = turnStringIntoItem(stuff);
            itemList.add(item);
        }
        return itemList;
    }
}
