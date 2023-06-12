
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Collection {

	private JFrame frame;
	private JTable table_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Collection window = new Collection();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Collection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 446, 178);
		frame.getContentPane().add(scrollPane);

		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setSelectionForeground(new Color(0, 0, 0));
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "\u985E\u578B", "\u66F8\u540D", "\u985E\u5225", "\u50F9\u683C" }));

		JLabel lblNewLabel = new JLabel("ID: ");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		lblNewLabel.setBounds(94, 209, 27, 27);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(145, 216, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(189, 210, 238));
		btnNewButton.setFont(new Font("PMingLiU", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setBounds(285, 215, 85, 23);
		frame.getContentPane().add(btnNewButton);
	}

	public static ArrayList<Goods> getBooksFromDatabase() {
		Goods goods = new Goods();
		ArrayList<Goods> booksList = new ArrayList<Goods>();
		String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "111306047"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username = "111306047"; // change to your own username
		String password = "sfe0e"; // change to your own password

		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			String query = "SELECT * FROM Sell_Book WHERE ID=?";
			PreparedStatement statement = conn.prepareStatement(query);

			statement.setInt(1, goods.getID());
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int bookId = resultSet.getInt("ID");
				String bookType = resultSet.getString("Type");
				String bookName = resultSet.getString("Name");
				String bookCat = resultSet.getString("Category");
				double bookPrice = resultSet.getDouble("Price");

				Goods goods2 = new Goods(bookId, bookType, bookName, bookCat, bookPrice);
				booksList.add(goods2);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksList;
	}
}
