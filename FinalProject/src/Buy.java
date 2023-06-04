
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.sql.DriverManager;

public class Buy extends javax.swing.JFrame {
	Connection conn;
	Statement statement;
	 ResultSet rs;
	 private ImageIcon format = null;
	 byte[] pimage = null;
	 private String id;

    public Buy(String id) {
    	this.id = id;
        initComponents();
        showDataFromDatabase();
    }

    private void showDataFromDatabase() {
    	String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "111306047"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username = "111306047"; // change to your own username
		String password = "sfe0e"; // change to your own password
		
		
    	try {
    		conn = DriverManager.getConnection(url, username, password);
    		statement = conn.createStatement();
    		rs = statement.executeQuery("SELECT * FROM Sell_Book WHERE ID =" + id);
            
            
            while (rs.next()) {
                String name = rs.getString("Name");
                String author = rs.getString("Author");
                String price = rs.getString("Price");
                String bkSitua = rs.getString("Situation");
                String view = rs.getString("View");
                String time = rs.getString("Time");
                byte[] imagedata = rs.getBytes("img");
                format = new ImageIcon(imagedata);
                Image mm = format.getImage();
                Image img = mm.getScaledInstance(400, 300,Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img);
                jLabel_Photo.setIcon(image);
                
                jTextF_Name.setText(name);
                jTextF_Author.setText(author);
                jTextF_Price.setText(price);
                jTextA_BkSitua.setText(bkSitua);
                jTextA_View.setText(view);
                jTextF_Time.setText(time);
    	}
            rs.close();
            statement.close();
            conn.close();
    	}catch (SQLException e) {
    		Logger.getLogger(SellB.class.getName()).log(Level.SEVERE,null,e);
        }
	}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel_Photo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextA_BkSitua = new javax.swing.JTextArea();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_BkSitua = new javax.swing.JLabel();
        jLabel_View = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextA_View = new javax.swing.JTextArea();
        jLabel_Time = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextF_Author = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextF_Time = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextF_Price = new javax.swing.JTextArea();
        jLabel_Price = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextF_Name = new javax.swing.JTextArea();
        jButt_Collect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Detail");

        jPanel1.setBackground(new java.awt.Color(179, 223, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane2.setLayer(jLabel_Photo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 400, 400));

        jScrollPane4.setBorder(null);

        jTextA_BkSitua.setEditable(false);
        jTextA_BkSitua.setBackground(new java.awt.Color(179, 223, 245));
        jTextA_BkSitua.setColumns(20);
        jTextA_BkSitua.setRows(5);
        jTextA_BkSitua.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jTextA_BkSitua);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 310, 120));

        jLabel_Name.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Name.setText("書名");
        jPanel1.add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, 30));

        jLabel_Author.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Author.setText("作者/出版社");
        jPanel1.add(jLabel_Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 130, 50));

        jLabel_BkSitua.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_BkSitua.setText("書況");
        jPanel1.add(jLabel_BkSitua, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel_View.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_View.setText("簡介");
        jPanel1.add(jLabel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jScrollPane1.setBorder(null);

        jTextA_View.setEditable(false);
        jTextA_View.setBackground(new java.awt.Color(179, 223, 245));
        jTextA_View.setColumns(20);
        jTextA_View.setRows(5);
        jScrollPane1.setViewportView(jTextA_View);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 310, 120));

        jLabel_Time.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Time.setText("交易時間");
        jPanel1.add(jLabel_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jScrollPane6.setBorder(null);

        jTextF_Author.setEditable(false);
        jTextF_Author.setBackground(new java.awt.Color(179, 223, 245));
        jTextF_Author.setColumns(30);
        jTextF_Author.setLineWrap(true);
        jTextF_Author.setRows(1);
        jScrollPane6.setViewportView(jTextF_Author);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 310, 40));

        jScrollPane7.setBorder(null);

        jTextF_Time.setEditable(false);
        jTextF_Time.setBackground(new java.awt.Color(179, 223, 245));
        jTextF_Time.setColumns(30);
        jTextF_Time.setLineWrap(true);
        jTextF_Time.setRows(1);
        jScrollPane7.setViewportView(jTextF_Time);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 310, 40));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextF_Price.setEditable(false);
        jTextF_Price.setBackground(new java.awt.Color(179, 223, 245));
        jTextF_Price.setColumns(30);
        jTextF_Price.setLineWrap(true);
        jTextF_Price.setRows(1);
        jScrollPane8.setViewportView(jTextF_Price);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 310, 30));

        jLabel_Price.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Price.setText("價格");
        jPanel1.add(jLabel_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jScrollPane9.setBorder(null);

        jTextF_Name.setEditable(false);
        jTextF_Name.setBackground(new java.awt.Color(179, 223, 245));
        jTextF_Name.setColumns(30);
        jTextF_Name.setLineWrap(true);
        jTextF_Name.setRows(1);
        jScrollPane9.setViewportView(jTextF_Name);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 310, 40));

        jButt_Collect.setBackground(new java.awt.Color(204, 255, 255));
        jButt_Collect.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jButt_Collect.setText("收藏");
        jButt_Collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButt_CollectActionPerformed(evt);
            }
        });
        jPanel1.add(jButt_Collect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButt_CollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButt_CollectActionPerformed
   
    	}

    //GEN-LAST:event_jButt_CollectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
         //   public void run() {
              //  new Buy().setVisible(true);
           // }
       // });
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButt_Collect;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_BkSitua;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Photo;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JLabel jLabel_View;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextA_BkSitua;
    private javax.swing.JTextArea jTextA_View;
    private javax.swing.JTextArea jTextF_Author;
    private javax.swing.JTextArea jTextF_Name;
    private javax.swing.JTextArea jTextF_Price;
    private javax.swing.JTextArea jTextF_Time;
    // End of variables declaration//GEN-END:variables
}
