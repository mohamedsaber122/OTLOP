package otlob;//class geded!
import java.util.ArrayList;
import java.io.Serializable;
public class Items implements Serializable{
private String name;
private int cost;
private String restID;

    public Items(String name, int cost,String restID) {
        this.name = name;
        this.cost = cost;
        this.restID=restID;
    }

    public Items()
    {
        
    }

    @Override
    public String toString() {
        return  name + " price : "+ cost ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getRestID() {
        return restID;
    }

    public void setRestID(String restID) {
        this.restID = restID;
    }
    

}
