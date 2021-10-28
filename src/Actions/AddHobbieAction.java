package Actions;

import Contacts.ContactList;
import Contacts.Hobbie;
import Frames.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddHobbieAction extends ContactListAction {
    public AddHobbieAction(Frame frame, ContactList contactList) {
        super(frame, contactList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String contact_name = JOptionPane.showInputDialog(null, "Nome do contato");

        int indexContact = contactList.findContactByName(contact_name);
        System.out.println(indexContact);
        if (indexContact != -1){
            String hobbie = JOptionPane.showInputDialog(null, "Passa-Tempo");
            String frequency = JOptionPane.showInputDialog(null, "Frequência por Semana");
            contactList.getContact(indexContact).addHobbie(new Hobbie(hobbie, Integer.parseInt(frequency)));
        }
    }
}
