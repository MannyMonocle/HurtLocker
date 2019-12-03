import java.util.ArrayList;
import java.util.HashMap;

public class ItemList {
    ArrayList<Item> ogItems;
    HashMap<String,ArrayList<String>> uniquesMap = new HashMap<String, ArrayList<String>>();
    HashMap<String,Integer> priceCount = new HashMap<String, Integer>();



    public ItemList(ArrayList<Item> ogItems) {
        this.ogItems = ogItems;
        getUniqueNames();
        addAllOGItemPrices();
    }

    private void getUniqueNames(){
        for(Item obj : ogItems){
            uniquesMap.put(obj.getName(),new ArrayList<String>());
            priceCount.put(obj.getKey(),0);
        }
    }

    private void addPricesToUniquesMap(Item item){
        if(!uniquesMap.containsValue(item.getPrice())) {
            uniquesMap.get(item.getName()).add(item.getPrice());
        }
        Integer currentCount = priceCount.get(item.getKey());
        currentCount++;
        priceCount.put(item.getKey(),currentCount);

    }

    private void addAllOGItemPrices(){
        for(Item item : ogItems){addPricesToUniquesMap(item);}
    }

    public HashMap<String,ArrayList<String>> getUniquesMap(){
        return uniquesMap;
    }

    public HashMap<String, Integer> getPriceCount() {
        return priceCount;
    }

    public Integer getNumberOfPrices(){

    }
}
