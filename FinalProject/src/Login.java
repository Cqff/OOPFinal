import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

	public Login() {
		initComponents();
	}
	
	private void initComponents() {

		jSpinner1 = new javax.swing.JSpinner();
		jPanel1 = new javax.swing.JPanel();
		JuserID = new javax.swing.JLabel();
		textFieldID = new javax.swing.JTextField();
		jPasswordField = new javax.swing.JPasswordField();
		JuserID1 = new javax.swing.JLabel();
		jButton_Register = new javax.swing.JButton();
		jButton_Login = new javax.swing.JButton();
		jLabel_BG = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Login");
		//setBackground(new java.awt.Color(153, 255, 204));

		jPanel1.setBackground(new java.awt.Color(102, 102, 102));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		JuserID.setBackground(new java.awt.Color(153, 204, 0));
		JuserID.setFont(new java.awt.Font("Microsoft Yahei", 0, 36)); // NOI18N
		JuserID.setForeground(new java.awt.Color(0,0,0));
		JuserID.setText("  帳號: ");
		jPanel1.add(JuserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 38));

		textFieldID.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				textFieldIDActionPerformed(evt);
			}
		});
		jPanel1.add(textFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 230, 40));
		jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 230, 40));

		JuserID1.setBackground(new java.awt.Color(51, 102, 255));
		JuserID1.setFont(new java.awt.Font("Microsoft Yahei", 0, 36)); // NOI18N
		JuserID1.setForeground(new java.awt.Color(0,0,0));
		JuserID1.setText("    密碼:");
		jPanel1.add(JuserID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 38));

		jButton_Register.setBackground(new java.awt.Color(204, 255, 255));
		jButton_Register.setFont(new java.awt.Font("Microsoft Yahei", 0, 36)); // NOI18N
		jButton_Register.setForeground(new java.awt.Color(0,0,0));
		jButton_Register.setText("加入");
		jButton_Register.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_RegisterActionPerformed(evt);
			}
		});
		jPanel1.add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, 50));

		jButton_Login.setBackground(new java.awt.Color(204, 255, 255));
		jButton_Login.setFont(new java.awt.Font("Microsoft Yahei", 0, 36)); // NOI18N
		jButton_Login.setForeground(new java.awt.Color(0,0,0));
		jButton_Login.setText("登入");
		jButton_Login.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_LoginActionPerformed(evt);
			}
		});
		jPanel1.add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 120, 50));
		
		try {
			BufferedImage image = ImageIO.read(new File("/Users/bc/Desktop/OOPFinal/FinalProject/image/ha2.jpg"));
			//要自行更改
			jLabel_BG.setIcon(new ImageIcon(image));
		} catch (IOException e) {
			e.printStackTrace();
		}
	

		jPanel1.add(jLabel_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 430));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void textFieldIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldIDActionPerformed
		// TODO add your handling code here:
	}

	private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_RegisterActionPerformed
		// TODO add your handling code here:
		Register reg = new Register();
		reg.setVisible(true);
		reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_jButton_RegisterActionPerformed

	private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_LoginActionPerformed
		// TODO add your handling code here:
		PreparedStatement ps;
		ResultSet rs;

		String uid = textFieldID.getText();
		String pass = String.valueOf(jPasswordField.getPassword());

		if (uid.equals("")) {
			JOptionPane.showMessageDialog(null, "請輸入您的帳號");
		} else if (pass.equals("")) {
			JOptionPane.showMessageDialog(null, "請輸入你的密碼");
		} else {

			String query = "SELECT * FROM `reg_form` WHERE `r_id` = ? AND `r_pass` = ?";

			try {
				ps = MySQL.connectSQL().prepareStatement(query);

				ps.setString(1, uid);
				ps.setString(2, pass);
				rs = ps.executeQuery();

				if (rs.next()) {
					loggedInUserID = rs.getInt("r_id");
					JOptionPane.showMessageDialog(null, "Login Successful");
					home.setLocationRelativeTo(null);					
					home.setVisible(true);
					home.setDefaultCloseOperation(EXIT_ON_CLOSE);
					
					this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "User does not exists");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
	
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}
	
	public void setUserID(String user) {
		userID = user;
	}
	
	public static int getUserID() {
	    return loggedInUserID;
	}


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel JuserID;
	private javax.swing.JLabel JuserID1;
	private javax.swing.JButton jButton_Login;
	private javax.swing.JButton jButton_Register;
	private javax.swing.JLabel jLabel_BG;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField;
	private javax.swing.JSpinner jSpinner1;
	private javax.swing.JTextField textFieldID;
	private String userID ;
	private HomePage home = new HomePage();
	private static int loggedInUserID;
	// End of variables declaration//GEN-END:variables
	
}
