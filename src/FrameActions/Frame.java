package FrameActions;

import Contacts.ContactList;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public ContactList contactList = new ContactList();
    public JTable table;
    
    public Frame(String title) throws HeadlessException {
        super(title);
    }

    public void renderTableContacts(){
        Object[][] data = contactList.getContacts();
        String[] columnNames = contactList.getContactHeader();

        table = new JTable(data, columnNames);

        this.add(table.getTableHeader(), BorderLayout.PAGE_START);
        this.add(table, BorderLayout.CENTER);
    }

    public void updateTableContacts(){
        this.removeTable();
        this.renderTableContacts();
        this.validate();
    }

    public void renderTableHobbies(){
        Object[][] data = contactList.getHobbies();
        String[] columnNames = contactList.getHobbieHeader();

        table = new JTable(data, columnNames);

        this.add(table.getTableHeader(), BorderLayout.PAGE_START);
        this.add(table, BorderLayout.CENTER);
    }

    public void updateTableHobbies(){
        this.removeTable();
        this.renderTableHobbies();
        this.validate();
    }

    public void removeTable(){
        this.remove(table);
        this.remove(table.getTableHeader());
    }

    public void renderMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem menuItem;
        menuItem = new JMenuItem("Adicionar contato");
        menuItem.addActionListener(new AddContactAction(this, contactList));
        menu.add(menuItem);
        menu.addSeparator();

        menuItem = new JMenuItem("Remover contato");
        menuItem.addActionListener(new RemoveContactAction(this, contactList));
        menu.add(menuItem);
        menu.addSeparator();

        menuItem = new JMenuItem("Vizualizar Contatos");
        menuItem.addActionListener(new ViewContactsAction(this, contactList));
        menu.add(menuItem);
        menu.addSeparator();

        menuItem = new JMenuItem("Vizualizar Passa-Tempos");
        menuItem.addActionListener(new ViewHobbiesAction(this, contactList));
        menu.add(menuItem);

        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }
    
    public void render(){
        renderMenuBar();
        renderTableContacts();
    }

    public void start(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setVisible(true);
    }
}
