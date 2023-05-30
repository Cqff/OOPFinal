import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFavorite = new JButton("收藏");
		btnFavorite.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnFavorite.setBounds(616, 11, 160, 40);
		contentPane.add(btnFavorite);
		
		JButton btnProfile = new JButton("我的主頁");
		btnProfile.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnProfile.setBounds(10, 11, 160, 40);
		contentPane.add(btnProfile);
		
		JButton btnService = new JButton("客服");
		btnService.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnService.setBounds(616, 435, 160, 40);
		contentPane.add(btnService);
		
		JButton btnNewBook1 = new JButton("Book_1");
		btnNewBook1.setBounds(150, 123, 89, 99);
		contentPane.add(btnNewBook1);
		
		JButton btnNewBook2 = new JButton("Book_2");
		btnNewBook2.setBounds(350, 123, 89, 99);
		contentPane.add(btnNewBook2);
		
		JButton btnNewBook3 = new JButton("Book_3");
		btnNewBook3.setBounds(558, 123, 89, 99);
		contentPane.add(btnNewBook3);
		
		JButton btnNewNote1 = new JButton("Note_1");
		btnNewNote1.setBounds(150, 295, 89, 99);
		contentPane.add(btnNewNote1);
		
		JButton btnNewNote2 = new JButton("Note_2");
		btnNewNote2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewNote2.setBounds(350, 295, 89, 99);
		contentPane.add(btnNewNote2);
		
		JButton btnNewNote3 = new JButton("Note_3");
		btnNewNote3.setBounds(558, 295, 89, 99);
		contentPane.add(btnNewNote3);
		
		JButton btnSB = new JButton("二手書：");
		btnSB.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnSB.setBounds(80, 79, 123, 33);
		contentPane.add(btnSB);
		
		JButton btnEN = new JButton("電子筆記：");
		btnEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEN.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnEN.setBounds(80, 251, 123, 33);
		contentPane.add(btnEN);
		

		
		
	}
}

