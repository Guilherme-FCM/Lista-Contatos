package Frames;

import Actions.*;
import Contacts.ContactList;
import TableModel.ContactTableModel;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private ContactList contactList = new ContactList();
    private JTable table;
    
    public Frame(String title) throws HeadlessException {
        super(title);
    }

    public void renderTableContacts(){
        Object[][] data = contactList.getContacts();
        String[] columnNames = contactList.getContactHeader();

        table = new JTable(data, columnNames);
        table.getModel().addTableModelListener(new ContactTableModel(contactList));

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
//        table.getModel().addTableModelListener(new TableModel.MyTableModel(contactList));

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
        menuBar.add(renderAddRemoveMenu());
        menuBar.add(renderViewMenu());
        this.setJMenuBar(menuBar);
    }

    public JMenu renderAddRemoveMenu(){
        JMenu addRemoveMenu = new JMenu("Adicionar/Remover");
        JMenuItem menuItem;

        menuItem = new JMenuItem("Adicionar contato");
        menuItem.addActionListener(new AddContactAction(this, contactList));
        addRemoveMenu.add(menuItem);
        addRemoveMenu.addSeparator();

        menuItem = new JMenuItem("Remover contato");
        menuItem.addActionListener(new RemoveContactAction(this, contactList));
        addRemoveMenu.add(menuItem);
        addRemoveMenu.addSeparator();

        menuItem = new JMenuItem("Adicionar passa-tempo");
        menuItem.addActionListener(new AddHobbieAction(this, contactList));
        addRemoveMenu.add(menuItem);

        return addRemoveMenu;
    }

    public JMenu renderViewMenu(){
        JMenu viewMenu = new JMenu("Vizualizar");
        JMenuItem menuItem;

        menuItem = new JMenuItem("Vizualizar Contatos");
        menuItem.addActionListener(new ViewContactsAction(this, contactList));
        viewMenu.add(menuItem);
        viewMenu.addSeparator();

        menuItem = new JMenuItem("Vizualizar Passa-Tempos");
        menuItem.addActionListener(new ViewHobbiesAction(this, contactList));
        viewMenu.add(menuItem);

        return viewMenu;
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
