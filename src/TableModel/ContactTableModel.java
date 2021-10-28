package TableModel;

import Contacts.Contact;
import Contacts.ContactList;
import Frames.Frame;

public class ContactTableModel extends MyTableModel{
    public ContactTableModel(ContactList contactList) {
        super(contactList);
    }

    @Override
    void dataChanged(int row, int column, String data) {
        Contact contact = contactList.getContact(row);
        switch (column){
            case 0:
                contact.setName(data);
                break;
            case 1:
                contact.setPhone(data);
                break;
            case 2:
                contact.setAddress(data);
                break;
            case 3:
                contact.setBirth_date(data);
                break;
        }
        System.out.println(row);
        System.out.println(column);
        System.out.println(data);
    }
}
