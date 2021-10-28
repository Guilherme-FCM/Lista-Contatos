package Contacts;
import java.util.ArrayList;

public class ContactList {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public int getSize(){ return contacts.size(); }
    public void addContact(Contact contact){ contacts.add(contact); }

    public void removeContactByName(String name){
        contacts.removeIf(contact -> contact.name.equals(name));
    }

    public Object[][] getHobbies(){
        ArrayList<Object[]> hobbies = new ArrayList<Object[]>();
        for (Contact contact : contacts)
            for (Hobbie hobbie : contact.hobbies)
                if (hobbie.weekly_frequency > 1)
                    hobbies.add(new Object[]{ hobbie.name, hobbie.weekly_frequency });

        Object[][] hobbiesVector = new Object[hobbies.size()][];
        for (int i = 0; i < hobbies.size(); i++)
            hobbiesVector[i] = hobbies.get(i);

        return hobbiesVector;
    }

    public Object[][] getContacts(){
        Object[][] contactsList = new Object[getSize()][];
        for (int i = 0; i < getSize(); i++)
            contactsList[i] = new Object[]{
                contacts.get(i).name,
                contacts.get(i).phone,
                contacts.get(i).address,
                contacts.get(i).birth_date
            };
        return contactsList;
    }

    public String[] getContactHeader(){
        return new String[] {
            "Nome",
            "Telefone",
            "Endereço",
            "Data de Nascimento"
        };
    }

    public String[] getHobbieHeader(){
        return new String[] {
                "Nome",
                "Frequência"
        };
    }
}
