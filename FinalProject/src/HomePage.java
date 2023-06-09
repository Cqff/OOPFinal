import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	Login login1;
	private int loggedInUserID;
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
		setBounds(100, 200, 800, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnFavorite = new JButton("收藏");
		btnFavorite.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FavoriteDao fav = new FavoriteDao();
				//Login login1 = new Login();
				FavoriteGUI f = new FavoriteGUI(fav.getFavoritesByUser(login1 .getUserID()));
			}
		});
		btnFavorite.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnFavorite.setBounds(616, 11, 160, 40);
		contentPane.add(btnFavorite);

		JButton btnProfile = new JButton("我的主頁");
		btnProfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 MyProfile p = new MyProfile(login1 .getUserID());
//				Profile profile = new Profile(login1.getUserID(),HomePage.this);
				//p.setVisible(true);
				
				
			}
		});
		btnProfile.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnProfile.setBounds(10, 11, 160, 40);
		contentPane.add(btnProfile);
		

		JButton btnService = new JButton("客服");
		btnService.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cu faq = new cu();
				faq.setVisible(true);
				dispose();
			}
		});
		btnService.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnService.setBounds(634, 714, 160, 40);
		contentPane.add(btnService);

		JButton btnSB = new JButton("查看更多二手書：");
		btnSB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second s1 = new Second();
				s1.setVisible(true);
			}
		});
		btnSB.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnSB.setBounds(602, 92, 174, 33);
		contentPane.add(btnSB);
		
		JButton btnSell = new JButton("我要賣書");
		btnSell.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SellB sell = new SellB();
				sell.setVisible(true);
			}
		});
		btnSell.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnSell.setBounds(10, 714, 160, 40);
		contentPane.add(btnSell);

		JButton btnEN = new JButton("查看更多電子筆記：");
		btnEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enote e1 = new Enote();
				e1.setVisible(true);
			}
		});
		btnEN.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnEN.setBounds(620, 431, 174, 33);
		contentPane.add(btnEN);

		JLabel Bk1 = new JLabel("New label");
		Bk1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("1");
				buyPage.setVisible(true);
			}
		});
		Bk1.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Bk1.jpg"));
		Bk1.setBounds(91, 153, 135, 200);
		contentPane.add(Bk1);

		JLabel lblNewLabel_2 = new JLabel("二手書");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 22));
		lblNewLabel_2.setBounds(27, 94, 67, 25);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("電子筆記");
		lblNewLabel_2_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(27, 433, 112, 25);
		contentPane.add(lblNewLabel_2_1);

		JLabel Bk2 = new JLabel("New label");
		Bk2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("2");
				buyPage.setVisible(true);
			}
		});
		Bk2.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Bk2.jpg"));
		Bk2.setBounds(312, 153, 135, 200);
		contentPane.add(Bk2);

		JLabel Bk3 = new JLabel("New label");
		Bk3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("3");
				buyPage.setVisible(true);
			}
		});
		Bk3.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Bk3.jpg"));
		Bk3.setBounds(534, 153, 135, 200);
		contentPane.add(Bk3);

		JLabel Enote1 = new JLabel("New label");
		Enote1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("4");
				buyPage.setVisible(true);
			}
		});
		Enote1.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Enote1.jpeg"));
		Enote1.setBounds(91, 491, 135, 200);
		contentPane.add(Enote1);

		JLabel Enote2 = new JLabel("New label");
		Enote2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("5");
				buyPage.setVisible(true);
			}
		});
		Enote2.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Enote2.jpeg"));
		Enote2.setBounds(312, 491, 135, 200);
		contentPane.add(Enote2);

		JLabel Enote3 = new JLabel("New label");
		Enote3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Buy buyPage = new Buy("6");
				buyPage.setVisible(true);
			}
		});
		Enote3.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/Enote3.jpg"));
		Enote3.setBounds(534, 491, 135, 200);
		contentPane.add(Enote3);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("/Users/raxhel/Desktop/final/ha5.jpg"));
		lblNewLabel.setBounds(0, -100, 1000, 1000);
		contentPane.add(lblNewLabel);

	}
	
}
