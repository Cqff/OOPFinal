
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

public class SellB extends javax.swing.JFrame {

	File f = null;
	String path = null;
	private ImageIcon format = null;
	int s = 0;
	byte[] pimage = null;
	boolean isNoteSelected;
	boolean isBookSelected;

	PreparedStatement ps;
	Connection connection;
	
	public SellB(Connection connection) {
        initComponents();
        this.connection = connection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel_Price = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jCB_Note = new javax.swing.JCheckBox();
        jCB_Book = new javax.swing.JCheckBox();
        jLabel_BkSitua = new javax.swing.JLabel();
        jLabel_Class = new javax.swing.JLabel();
        jCB_Major = new javax.swing.JComboBox<>();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_View = new javax.swing.JLabel();
        jLabel_Upload = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();
        jLabel_UploadB = new javax.swing.JLabel();
        jButt_Upload = new javax.swing.JButton();
        jButt_Submit = new javax.swing.JButton();
        jTextF_Time = new javax.swing.JTextField();
        jTextF_Name = new javax.swing.JTextField();
        jTextF_Price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextA_View = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextA_BkSitua = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextF_Author = new javax.swing.JTextField();
        jLabel_Photo = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayer(jLabel_Photo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
       jDesktopPane1.setLayout(jDesktopPane1Layout);
       jDesktopPane1Layout.setHorizontalGroup(
           jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
       );

        jLabel_Price.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Price.setText("價格");

        jLabel_Name.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Name.setText("名稱");

        jCB_Note.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jCB_Note.setText("電子筆記");
        jCB_Note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_NoteActionPerformed(evt);
            }
        });

        jCB_Book.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jCB_Book.setText("二手書");
        jCB_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_BookActionPerformed(evt);
            }
        });

        jLabel_BkSitua.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_BkSitua.setText("書況");

        jLabel_Class.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Class.setText("類別");

        jCB_Major.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jCB_Major.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "文學院", "商學院", "理學院", "資訊學院", "社會科學學院", "法學院", "外文學院", "傳播學院", "國際事務學院", "教育學院", "創新國際學院", "國際金融學院" }));

        jLabel_Author.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Author.setText("作者/出版社");

        jLabel_View.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_View.setText("簡介");

        jLabel_Upload.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Upload.setText("上傳圖片");

        jLabel_Time.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jLabel_Time.setText("交易時間");

        jLabel_UploadB.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_UploadB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButt_Upload.setBackground(new java.awt.Color(204, 255, 255));
        jButt_Upload.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jButt_Upload.setText("上傳");
        jButt_Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButt_UploadActionPerformed(evt);
            }
        });

        jButt_Submit.setBackground(new java.awt.Color(181, 181, 255));
        jButt_Submit.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        jButt_Submit.setText("繳交");
        jButt_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButt_SubmitActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jTextF_Time.setToolTipText("");
        jTextF_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_TimeActionPerformed(evt);
            }
        });

        jTextF_Name.setToolTipText("");
        jTextF_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_NameActionPerformed(evt);
            }
        });

        jTextF_Price.setToolTipText("");
        jTextF_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_PriceActionPerformed(evt);
            }
        });

        jTextA_View.setColumns(30);
        jTextA_View.setRows(5);
        jTextA_View.setTabSize(10);
        jScrollPane1.setViewportView(jTextA_View);

        jTextA_BkSitua.setColumns(30);
        jTextA_BkSitua.setRows(5);
        jTextA_BkSitua.setTabSize(10);
        jScrollPane2.setViewportView(jTextA_BkSitua);

        jTextF_Author.setToolTipText("");
        jTextF_Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_AuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(34)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jTextF_Time)
        						.addComponent(jLabel_View)
        						.addComponent(jLabel_BkSitua)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel_Price)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jTextF_Price, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jCB_Book)
        							.addGap(48)
        							.addComponent(jCB_Note))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel_Class)
        							.addGap(18)
        							.addComponent(jCB_Major, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel_Author)
        						.addComponent(jButt_Submit, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextF_Author))
        					.addGap(144)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jDesktopPane1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        							.addGap(6))
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jLabel_UploadB, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
        								.addComponent(jButt_Upload))
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jLabel_Upload)
        								.addGap(312)))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel_Name)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jTextF_Name, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel_Time))
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(443))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel_Upload)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
        					.addGap(1)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel_UploadB, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButt_Upload))
        					.addGap(497)))
        			.addGap(141))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(56)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_Name)
        				.addComponent(jTextF_Name, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_Price)
        				.addComponent(jTextF_Price, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jCB_Note)
        				.addComponent(jCB_Book))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_Class)
        				.addComponent(jCB_Major, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_Author)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTextF_Author, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_BkSitua)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_View)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_Time)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTextF_Time, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addComponent(jButt_Submit)
        			.addContainerGap(307, Short.MAX_VALUE))
        );
        
        
        jLabel_Photo.setBounds(0, 0, 414, 302);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jCB_NoteActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	isNoteSelected = jCB_Note.isSelected();
    }                                        

    private void jCB_BookActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	 isBookSelected = jCB_Book.isSelected();
    }                                        

    private void jButt_UploadActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG, and JPEG Images", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();
            path = f.getAbsolutePath();
            jLabel_UploadB.setText(path);
            ImageIcon ii = new ImageIcon (path);
            Image img = ii.getImage().getScaledInstance(400, 300,Image.SCALE_SMOOTH);
            jLabel_Photo.setIcon(new ImageIcon(img));
           // ImageIcon icon = new ImageIcon(path);
          //  Image image = icon.getImage().getScaledInstance(jLabel_Photo.getWidth(), jLabel_Photo.getHeight(), Image.SCALE_SMOOTH);
         //   ImageIcon scaledIcon = new ImageIcon(image);
         //   jLabel_Photo.setIcon(scaledIcon);
            
            // Add the photo path to jLabel_UploadB
          
        }
    }                                      

    private void jButt_SubmitActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                             
            // Get the user information from input fields or variables
            String name = jTextF_Name.getText();
            double price = Double.parseDouble(jTextF_Price.getText());
            String type = "";
            if (isNoteSelected) {
            	type = jCB_Book.getText();
            }
            if (isBookSelected) {
            	 type = jCB_Note.getText();
            }
            String category = jCB_Major.getSelectedItem().toString();
            String author = jTextF_Author.getText();
            String situation = jTextA_BkSitua.getText();
            String view = jTextA_View.getText();
            String time = jTextF_Time.getText();
            
            File f = new File(path);
            String query = "INSERT INTO Sell_Book (ID,UserID,Name,Price, Type,Category,Author,Situation,View,Time,img,img_path) VALUES (DEFAULT, ?, ?,?,?,?,?,?,?,?,?,?)";
            try {
            	InputStream is = new FileInputStream(f);
            	PreparedStatement ps = connection.prepareStatement(query);
            	 ps.setInt(1, 111306055);
                 ps.setString(2, name);
                 ps.setDouble(3, price);
                 ps.setString(4, type);
                 ps.setString(5, category);
                 ps.setString(6, author);
                 ps.setString(7, situation);
                 ps.setString(8, view);
                 ps.setString(9, time);
                 ps.setBlob(10, is);
                 ps.setString(11, path);
                 ps.executeUpdate();
                 
                 ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  catch(FileNotFoundException ex) {
        	Logger.getLogger(SellB.class.getName()).log(Level.SEVERE,null,ex);
        }
         
    }                                         


    private void jTextF_TimeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextF_NameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextF_PriceActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextF_AuthorActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "111306047"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username = "111306047"; // change to your own username
		String password = "sfe0e"; // change to your own password
        //</editor-fold>

        /* Create and display the form */
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connectd");
			 java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new SellB(conn).setVisible(true);
		            }
		        });
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButt_Submit;
    private javax.swing.JButton jButt_Upload;
    private javax.swing.JCheckBox jCB_Book;
    private javax.swing.JComboBox<String> jCB_Major;
    private javax.swing.JCheckBox jCB_Note;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_BkSitua;
    private javax.swing.JLabel jLabel_Class;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JLabel jLabel_Upload;
    private javax.swing.JLabel jLabel_UploadB;
    private javax.swing.JLabel jLabel_View;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextA_BkSitua;
    private javax.swing.JTextArea jTextA_View;
    private javax.swing.JTextField jTextF_Author;
    private javax.swing.JTextField jTextF_Name;
    private javax.swing.JTextField jTextF_Price;
    private javax.swing.JTextField jTextF_Time;
    private javax.swing.JLabel jLabel_Photo;
}
