package hotelmanager;

import javax.swing.*;
import java.awt.*;
public class Dashboard extends JFrame {
    Dashboard(){
        
        setBounds(0, 0, 1550, 1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("The Group Welcome You!");
        text.setBounds(400, 80, 1000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        // thanh menu
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0 , 1550, 50);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        hotel.setForeground(Color.BLUE);
        mb.add(admin);
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addemployee);
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        admin.add(addrooms );
        JMenuItem addrives = new JMenuItem("ADD EMPLOYEE");
        admin.add(addrives);
        
        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
