import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;

public class cu {
    private JFrame frame;
    private final JScrollPane scrollPane = new JScrollPane();
    private final JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    cu window = new cu();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public cu() {
        initialize();
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 524, 385);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 510, 338);
        frame.getContentPane().add(scrollPane);
        
        JTextArea headerTextArea = new JTextArea();
        headerTextArea.setEditable(false);
        headerTextArea.setFont(new Font("MS PGothic", Font.BOLD, 14));
        headerTextArea.setBackground(new Color(196, 208, 230));
        headerTextArea.setText("客服");
        scrollPane.setColumnHeaderView(headerTextArea);
        panel.setBackground(new Color(196, 208, 230));
        
        scrollPane.setViewportView(panel);
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JTextArea txtrCustomerService_1 = new JTextArea();
        txtrCustomerService_1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
        txtrCustomerService_1.setEditable(false);
        txtrCustomerService_1.setText("\r\n  買家常見問題：\r\n");
        txtrCustomerService_1.setFont(new Font("MS PGothic", Font.BOLD, 14));
        txtrCustomerService_1.setBackground(new Color(196, 208, 230));
        panel.add(txtrCustomerService_1);
        
        JTextArea textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        textArea1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
        textArea1.setText(" 1）請問可以收藏喜歡的商品嗎？\r\n 答：可以，在喜歡的商品點下收藏鍵即可收藏，之後在收藏頁面\r\n 就可以找到已收藏的商品！");
        panel.add(textArea1);
        
        JTextArea textArea2 = new JTextArea();
        textArea2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        textArea2.setText(" 2)  請問如何付款？\r\n 答:  依照買家聯絡資訊，自行聯繫買家，和買家約定買賣契約的細節即可。");
        textArea2.setEditable(false);
        textArea2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        panel.add(textArea2);
        
        JTextArea txtrCustomerService = new JTextArea();
        txtrCustomerService.setEditable(false);
        txtrCustomerService.setText("\r\n　賣家常見問題：\r\n");
        txtrCustomerService.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
        txtrCustomerService.setBackground(new Color(196, 208, 230));
        panel.add(txtrCustomerService);
        
        JTextArea textArea3_1 = new JTextArea();
        textArea3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        textArea3_1.setEditable(false);
        textArea3_1.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
        textArea3_1.setCaretColor(new Color(0, 0, 0));
        textArea3_1.setBounds(new Rectangle(0, 0, 0, 2));
        textArea3_1.setText(" 1）怎麼聯絡買家？\r\n 答：在上傳商品的時候可以把自己的聯絡方式，如：電郵、電話、Line等資料\r\n 寫在簡介裡面。");
        panel.add(textArea3_1);
        
        JTextArea txtrid = new JTextArea();
        txtrid.setEditable(false);
        txtrid.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        txtrid.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
        txtrid.setText(" 2）怎麼下架已發布的商品？\r\n 答：去「我的主頁」輸入商品的ID，再按「下架」就可以了。");
        panel.add(txtrid);
        
        JTextArea textArea3 = new JTextArea();
        textArea3.setEditable(false);
        textArea3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        textArea3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
        textArea3.setText(" 3）上傳照片時照片被放大了怎麼辦？\r\n 答：賣家可以在自己的相冊把所需上傳的照片裁剪到 300*400 的大小，\r\n 再上傳便可。");
        panel.add(textArea3);
        
        JLabel lblNewLabel = new JLabel("　　　如有上述未被列出的問題　歡迎寄信聯繫我們　　　president@nccu.edu.tw");
        lblNewLabel.setBackground(new Color(196, 208, 230));
        panel.add(lblNewLabel);
    }
}
