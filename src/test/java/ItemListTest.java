import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ItemListTest {
    static String simple = "First2Items";
    static String hurtFile = "RawData.txt";
    static String milky = "ThreeMilkItems";


    @Test
    public void keySetsFirst2ItemsTest(){
        DataReader data = new DataReader();
        ArrayList test = data.turnFileIntoItemList(simple);
        ItemList trial = new ItemList(test);
        System.out.println(trial.getUniquesMap().keySet());
        System.out.println(trial.getPriceCount().keySet());
    }

    @Test
    public void keySets3MilksTest(){
        DataReader data = new DataReader();
        ArrayList test = data.turnFileIntoItemList(milky);
        ItemList trial = new ItemList(test);
        System.out.println(trial.getUniquesMap().keySet());
        System.out.println(trial.getPriceCount().keySet());
    }

    @Test
    public void values3MilkaTest(){
        DataReader data = new DataReader();
        ArrayList test = data.turnFileIntoItemList(milky);
        ItemList trial = new ItemList(test);
    }

}