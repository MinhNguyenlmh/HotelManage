package hotelmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddDriver extends JFrame implements ActionListener {
    JLabel heading, lblname, lblavailable , lblcompany, lblmodel, lblage, lbllocation;
    JButton add, cancel;
    JTextField tfname, tfcompany, tfage, tfmodel, tflocation ;
    JComboBox  drivercombo, gendercombo;
    AddDriver(){
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300, 200, 980, 560);
        setLayout(null);
        
        heading = new JLabel("THÊM TÀI XẾ");
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        heading.setBounds(150, 20, 200, 30);
        add(heading);
        
        // name
        lblname = new JLabel("Tên");
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblname.setBounds(60, 90, 120, 30);
        add(lblname);
        tfname = new JTextField();
        tfname.setBounds(200, 90, 200, 30);
        add(tfname);
        
        // tuổi
        lblage = new JLabel("Tuổi");
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblage.setBounds(60, 140, 120, 30);
        add(lblage);
        tfage = new JTextField();
        tfage.setBounds(200, 140, 200, 30);
        add(tfage);
        
        // giới tính
        lblage = new JLabel("Giới Tính");
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblage.setBounds(60, 190, 120, 30);
        add(lblage);
        String cleanOptions[] = { "Nam", "Nữ"};
        gendercombo = new JComboBox(cleanOptions);
        gendercombo.setBounds(200, 190, 200, 30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        // o tô
        lblcompany = new JLabel("Hãng xe");
        lblcompany.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblcompany.setBounds(60, 240, 120, 30);
        add(lblcompany);
        tfcompany = new JTextField();
        tfcompany.setBounds(200, 240, 200, 30);
        add(tfcompany);
        
        // mẫu xe
        lblmodel = new JLabel("Tên loại xe");
        lblmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblmodel.setBounds(60, 290, 120, 30);
        add(lblmodel);
        tfmodel = new JTextField();
        tfmodel.setBounds(200, 290, 200, 30);
        add(tfmodel);
        
        // trang thái xe
        lblavailable = new JLabel("Trạng thái");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblavailable.setBounds(60, 340, 120, 30);
        add(lblavailable);
        String driverOptions[] = {"Trống", "Đã có"};
        drivercombo = new JComboBox(driverOptions);
        drivercombo.setBounds(200, 340, 200, 30);
        drivercombo.setBackground(Color.WHITE);
        add(drivercombo);
        
        // location
        lbllocation = new JLabel("Ví trí");
        lbllocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbllocation.setBounds(60, 390, 120, 30);
        add(lbllocation);
        tflocation = new JTextField();
        tflocation.setBounds(200, 390, 200, 30);
        add(tflocation);
        
        add = new JButton("Thêm");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(80, 450, 130, 30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Thoát");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(250, 450, 130, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 320, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 100, 470, 300);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company = tfcompany.getText();
            String brand = tfmodel.getText();
            String available = (String) drivercombo.getSelectedItem();
            String location = tflocation.getText();
            try{
                Conn conn = new Conn();
                String str = "Thêm vào('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null,"Thêm lái xe mới thành công");
                
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddDriver();
    }
}

