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
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        hotel.setForeground(Color.BLUE);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("THÊM NHÂN VIÊN");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("THÊM PHÒNG ");
        addrooms.addActionListener(this);
        admin.add(addrooms );
        
        JMenuItem addrives = new JMenuItem("ADD DRIVERS");
        admin.add(addrives);
        
        setVisible(true);
        
        public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("THÊM NHÂN VIÊN")){
            new AddEmployee();
        }else if(ae.getActionCommand().equals("THÊM PHÒNG")){
            new AddRooms();
        }
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
