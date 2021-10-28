package TableModel;

import Contacts.ContactList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public abstract class MyTableModel implements TableModelListener {
    public ContactList contactList;

    public MyTableModel(ContactList contactList) {
        this.contactList = contactList;
    }

    abstract void dataChanged(int row, int column, String data);

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String data = model.getValueAt(row, column).toString();

        dataChanged(row, column, data);
    }
}
