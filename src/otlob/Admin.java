package otlob;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Admin extends Person implements Serializable {
    public Admin(int id, String username, String fullname, String password, String phone, int age, char gender) {
        super(id, username, fullname, password, phone, age, gender);
    }

    Admin() {
    }

    public boolean addRest(Restaurant r) {
        
        FileManager.loadRestaurantsData();

        FileManager.restaurants.add(r);
        if (FileManager.saveRestaurantsData()) {
            System.out.println("Added!");
            return true;
        } else {
            return false;
        }

    }
    
    public boolean addItem(Items i)
    {
        FileManager.loadItemsData();
        FileManager.items.add(i);
        if(FileManager.saveItemsData())
        {
            System.out.println("Added!");
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean Addmenu(Menu m)
    {
        FileManager.loadMenuData();
        FileManager.menu.add(m);
//        FileManager.menu.add(FileManager.menu.size(),m);
        if(FileManager.saveMenuData())
        {
            System.out.println("Added!!");
            return true;
        }
        return false;
    }

    
    public boolean RegisterAsAdminHash(Admin myAdmin) {
        FileManager.myAdminsData.put(myAdmin.getUsername(), myAdmin);
        if (FileManager.saveAdminsData()) {
            System.out.println("Registered!");
            return true;
        }
        return false;
    }

    public boolean LoginAsAdminHash(String Username, String Password) {

        if (FileManager.loadAdminsData()) {
            for (Admin i : FileManager.myAdminsData.values()) {
                if (i.getUsername().toString().equals(Username) && i.getPassword().toString().equals(Password)) {
                    System.out.println("Logged In!");
                    return true;
                }
            }
        }
        return false;
    }

}


