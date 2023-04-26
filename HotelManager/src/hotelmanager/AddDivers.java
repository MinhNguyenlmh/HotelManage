
package hotelmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public abstract class AddDrivers extends JFrame implements ActionListener{
    JTextField tfname,tfage,tfgender,tfcarcompany,tflocation;
    JButton add,cancel;
    JComboBox gendercombo,carcombo,availablecombo;
    AddDrivers(){
        
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        JLabel heading = new JLabel("Thêm Tài Xế");
        heading.setFont(new Font("Tahoma",Font.PLAIN,18));
        heading.setBounds(150, 20,200,20);
        add(heading);
        
        JLabel lbldriversno = new JLabel("Tên tài xế");
        lbldriversno.setFont(new Font("Tahoma",Font.PLAIN,18));
        lbldriversno.setBounds(60, 50,200,20);
        add(lbldriversno);
        
        tfname = new JTextField();
        tfname.setBounds(200,50,150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("Tuổi");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(60,90,150,30);
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200,90,150,30);
        add(tfage);
        
        JLabel lblgender = new JLabel("Giới Tính");
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblgender.setBounds(60,130,150,30);
        add(lblgender);
        
        String cleanOptions[] = {"Nam","Nữ"};
        gendercombo = new JComboBox(cleanOptions);
        gendercombo.setBounds(200,130,150,30);
        gendercombo.setBackground(Color.red);
        gendercombo.setForeground(Color.GREEN);
        add(gendercombo);
    
        JLabel lblcarcompany = new JLabel("Công ty ô tô");
        lblcarcompany.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblcarcompany.setBounds(60,170,150,30);
        add(lblcarcompany);
        
        tfcarcompany = new JTextField();
        tfcarcompany.setBounds(200,170,150,30);
        add(tfcarcompany);
        
        JLabel lblcarmodel = new JLabel("Mẫu xe");
        lblcarmodel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblcarmodel.setBounds(60,210,150,30);
        add(lblcarmodel);
        
        String typeOptions[] = {"Lambogyni","Ferary","Shuzuki","VinFast","BMW","Messedes"};
        carcombo = new JComboBox(typeOptions);
        carcombo.setBounds(200,210,150,30);
        carcombo.setBackground(Color.red);
        carcombo.setForeground(Color.GREEN);
        add(carcombo); 
        
        JLabel lblavailabel = new JLabel("Có sẵn");
        lblavailabel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailabel.setBounds(60,250,150,30);
        add(lblavailabel);
        
        String availabelOptions[] = {"Rảnh","Bận"};
        availablecombo = new JComboBox(availabelOptions);
        availablecombo.setBounds(200,250,150,30);
        availablecombo.setBackground(Color.red);
        availablecombo.setForeground(Color.GREEN);
        add(availablecombo); 
        
        JLabel lbllocation = new JLabel("Vị Trí");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbllocation.setBounds(60,290,150,30);
        add(lbllocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200,290,150,30);
        add(tflocation);
        
        add = new JButton("THÊM");
        add.setFont(new Font("Tahoma",Font.PLAIN,16));
        add.setBounds(60,350,150,30);
        add.setBackground(Color.GRAY);
        add.setForeground(Color.GREEN);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("HỦY");
        cancel.setFont(new Font("Tahoma",Font.PLAIN,16));
        cancel.setBounds(250,350,150,30);
        cancel.setBackground(Color.GRAY);
        cancel.setForeground(Color.GREEN);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        
        
        setBounds(300,200,980,470);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String carcompany = tfcarcompany.getText();
            String model = (String) carcombo.getSelectedItem();
            String available = (String) availablecombo.getSelectedItem();
            String location = tflocation.getText();
            try {
            Conn conn = new Conn();
            String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+carcompany+"','"+brand+"','"+available+"', '"+location+"')";
            conn.s.extends(false);

        } catch (Exception e){
            e.printStackTrace();
        }
            
        } else{
            setVisible(false); 
        }
        
    }
    
    public static void main(String[] args){
        new AddDrivers() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        
    }

    
}
