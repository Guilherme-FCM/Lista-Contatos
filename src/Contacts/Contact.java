package Contacts;

import java.util.ArrayList;

public class Contact {
    String name, phone, address, birth_date;
    ArrayList<Hobbie> hobbies = new ArrayList<Hobbie>();

    public Contact(String name, String phone, String address, String birth_date) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birth_date = birth_date;
    }

    public void addHobbie (Hobbie hobbie){ hobbies.add(hobbie); }

    public void removeHobbie (Hobbie hobbie){
        hobbies.remove(hobbie);
    }
}
