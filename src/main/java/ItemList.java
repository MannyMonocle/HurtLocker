import java.util.ArrayList;
import java.util.HashMap;

public class ItemList {
    ArrayList<Item> ogItems;
   HashMap<String,ArrayList<String>> uniquesMap;


    public ItemList(ArrayList<Item> ogItems) {
        this.ogItems = ogItems;
        this.uniquesMap = getUniqueNames();
        addAllOGItemPrices();
    }

    public HashMap<String, ArrayList<String>> getUniqueNames(){
        HashMap<String, ArrayList<String>> names = new HashMap<String, ArrayList<String>>();
        for(Item obj : ogItems){names.put(obj.getName(),new ArrayList<String>());}
        return names;
    }

    public void addPricesToUniquesMap(Item item){
        if(!uniquesMap.containsValue(item.getPrice())){
            uniquesMap.get(item.getName()).add(item.getPrice());
        }
    }

    public void addAllOGItemPrices(){
        for(Item item : ogItems){addPricesToUniquesMap(item);}
    }

}
