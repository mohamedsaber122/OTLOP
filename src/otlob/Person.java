package otlob;
import java.io.Serializable;
public class Person implements Serializable{
private int id;
    private String username;
    private String fullname;
    private String password;
    private String phone;
    private int age;
    private char gender;

    public Person() {
        username=" ";
    }

    public Person(int id, String username, String fullname, String password, String phone, int age, char gender) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
