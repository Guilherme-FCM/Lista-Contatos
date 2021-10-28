package Actions;

import Contacts.*;
import Frames.Frame;

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

        Contact newContact = new Contact(name, phone, address, birth_date);

        while (true) {
            int option = JOptionPane.showConfirmDialog(null, "Adicionar Passa-tempo?");
            if (option == 0){
                String hobbie = JOptionPane.showInputDialog(null, "Passa-Tempo");
                String frequency = JOptionPane.showInputDialog(null, "Frequência por Semana");
                newContact.addHobbie(new Hobbie(hobbie, Integer.parseInt(frequency)));
            } else break;
        }

        contactList.addContact(newContact);
        frame.updateTableContacts();
    }
}
