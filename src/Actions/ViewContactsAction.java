package Actions;

import Contacts.ContactList;
import Frames.Frame;

import java.awt.event.ActionEvent;

public class ViewContactsAction extends ContactListAction {
    public ViewContactsAction (Frame frame, ContactList contactList) {
        super(frame, contactList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.updateTableContacts();
    }
}
