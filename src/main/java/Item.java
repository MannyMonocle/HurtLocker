import java.util.ArrayList;
import java.util.HashMap;

public class Item {
    String name;
    String price;
    String type;
    String expiration;
    String key;


    public Item(String name, String price, String type, String expiration) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.expiration = expiration;
        this.key = name + price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", expiration='" + expiration + '\'' +
                '}';
    }

}
