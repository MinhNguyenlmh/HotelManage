/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener {
    JLabel heading, lblroomo, lblavailable , lblclean, lblprice, lbltype;
    JButton add, cancel;
    JTextField tfroom, tfprice;
    JComboBox  availablecombo, cleancombo, typecombo;
    AddRooms(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        heading = new JLabel("Thêm Phòng");
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        heading.setBounds(150, 20, 200, 30);
        add(heading);
        
        // number room
        lblroomo = new JLabel("Số Phòng");
        lblroomo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblroomo.setBounds(60, 80, 120, 30);
        add(lblroomo);
        tfroom = new JTextField();
        tfroom.setBounds(200, 80, 200, 30);
        add(tfroom);
        
        // trạng thái
        lblavailable = new JLabel("Trạng thái");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblavailable.setBounds(60, 130, 120, 30);
        add(lblavailable);
        // ô available
        String availibleOptions[] = { "Trống", "Đã thuê"};
        availablecombo = new JComboBox(availibleOptions);
        availablecombo.setBounds(200, 130, 200, 30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        // dọn dẹp
        lblclean = new JLabel("Dọn dẹp");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblclean.setBounds(60, 180, 120, 30);
        add(lblclean);
        // ô 
        String cleanOptions[] = { "Sạch", "Bẩn"};
        cleancombo = new JComboBox(cleanOptions);
        cleancombo.setBounds(200, 180, 200, 30);
        cleancombo.setBackground(Color.WHITE);
        add(cleancombo);
        
        // giá
        lblprice = new JLabel("Giá(VND)");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblprice.setBounds(60, 230, 120, 30);
        add(lblprice);
        tfprice = new JTextField();
        tfprice.setBounds(200, 230, 200, 30);
        add(tfprice);
        
        // loại giường
        lbltype = new JLabel("Loại giường");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltype.setBounds(60, 280, 120, 30);
        add(lbltype);
        String typeOptions[] = { "Giường đơn", "Giường đôi"};
        typecombo = new JComboBox(typeOptions);
        typecombo.setBounds(200, 280, 200, 30);
        typecombo.setBackground(Color.WHITE);
        add(typecombo);
        
        add = new JButton("Thêm");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(80, 350, 130, 30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Thoát");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(250, 350, 130, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(380, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 70, 380, 280);
        add(image);
        
        setBounds(330, 200, 940, 470);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String roomnumber = tfroom.getText();
            String avai = (String) availablecombo.getSelectedItem();
            String status = (String) cleancombo.getSelectedItem();
            String price = tfprice.getText();
            String type = (String) typecombo.getSelectedItem();
            
            try{
                Conn conn = new Conn();
                String str = "Thêm vào('"+roomnumber+"', '"+avai+"', '"+status+"', '"+price+"', '"+type+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null,"Thêm phòng mới thành công");
                
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
        new AddRooms();
    }
}
