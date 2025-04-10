package otlob;

import java.io.Serializable;

public class User extends Person implements Serializable{
private String email;
    private String address;

    public User() {

    }

    public User(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public User(String email, String address, int id, String username, String fullname, String password, String phone, int age, char gender) {
        super(id, username, fullname, password, phone, age, gender);
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean RegisterAsUserHash(User myUser) {
        FileManager.myUsersData.put(myUser.getUsername(), myUser);
        if (FileManager.saveUsersData()) {
            return true;
        }
        return false;
    }

    public boolean LoginAsUserHash(String Username, String Password) {

        if (FileManager.loadUsersData()) {
            for (User i : FileManager.myUsersData.values()) {
                if (i.getUsername().toString().equals(Username) && i.getPassword().toString().equals(Password)) {
                    System.out.println("Logged In!");
                    return true;
                }
            }
        }
        return false;
    }

}
