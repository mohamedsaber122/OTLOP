package otlob;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ListModel;

public class FileManager implements Serializable {

    public static HashMap<String, Admin> myAdminsData = new HashMap< String, Admin>();
    public static HashMap<String, User> myUsersData = new HashMap< String, User>();
    public static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    public static ArrayList<Items>items=new ArrayList<Items>();
    public static ArrayList<Menu>menu=new ArrayList<Menu>();
    static ListModel loadRestaurantsData;
    public static boolean loadRestaurantsData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\RestaurantsArrayList.bin"));
            restaurants = (ArrayList<Restaurant>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveRestaurantsData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\RestaurantsArrayList.bin"));
            Bout.writeObject(restaurants);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
    public static boolean loadItemsData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\ItemsArrayList.bin"));
            items = (ArrayList<Items>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveItemsData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\ItemsArrayList.bin"));
            Bout.writeObject(items);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    
    

    public static boolean loadAdminsData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\AdminsHashMap.bin"));
            myAdminsData = (HashMap<String, Admin>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveAdminsData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\AdminsHashMap.bin"));
            Bout.writeObject(myAdminsData);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    public static boolean loadUsersData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\UsersHashMap.bin"));
            myUsersData = (HashMap<String, User>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveUsersData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\UsersHashMap.bin"));
            Bout.writeObject(myUsersData);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    
    
    public static boolean saveMenuData()
    {
        ObjectInputStream bin;
        try
        {
            bin=new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\menuArrayList.bin"));
            System.out.println(menu.size());
            bin.close();
            return true;
        }
        catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
    public static boolean loadMenuData()
    {
        ObjectInputStream bin;
        try
        {
            bin=new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed Saber\\Desktop\\Semsters\\Otlob\\BIN Folder\\MenuArrayList.bin"));
            System.out.println(items.size());
            bin.close();
            return true;
            
        }
        catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

}
