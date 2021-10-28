package FrameActions;

import Contacts.ContactList;
import java.awt.event.ActionEvent;

public class ViewHobbiesAction extends ContactListAction {
    public ViewHobbiesAction (Frame frame, ContactList contactList) {
        super(frame, contactList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.updateTableHobbies();
    }
}
