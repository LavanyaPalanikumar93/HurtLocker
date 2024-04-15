import java.util.Date;
public class GroceryList {
    String type;
    Date expiration;
    int price;
    String name;
    public GroceryList(String name, int price,String type,Date expiration) {
        this.type = type;
        this.price=price;
        this.name=name;
        this.expiration=expiration;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Date getExpiration() {
        return expiration;
    }
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "GroceryList{" +
                "type='" + type + '\'' +
                ", expiration=" + expiration +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
