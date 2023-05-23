package qlyks;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QLYKS extends JFrame implements ActionListener {
    
    JButton next;

    public QLYKS(){
        setSize(1457, 802);
        setBounds(90, 110, 1457, 840);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/image1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1457, 802, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1457, 802);
        add(image);
       
        next = new JButton("Login");
        next.setBounds(660, 360, 120, 50);
        next.setBackground(new Color(107, 142, 35));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("Arial", Font.BOLD, 26));
        image.add(next);
        
        JButton close = new JButton("Close");
        close.setBounds(1200, 700, 120, 50);
        close.setBackground(new Color(107, 142, 35));
        close.setForeground(Color.WHITE);
        close.addActionListener(this);
        close.setFont(new Font("Arial", Font.BOLD, 26));
        image.add(close);
        
        setVisible(true);

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == next)
         {
             new Login(). setVisible(true);
             this.dispose();
         }
         else{
             System.exit(0);
         }
    }
    
    public static void main(String[] args) {
        new QLYKS();
    }

    
}
