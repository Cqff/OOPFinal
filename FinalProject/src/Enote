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

public class Enote extends JFrame{
	private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    
    public Enote() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("電子書");
        createTable();
        showEbooks();
    }

	private void createTable() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("no:");
        tableModel.addColumn("書名");
        tableModel.addColumn("作者");
        tableModel.addColumn("價格");
        table = new JTable(tableModel);
        add(new JScrollPane(table));
    }
	
	private void showEbooks() {
        ArrayList<Goods> ebookData = getBooksFromDatabase();
        for (Goods goods : ebookData) {
            Object[] row = {goods.getID(), goods.getName(), goods.getPrice(),goods.getAuthor()};
            tableModel.addRow(row);
        }
        pack();
        setVisible(true);
	}
        
        private ArrayList<Goods> getBooksFromDatabase() {
            ArrayList<Goods> eNote = new ArrayList<>();
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
                    eNote.add(eNote1);
                }
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return eNote;
}
}
	
       
