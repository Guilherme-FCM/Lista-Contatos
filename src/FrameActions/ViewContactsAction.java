package FrameActions;

import Contacts.ContactList;
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
