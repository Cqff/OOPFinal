import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

	/**
	 * Creates new form Register
	 */
	public Register() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		l_uid = new javax.swing.JLabel();
		l_pass = new javax.swing.JLabel();
		l_rPass = new javax.swing.JLabel();
		l_fName = new javax.swing.JLabel();
		l_con = new javax.swing.JLabel();
		l_lName = new javax.swing.JLabel();
		l_email = new javax.swing.JLabel();
		l_address = new javax.swing.JLabel();
		pF_pass = new javax.swing.JPasswordField();
		pF_rPass = new javax.swing.JPasswordField();
		field_uid = new javax.swing.JTextField();
		field_fn = new javax.swing.JTextField();
		field_ln = new javax.swing.JTextField();
		field_con = new javax.swing.JTextField();
		field_mail = new javax.swing.JTextField();
		field_address = new javax.swing.JTextField();
		btn_submit = new javax.swing.JButton();
		btn_cancel = new javax.swing.JButton();
		l_BG = new javax.swing.JLabel();

		jLabel2.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setText("帳號 : ");

		jLabel8.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 0, 0));
		jLabel8.setText("姓氏 :");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Register");
		setBackground(new java.awt.Color(204, 255, 255));

		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		l_uid.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_uid.setForeground(new java.awt.Color(0, 0, 0));
		l_uid.setText("帳號 : ");
		jPanel1.add(l_uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, -1, -1));

		l_pass.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_pass.setForeground(new java.awt.Color(0, 0, 0));
		l_pass.setText("密碼 : ");
		jPanel1.add(l_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 110, -1, -1));

		l_rPass.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_rPass.setForeground(new java.awt.Color(0, 0, 0));
		l_rPass.setText("重新輸入 :");
		jPanel1.add(l_rPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

		l_fName.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_fName.setForeground(new java.awt.Color(0, 0, 0));
		l_fName.setText("名字:");
		jPanel1.add(l_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 210, -1, -1));

		l_con.setFont(new java.awt.Font("KMicrosoft Yahei", 0, 18)); // NOI18N
		l_con.setForeground(new java.awt.Color(0, 0, 0));
		l_con.setText("手機號碼 :");
		jPanel1.add(l_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

		l_lName.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_lName.setForeground(new java.awt.Color(0, 0, 0));
		l_lName.setText("姓氏 :");
		jPanel1.add(l_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 260, -1, -1));

		l_email.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_email.setForeground(new java.awt.Color(0, 0, 0));
		l_email.setText("Email: ");
		jPanel1.add(l_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 360, -1, -1));

		l_address.setFont(new java.awt.Font("Microsoft Yahei", 0, 18)); // NOI18N
		l_address.setForeground(new java.awt.Color(0, 0, 0));
		l_address.setText("地址 :");
		jPanel1.add(l_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 440, -1, -1));

		pF_pass.setToolTipText("");
		jPanel1.add(pF_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 247, 33));

		pF_rPass.setToolTipText("");
		jPanel1.add(pF_rPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 247, 35));
		jPanel1.add(field_uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 247, 35));
		jPanel1.add(field_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 247, 35));
		jPanel1.add(field_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 247, 35));
		jPanel1.add(field_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 247, 35));
		jPanel1.add(field_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 247, 35));
		jPanel1.add(field_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 247, 90));

		btn_submit.setBackground(new java.awt.Color(153, 204, 255));
		btn_submit.setFont(new java.awt.Font("Microsoft Yahei", 1, 18)); // NOI18N
		btn_submit.setText("加入");
		jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));
		btn_submit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_submitActionPerformed(evt);
			}
		});

		btn_cancel.setBackground(new java.awt.Color(153, 204, 255));
		btn_cancel.setFont(new java.awt.Font("Microsoft Yahei", 1, 18)); // NOI18N
		btn_cancel.setText("取消");
		jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));
		btn_cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_cancelActionPerformed(evt);
			}
		});

		// l_BG.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/finalproject/p1.jpeg"))); //
		// NOI18N
		try {
			BufferedImage image = ImageIO.read(new File("/Users/raxhel/Desktop/final/ha3.jpg"));
			l_BG.setIcon(new ImageIcon(image));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		String imageUrl = "https://raw.githubusercontent.com/Cqff/OOPFinal/blob/50ee750d22ada3f6dc6d4e239ac0cf143846588d/FinalProject/image/p1.jpeg";
//		URL url;
//		try {
//			url = new URL(imageUrl);
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			connection.setRequestMethod("GET");
//			connection.setRequestProperty("Authorization", "Token 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");
//			connection.setRequestProperty("User-Agent", "Cqff");
//
//			int responseCode = connection.getResponseCode();
//			if (responseCode == HttpURLConnection.HTTP_OK) {
//			    // Read the image data from the input stream
//			    InputStream inputStream = connection.getInputStream();
//			    BufferedImage image = ImageIO.read(inputStream);
//			    l_BG.setIcon(new ImageIcon(image));
//			   
//			} else {
//			    // Handle the error
//			    // ...
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		jPanel1.add(l_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 640));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btn_submitActionPerformed(ActionEvent evt) {
		String uid = field_uid.getText();
		String pass = String.valueOf(pF_pass.getPassword());
		String rePass = String.valueOf(pF_rPass.getPassword());
		String fn = field_fn.getText();
		String ln = field_ln.getText();
		String contact = field_con.getText();
		String email = field_mail.getText();
		String address = field_address.getText();

		if (uid.equals("")) {
			JOptionPane.showMessageDialog(null, "請輸入帳號");
		} else if (pass.equals("")) {
			JOptionPane.showMessageDialog(null, "請輸入密碼");
		} else if (!rePass.equals(pass)) {
			JOptionPane.showMessageDialog(null, "請重輸密碼");
		} else {

			PreparedStatement ps;
			String query = "INSERT INTO `User`(`r_id`, `r_fname`, `r_lname`, `r_pass`, `r_con`, `r_email`, `r_address`) VALUES (?,?,?,?,?,?,?)";

			try {
				ps = MySQL.connectSQL().prepareStatement(query);
				ps.setString(1, uid);
				ps.setString(2, fn);
				ps.setString(3, ln);
				ps.setString(4, pass);
				ps.setString(5, contact != null ? contact : null);
				ps.setString(6, email != null ? email : null);
				ps.setString(7, address != null ? address : null);

				if (ps.executeUpdate() > 0) {
					Login loginPage = new Login();
					JOptionPane.showMessageDialog(null, "New User Added!");
					loginPage.setVisible(true);
					loginPage.setLocationRelativeTo(null);
					loginPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
					this.dispose();

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void btn_cancelActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Login loginPage = new Login();
		loginPage.setVisible(true);
		loginPage.setLocationRelativeTo(null);
		loginPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btn_submit;
	private javax.swing.JButton btn_cancel;
	private javax.swing.JLabel l_uid;
	private javax.swing.JLabel l_address;
	private javax.swing.JLabel l_BG;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel l_pass;
	private javax.swing.JLabel l_rPass;
	private javax.swing.JLabel l_fName;
	private javax.swing.JLabel l_con;
	private javax.swing.JLabel l_lName;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel l_email;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField pF_pass;
	private javax.swing.JPasswordField pF_rPass;
	private javax.swing.JTextField field_uid;
	private javax.swing.JTextField field_fn;
	private javax.swing.JTextField field_ln;
	private javax.swing.JTextField field_con;
	private javax.swing.JTextField field_mail;
	private javax.swing.JTextField field_address;
	// End of variables declaration//GEN-END:variables
}
