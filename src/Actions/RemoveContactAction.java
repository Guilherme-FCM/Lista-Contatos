package Actions;

import Contacts.ContactList;
import Frames.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RemoveContactAction extends ContactListAction {
    public RemoveContactAction(Frame frame, ContactList contactList) {
        super(frame, contactList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog(null, "Nome");
        contactList.removeContactByName(name);
        frame.updateTableContacts();
    }
}
