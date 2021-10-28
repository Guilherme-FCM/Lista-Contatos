package Actions;

import Contacts.ContactList;
import Frames.Frame;

import javax.swing.*;

public abstract class ContactListAction extends AbstractAction {
    ContactList contactList;
    Frame frame;

    public ContactListAction(Frame frame, ContactList contactList) {
        this.frame = frame;
        this.contactList = contactList;
    }
}
