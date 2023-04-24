package hotelmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{

    JTextField tfname, tfemail, tfphone, tfage, tfsalary, tfaddhar;
    JRadioButton rbmale, rbfemale;
    JButton submit;
    JComboBox cbjob;
    AddEmployee(){
        setLayout(null);
        //name
        JLabel lblname = new JLabel("TÊN");
        lblname.setBounds(60, 30, 120, 30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblname);
        //ô name
        tfname = new JTextField();
        tfname.setBounds(200, 30, 230, 30);
        add(tfname);
       
        //age
        JLabel lblage = new JLabel("TUỔI");
        lblage.setBounds(60, 80, 120, 30);
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblage);
        //ô age
        tfage = new JTextField();
        tfage.setBounds(200, 80, 230, 30);
        add(tfage);
        
        // gender
        JLabel lblgender = new JLabel("GIỚI TÍNH");
        lblgender.setBounds(60, 130, 120, 30);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblgender);
        // ô gender
        rbmale = new JRadioButton("Nam");
        rbmale.setBounds(200, 130, 70, 30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        rbfemale = new JRadioButton("Nữ");
        rbfemale.setBounds(300, 130, 70, 30);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        // chỉ đc chọn 1 giới tính
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        //JOB
        JLabel lbljob = new JLabel("CÔNG VIỆC");
        lbljob.setBounds(60, 180, 120, 30);
        lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbljob); 
        // Ô JOB
        String str[] = {"Front Desk Clerks", "Porters", "Housekeeping", "Kitchen Staff", " Rom Service", "Chefs", "Wait/Waitress", "Manager", "Accountant"}; 
        cbjob = new JComboBox(str);
        cbjob.setBounds(200, 180, 230, 30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
        
        //salary
        JLabel lblsalary = new JLabel("LƯƠNG");
        lblsalary.setBounds(60, 230, 120, 30);
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblsalary);
        tfsalary = new JTextField();
        tfsalary.setBounds(200, 230, 230, 30);
        add(tfsalary);
        
        //phone
        JLabel lblphone = new JLabel("SĐT");
        lblphone.setBounds(60, 280, 120, 30);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblphone);
        tfphone = new JTextField();
        tfphone.setBounds(200, 280, 230, 30);
        add(tfphone);
        
        //emali
        JLabel lblemail = new JLabel("EMAIL");
        lblemail.setBounds(60, 330, 120, 30);
        lblemail.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblemail);
        tfemail = new JTextField();
        tfemail.setBounds(200, 330, 230, 30);
        add(tfemail);
        
        JLabel lbladdhar = new JLabel("ADDHAR");
        lbladdhar.setBounds(60, 380, 120, 30);
        lbladdhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbladdhar);
        tfaddhar = new JTextField();
        tfaddhar .setBounds(200, 380, 230, 30);
        add(tfaddhar);
        
        //submit
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200, 430, 150, 30);
        submit.addActionListener(this);
        add(submit);
        
        //ảnh
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(380, 380, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 30, 380, 380);
        add(image);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getName();
        String age = tfage.getText();
        String salary = tfsalary.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String addhar = tfaddhar.getText();
       
        String gender = null;
        
        if (name.equals("")){
            JOptionPane.showMessageDialog(null, "Ten khong de trong");
            return;
        }
        if(rbmale.isSelected()){
            gender = "Male";
        }else if(rbfemale.isSelected()){
            gender = "Female";
        }
        
        String job = (String) cbjob.getSelectedItem();
        
        try{
            Conn conn = new Conn();
            
            String query = "them thong tin nhan vien('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', '"+email+"', '"+addhar+"')";
            
            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Them nhan vien thanh cong");
            
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new AddEmployee(); 
    }
}
