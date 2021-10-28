package Contacts;
import java.util.ArrayList;

public class ContactList {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public int getSize(){ return contacts.size(); }
    public void addContact(Contact contact){ contacts.add(contact); }

    public void removeContactByName(String name){
        contacts.removeIf(contact -> contact.name.equals(name));
    }

    public ArrayList<Hobbie> getHobbies(){
        ArrayList<Hobbie> hobbies = new ArrayList<Hobbie>();

        for (Contact contact : contacts )
            for (Hobbie hobbie : contact.hobbies)
                if (hobbie.weekly_frequency > 1)
                    hobbies.add(hobbie);

        return hobbies;
    }

    public String[] getHeader(){
        return new String[] {
            "Nome",
            "Telefone",
            "Endereço",
            "Data de Nascimento"
        };
    }

    public Object[][] getContacts(){
        Object[][] contactsList = new Object[getSize()][];
        for (int x = 0; x < getSize(); x++)
            contactsList[x] = new Object[]{
                contacts.get(x).name,
                contacts.get(x).phone,
                contacts.get(x).address,
                contacts.get(x).birth_date
            };
        return contactsList;
    }
}
