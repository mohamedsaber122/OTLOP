package otlob;//class geded!

import java.io.Serializable;
import java.util.Scanner;

public class Order extends Restaurant implements Serializable {

    String rest;
    Restaurant myrest=new Restaurant();
    Scanner a = new Scanner(System.in);

    public void placeOrder() {
        rest=a.next();
        myrest.getName();
        if(rest==myrest.getName())
        {
            
        }
    }
}
