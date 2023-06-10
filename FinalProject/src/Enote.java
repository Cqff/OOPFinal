import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class  Enote extends JFrame{
	private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;

    public Enote() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("電子筆記");
        createTable();
        showEnote();
    }

	private void createTable() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("no:");
        tableModel.addColumn("書名");
        tableModel.addColumn("價格");
        tableModel.addColumn("作者");
        tableModel.addColumn("操作"); 
        table = new JTable(tableModel);
        add(new JScrollPane(table));
        table.getColumn("操作").setCellRenderer(new JButtonRenderer());
        table.getColumn("操作").setCellEditor(new JButtonEditor(new JCheckBox()));

    }

	private void showEnote() {
        ArrayList<Goods> eNoteData = getEnoteFromDatabase();
        for (Goods goods : eNoteData) {
            Object[] row = {goods.getID(), goods.getName(), goods.getPrice(),goods.getAuthor()};
            tableModel.addRow(row);
        }
        pack();
        setVisible(true);
	}

	 private ArrayList<Goods> getEnoteFromDatabase() {
         ArrayList<Goods> note = new ArrayList<>();
         String server = "jdbc:mysql://140.119.19.73:3315/";
 		String database = "111306047"; // change to your own database
 		String url = server + database + "?useSSL=false";
 		String username = "111306047"; // change to your own username
 		String password = "sfe0e"; // change to your own password

         try {
             // 建立数据库连接
         	Connection connection = DriverManager.getConnection(url, username, password);
             // 创建查询语句
             String query = "SELECT * FROM Sell_Book WHERE Type = '電子筆記'";
             PreparedStatement statement = connection.prepareStatement(query);
            // statement.setString(1, bookType);

             // 执行查询并获取结果集
             ResultSet resultSet = statement.executeQuery();

             // 遍历结果集并添加书籍到列表
             while (resultSet.next()) {
             	int id = resultSet.getInt("ID");
                 String name = resultSet.getString("Name");
                 String author = resultSet.getString("Author");
                 double price = resultSet.getDouble("Price");

                 Goods eNote1 = new Goods(id, name, price, author);
                 note.add(eNote1);
             }
             resultSet.close();
             statement.close();
             connection.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }

         return note;
}


	public class JButtonRenderer extends JButton implements TableCellRenderer {

	    public JButtonRenderer() {
	        setOpaque(true);
	    }

	    @Override
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	        setText("View"); // 按钮显示的文本
	        return this;
	    }
	}

	class JButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

	    private JButton button;
	    private JCheckBox checkBox;
	    private String id;

	    public JButtonEditor(JCheckBox checkBox) {
	        this.checkBox = checkBox;
	        button = new JButton();
	        button.setActionCommand("buy");
	        button.addActionListener(this);
	        button.setBorderPainted(false);
	    }

	    @Override
	    public Object getCellEditorValue() {
	        if ("buy".equals(button.getActionCommand())) {
	            // 处理按钮点击事件，跳转到Buy类的GUI页面
	            Buy buyPage = new Buy(id); // 将ID作为参数传递给Buy类的构造函数
	            buyPage.setVisible(true);
	        }
	        return null;
	    }

	    @Override
	    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	        id = table.getValueAt(row, 0).toString(); // 获取对应行的ID
	        return button;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        button.setActionCommand("buy");
	        fireEditingStopped();
	    }
	}

} 
