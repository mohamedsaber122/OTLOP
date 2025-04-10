package otlob;
import java.io.Serializable;
import java.util.ArrayList;
import static otlob.FileManager.restaurants;
public class Restaurant implements Serializable {
private String name;
    private String priceRange;
    private String category;
    private int  id =0;

    public Restaurant(String name, String priceRange, String category) {
        this.name = name;
        this.priceRange = priceRange;
        this.category = category;
                
    }

    Restaurant() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  id + " "+name;
    }
    

}
