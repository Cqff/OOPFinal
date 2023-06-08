import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private DefaultTableModel tableModel;
	private JTable table;
	private ArrayList<Goods> ebooksData;
	//private HomePage homePage = new HomePage();
	Connection conn;
	Statement stat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	ArrayList<Goods> sBookeNote = new ArrayList<>();
	String server = "jdbc:mysql://140.119.19.73:3315/";
	String database = "111306044"; // change to your own database
	String url = server + database + "?useSSL=false";
	String username = "111306044"; // change to your own username
	String password = "6ufva"; // change to your own password
	
	public Profile() {
		setTitle("我的主頁");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 725, 397);
		contentPane = new JPanel();
		contentPane.setSize(1000, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		createDeleteFunction();
		createTable();
		showUserSBookEnote();
		backToHP();
		
		try {
            conn = DriverManager.getConnection(url, username, password);
            //System.out.println("DB Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	private void deleteBookFromTable(int bookID) {
	    int rowCount = tableModel.getRowCount();
	    for (int i = 0; i < rowCount; i++) {
	        int id = (int) tableModel.getValueAt(i, 0);
	        if (id == bookID) {
	            tableModel.removeRow(i);
	            break;
	        }
	    }
	}

	
	private void createDeleteFunction() {
	    
		JLabel lbID = new JLabel("ID:");
		lbID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbID.setBounds(296, 268, 49, 14);
		contentPane.add(lbID);
		
		tfID = new JTextField();
		tfID.setBounds(324, 265, 96, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lbNewLabel = new JLabel("你上架的二手課本和電子筆記：");
		lbNewLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lbNewLabel.setBounds(10, 11, 215, 20);
		contentPane.add(lbNewLabel);
		
	    JButton btnDelete = new JButton("下架");
	    btnDelete.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
	    btnDelete.setBounds(296, 293, 124, 36);
	    btnDelete.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            int result = JOptionPane.showConfirmDialog(null, "你確認要把此二手課本/電子筆記下架嗎？");
	            switch (result) {
	                case JOptionPane.YES_OPTION:
	                    String ID = tfID.getText();
	                    String query = "DELETE FROM Sell_Book WHERE ID=?";
	                    try {
	                        PreparedStatement statement = conn.prepareStatement(query);
	                        statement.setString(1, ID);
	                        int rowsAffected = statement.executeUpdate();
	                        if (rowsAffected > 0) {
	                        	JOptionPane.showMessageDialog(null, "你已成功下架");
	                            // Delete the book from the table
	                            deleteBookFromTable(Integer.parseInt(ID));
	                        } else {
	                        	JOptionPane.showMessageDialog(null, "沒有相關資料","提醒", JOptionPane.WARNING_MESSAGE);
	                        }
	                        statement.close();
	                    } catch (SQLException e1) {
	                        e1.printStackTrace();
	                    }
	                    break;
	                case JOptionPane.NO_OPTION:
	                    System.out.println("No");
	                    break;
	                case JOptionPane.CANCEL_OPTION:
	                    System.out.println("取消");
	                    break;
	                case JOptionPane.CLOSED_OPTION:
	                    System.out.println("Closed");
	                    break;
	            }
	        }
	    });
	    contentPane.add(btnDelete);
	}

		
	private void createTable() {
	    tableModel = new DefaultTableModel() {
	        @Override
	        public boolean isCellEditable(int row, int column) {
	            return false; // Make all cells uneditable
	        }
	    };

	    tableModel.addColumn("ID:");
	    tableModel.addColumn("書名");
	    tableModel.addColumn("作者");
	    tableModel.addColumn("價格");

	    table = new JTable(tableModel);
	    table.setEnabled(false); // Disable editing of the entire table

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 42, 692, 200);
	    contentPane.add(scrollPane);

	    // Adjust the size of the content pane based on the table size
	    int tableHeight = table.getRowHeight() * table.getRowCount();
	    int tableWidth = table.getColumnModel().getTotalColumnWidth();
	    scrollPane.setPreferredSize(new Dimension(tableWidth, tableHeight + table.getTableHeader().getHeight()));
	    contentPane.setPreferredSize(new Dimension(tableWidth + 430, tableHeight + table.getTableHeader().getHeight() + 360));
	}

	private void backToHP() {
		JButton btnBackToHP = new JButton("返回首頁");
	    btnBackToHP.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
	    btnBackToHP.setBounds(10, 300, 96, 23);
	    contentPane.add(btnBackToHP);
	    
//	    btnBackToHP.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				homePage.setVisible(true);
//				setVisible(false);
//			}
//		});
	    
	}

		private void showUserSBookEnote() {
		    ArrayList<Goods> ebookData = getBooksFromDatabase();
		    for (Goods goods : ebookData) {
		        Object[] row = {goods.getID(), goods.getName(), goods.getAuthor(), goods.getPrice()};
		        tableModel.addRow(row);
		    }
		    
		    pack();
		}
	    
		private ArrayList<Goods> getBooksFromDatabase() {
			
			try {
	        
				// 建立数据库连接
				Connection connection = DriverManager.getConnection(url, username, password);
				System.out.println("DB Connected");
				// 创建查询语句
				String query = "SELECT ID, Name, Author, Price FROM Sell_Book";   // WHERE Type = '電子筆記'
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
					sBookeNote.add(eNote1);
				}
	            
				resultSet.close();
				statement.close();
				connection.close();
	            
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return sBookeNote;
	}
}
