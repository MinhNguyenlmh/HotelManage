package QlyKS;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        // ô chữ nhật cạnh username
        JTextField username = new JTextField();
        username.setBounds(150, 20, 200, 30);
        add(username);
        
        
        JLabel pass= new JLabel("Password");
        pass.setBounds(40, 70, 100, 30);
        add(pass);
        // ô chữ nhật cạnh password
        JTextField password = new JTextField();
        password.setBounds(150, 70, 200, 30);
        add(password);
        
        // ô login
        JButton login = new JButton("Login");
        login.setBounds(90, 150, 120, 30);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.WHITE);
        add(login);
        // ô cancel
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(230, 150, 120, 30);
        //cancel.setBackground(Color.BLACK);
        //cancel.setForeground(Color.WHITE);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,  Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200,200);
        add(image);
       
        setBounds(500, 200, 600, 300);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Login();
    }
}
