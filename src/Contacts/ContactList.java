package Contacts;
import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public int getSize(){ return contacts.size(); }
    public void addContact(Contact contact){ contacts.add(contact); }
    public Contact getContact(int index){ return contacts.get(index); }

    public int findContactByName(String name){
        for (int i = 0; i < contacts.size(); i++)
            if (contacts.get(i).getName().equals(name))
                return i;
        return -1;
    }

    public void removeContactByName(String name){
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public Object[][] getHobbies(){
        ArrayList<Object[]> hobbies = new ArrayList<Object[]>();
        for (Contact contact : contacts)
            for (Hobbie hobbie : contact.getHobbies())
                if (hobbie.getWeekly_frequency() > 1)
                    hobbies.add(new Object[]{ hobbie.getName(), hobbie.getWeekly_frequency() });

        Object[][] hobbiesVector = new Object[hobbies.size()][];
        for (int i = 0; i < hobbies.size(); i++)
            hobbiesVector[i] = hobbies.get(i);

        return hobbiesVector;
    }

    public Object[][] getContacts(){
        Object[][] contactsList = new Object[getSize()][];
        for (int i = 0; i < getSize(); i++)
            contactsList[i] = new Object[]{
                contacts.get(i).getName(),
                contacts.get(i).getPhone(),
                contacts.get(i).getAddress(),
                contacts.get(i).getBirth_date()
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
