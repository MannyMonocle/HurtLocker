import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class DataReader {
    Integer errorCount = 0;

    public  String getFileAsString(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            return IOUtils.toString(classLoader.getResourceAsStream(fileName));
        }
        catch (Exception e) {return "Error in File";}
    }

    private String[] turnFileStringIntoStringArray(String fileName) {
        String fileAsString = getFileAsString(fileName);
        String[] items = fileAsString.split("##");
        return items;
    }

    private String[] splitIntoFieldArray(String itemAsString) {
        return itemAsString.split("[:@^*%;!]");
    }

    private Boolean isGood(String[] fields) {
        if(fields.length != 8){ errorCount++; return false; }
        for(String field : fields){ if(field.equals("")){errorCount++; return false; }}
        return true;
    }

    private Item makeItemFromFieldArray(String[] fields) {
        String name = fields[1].toLowerCase();
        String price = fields[3].toLowerCase();
        String type = fields[5].toLowerCase();
        String expiration =fields[7];

        return new Item(name,price,type,expiration);
    }

    private Item turnStringIntoItem(String itemAsString){
        String[] fields = splitIntoFieldArray(itemAsString);
        if (isGood(fields)){
            Item thing = makeItemFromFieldArray(fields);
            return thing;
        }
        System.out.println(itemAsString);
        return null;
    }

    public ArrayList<Item> turnFileIntoItemList(String fileName) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        String[] itemStrings = turnFileStringIntoStringArray(fileName);
        for(String stuff : itemStrings){
            Item item = turnStringIntoItem(stuff);
            if(item != null) {
                itemList.add(item);
            }
        }
        return itemList;
    }


}
