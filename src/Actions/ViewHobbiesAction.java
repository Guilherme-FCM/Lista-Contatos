package Actions;

import Contacts.ContactList;
import Frames.Frame;

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
