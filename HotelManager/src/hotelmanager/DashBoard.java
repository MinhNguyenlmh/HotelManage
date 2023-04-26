
package quanlykhachsan;
import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame{
    
    DashBoard(){
        setBounds(0,0,1550,1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel(" H&M xin chào quý ");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN,45));
        text.setForeground(Color.RED);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.red);
        mb.add(hotel);
        
        
        JMenu reception = new JMenu("Reception");
        hotel.add(reception);
        
        JMenu admin = new JMenu("Người điều hành");
        admin.setForeground(Color.GREEN);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("thêm nhân viên");
        admin.add(addemployee);
      
        JMenuItem addroom = new JMenuItem("thêm phòng");
        admin.add(addroom);
        
        JMenuItem adddriver = new JMenuItem("thêm tài xế");
        admin.add(adddriver);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new DashBoard();
    }
}
