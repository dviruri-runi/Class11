package il.co.dmobile.myapplication_2;

import java.io.Serializable;

public class User implements Serializable {

    private int Image;
    private String Name;
    private String Email;

    public User(int image, String name, String email) {
        Image = image;
        Name = name;
        Email = email;
    }

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
