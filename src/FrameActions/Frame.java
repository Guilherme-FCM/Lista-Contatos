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

    public void renderTable(){
        Object[][] data = contactList.getContacts();
        String[] columnNames = contactList.getHeader();

        table = new JTable(data, columnNames);

        this.add(table.getTableHeader(), BorderLayout.PAGE_START);
        this.add(table, BorderLayout.CENTER);
    }

    public void removeTable(){
        this.remove(table);
    }

    public void updateTable(){
        this.removeTable();
        this.renderTable();
        this.validate();
    }
    
    public void render(){
        // Menu Bar
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

        menuItem = new JMenuItem("Vizualizar Passa-Tempos");
        menu.add(menuItem);

        menuBar.add(menu);
        this.setJMenuBar(menuBar);


//        if (contactList.getSize() == 0){
//            JLabel label = new JLabel("Não há contatos salvos.");
//            this.add(label, BorderLayout.CENTER);
//        } else {
//            renderTable();
//        }
        renderTable();

    }

    public void start(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setVisible(true);
    }
}
