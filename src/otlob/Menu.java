/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.io.Serializable;

/**
 *
 * @author Mohamed Saber
 */
public class Menu extends Restaurant implements Serializable{
private String RestaurantNames;
private String FoodType;
    public Menu(String name, String priceRange, String category, String FoodType) {
        super(name, priceRange, category);
    }

    public Menu() {
    }

    public String getRestaurantNames() {
        return RestaurantNames;
    }

    public void setRestaurantNames(String RestaurantNames) {
        this.RestaurantNames = RestaurantNames;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }
    
    
}
