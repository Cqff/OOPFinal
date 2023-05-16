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
		
		JButton btnSell = new JButton("賣書");
		btnSell.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnSell.setBounds(616, 11, 160, 40);
		contentPane.add(btnSell);
		
		JButton btnFavorite = new JButton("收藏");
		btnFavorite.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnFavorite.setBounds(10, 435, 160, 40);
		contentPane.add(btnFavorite);
		
		JButton btnProfile = new JButton("我的主頁");
		btnProfile.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnProfile.setBounds(10, 11, 160, 40);
		contentPane.add(btnProfile);
		
		JButton btnService = new JButton("客服");
		btnService.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnService.setBounds(616, 435, 160, 40);
		contentPane.add(btnService);
		
		JLabel lbNewReleaseSB = new JLabel("最新二手書:");
		lbNewReleaseSB.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lbNewReleaseSB.setBounds(111, 72, 108, 26);
		contentPane.add(lbNewReleaseSB);
		
		JLabel lbNewReleaseSB_1 = new JLabel("最新電子筆記:");
		lbNewReleaseSB_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lbNewReleaseSB_1.setBounds(111, 244, 128, 26);
		contentPane.add(lbNewReleaseSB_1);
		
		JButton btnNewBook1 = new JButton("Book_1");
		btnNewBook1.setBounds(150, 109, 89, 99);
		contentPane.add(btnNewBook1);
		
		JButton btnNewBook2 = new JButton("Book_2");
		btnNewBook2.setBounds(350, 109, 89, 99);
		contentPane.add(btnNewBook2);
		
		JButton btnNewBook3 = new JButton("Book_3");
		btnNewBook3.setBounds(558, 109, 89, 99);
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
		

		
		
	}
}


