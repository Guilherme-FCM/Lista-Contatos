package Contacts;

import java.util.ArrayList;

public class Contact {
    private String name, phone, address, birth_date;
    private ArrayList<Hobbie> hobbies = new ArrayList<Hobbie>();

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

    public ArrayList<Hobbie> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}
