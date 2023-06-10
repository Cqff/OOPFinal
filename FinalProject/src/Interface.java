import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

interface Interface {
	
	public static final JFrame frame = new JFrame();
    public static final JTable table = new JTable();
    public static final DefaultTableModel tableModel = new DefaultTableModel();
    
	void createTable();
	
}
