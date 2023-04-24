package hotelmanager;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener{
    JTextField username;
    JPasswordField password;
    JButton login, cancel; 
    Login(){
        getContentPane().setBackground(Color.PINK);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        // ô chữ nhật cạnh username
        username = new JTextField();
        username.setBounds(150, 20, 200, 30);
        add(username);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 70, 100, 30);
        add(pass);
        // ô chữ nhật cạnh password
        password = new JPasswordField();
        password.setBounds(150, 70, 200, 30);
        add(password);
        
        // ô login
        login = new JButton("Login");
        login.setBounds(90, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        // ô cancel
        cancel = new JButton("Cancel");
        cancel.setBounds(230, 150, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,  Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200,200);
        add(image);
       
        setBounds(500, 200, 600, 300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == login){
            String user = username.getText();
            String pass = password.getText();
            
            try{
                Conn c = new Conn();
                
                String query = "'select * from login where username = '" + user + "' and password = '"+ pass +"'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Dashboard();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid us or password");
                    setVisible(false);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == cancel){
            setVisible(false);
        }
    }
   
    public static void main(String[] args){
        new Login();
    }
}



