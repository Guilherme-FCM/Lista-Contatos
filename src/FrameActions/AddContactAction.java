package FrameActions;

import Contacts.Contact;
import Contacts.ContactList;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddContactAction extends ContactListAction {
    public AddContactAction(Frame frame, ContactList contactList) {
        super(frame, contactList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog(null, "Nome");
        String phone = JOptionPane.showInputDialog(null, "Telefone");
        String address = JOptionPane.showInputDialog(null, "Endereço");
        String birth_date = JOptionPane.showInputDialog(null, "Data de Nascimento");

        contactList.addContact(new Contact(name, phone, address, birth_date));
        frame.updateTable();
    }
}
