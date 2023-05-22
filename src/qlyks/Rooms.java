package qlyks;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Rooms extends javax.swing.JFrame {
    
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    public Rooms() {
        initComponents();
        this.dispose();
        ShowRooms();
        setBounds(110, 110, 1457, 840);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Customers = new javax.swing.JLabel();
        Bookings = new javax.swing.JLabel();
        LogoutC = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        Rooms = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomTable = new javax.swing.JTable();
        RAdd = new java.awt.Button();
        REdit = new java.awt.Button();
        RDelete = new java.awt.Button();
        jLabel30 = new javax.swing.JLabel();
        RVip = new javax.swing.JComboBox<>();
        RName = new javax.swing.JTextField();
        RFree = new javax.swing.JComboBox<>();
        RCategory = new javax.swing.JComboBox<>();
        RStatus = new javax.swing.JComboBox<>();
        RRefresh = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(1457, 802));
        jPanel11.setPreferredSize(new java.awt.Dimension(1457, 802));

        jPanel12.setBackground(new java.awt.Color(0, 102, 51));

        Customers.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Customers.setForeground(new java.awt.Color(255, 255, 255));
        Customers.setText("Customer");
        Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersMouseClicked(evt);
            }
        });

        Bookings.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Bookings.setForeground(new java.awt.Color(255, 255, 255));
        Bookings.setText("Booking");
        Bookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingsMouseClicked(evt);
            }
        });

        LogoutC.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        LogoutC.setForeground(new java.awt.Color(255, 255, 255));
        LogoutC.setText("Logout");
        LogoutC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutCMouseClicked(evt);
            }
        });

        Employee.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setText("Employee");
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });

        Rooms.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Rooms.setForeground(new java.awt.Color(255, 255, 255));
        Rooms.setText("Rooms");

        Dashboard.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Bookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Dashboard)
                .addGap(240, 240, 240)
                .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Categories");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Status");

        RPrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPriceActionPerformed(evt);
            }
        });

        RoomTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RoomTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RoomTable.setForeground(new java.awt.Color(0, 102, 51));
        RoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Status", "Price"
            }
        ));
        RoomTable.setFillsViewportHeight(true);
        RoomTable.setRowHeight(25);
        RoomTable.setRowMargin(1);
        RoomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomTable);

        RAdd.setBackground(new java.awt.Color(51, 153, 0));
        RAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RAdd.setLabel("Add");
        RAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAddActionPerformed(evt);
            }
        });

        REdit.setBackground(new java.awt.Color(204, 204, 0));
        REdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        REdit.setLabel("Edit");
        REdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REditMouseClicked(evt);
            }
        });
        REdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REditActionPerformed(evt);
            }
        });

        RDelete.setActionCommand("Delete");
        RDelete.setBackground(new java.awt.Color(204, 102, 0));
        RDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RDelete.setLabel("Delete");
        RDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDeleteActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 51));
        jLabel30.setText("Price");

        RVip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RVip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vip", "Bouble Bed", "Single Bed", "Family" }));
        RVip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RVipItemStateChanged(evt);
            }
        });
        RVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVipActionPerformed(evt);
            }
        });

        RName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNameActionPerformed(evt);
            }
        });

        RFree.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RFree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Booked" }));
        RFree.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RFreeItemStateChanged(evt);
            }
        });
        RFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFreeActionPerformed(evt);
            }
        });

        RCategory.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Bed", "Bouble Bed", "Family", "Vip" }));
        RCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCategoryActionPerformed(evt);
            }
        });

        RStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Booked" }));
        RStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RStatusActionPerformed(evt);
            }
        });

        RRefresh.setBackground(new java.awt.Color(204, 204, 204));
        RRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RRefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RRefresh.setForeground(new java.awt.Color(153, 0, 153));
        RRefresh.setLabel("Refresh");
        RRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRefreshActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("Search");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("ROOM MANAGEMENT");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, 276, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(RName, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(RAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(REdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RVip, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RFree, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(446, 446, 446))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(RVip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RFree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(REdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(442, 442, 442))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private  void ShowRooms() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from rooms");
            RoomTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)
        {         
        }
    }
    
    private  void FilterByCat()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from rooms where Type = '"+RVip.getSelectedItem().toString()+"'");
            RoomTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)
        {         
        }
    }
    
    private  void FilterByStatus() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Rooms where Status = '"+RFree.getSelectedItem().toString()+"'");
            RoomTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)
        {         
        }
    }
    
    int Rid;
    private void CountRooms()
    {
        try{
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(RNumber) from Rooms");
            Rs.next();
            Rid = Rs.getInt(1) + 1;
        }catch(Exception e){
            
        }
    }
    private void LogoutCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutCMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutCMouseClicked

    private void RPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RPriceActionPerformed

    private void RAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAddActionPerformed
        if (RName.getText().isEmpty() || RCategory.getSelectedIndex() == -1 || RStatus.getSelectedIndex() == -1 || RPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        } else {
            try {
                CountRooms();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                // Kiểm tra dữ liệu đã tồn tại hay chưa
                String query = "SELECT * FROM Rooms WHERE name = ?";
                PreparedStatement checkData = Con.prepareStatement(query);
                checkData.setString(1, RName.getText().toString());
                ResultSet rs = checkData.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Data already exists!");
                } else {
                    // Thêm dữ liệu nếu chưa tồn tại
                    PreparedStatement Save = Con.prepareStatement("insert into Rooms values(?,?,?,?,?)");
                    Save.setInt(1, Rid);
                    Save.setString(2, RName.getText().toString());
                    Save.setString(3, RCategory.getSelectedItem().toString());
                    Save.setString(4, RStatus.getSelectedItem().toString());
                    Save.setInt(5, Integer.valueOf(RPrice.getText().toString()));
                    int row = Save.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Added!");
                    Con.close();
                    ShowRooms();
                    RName.setText("");
                    RPrice.setText("");   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_RAddActionPerformed

    
    private void REditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REditActionPerformed
  
       if (RName.getText().isEmpty() || RCategory.getSelectedIndex() == -1 || RStatus.getSelectedIndex() == -1 || RPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        } else {
            try {
                CountRooms();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                // Kiểm tra dữ liệu đã tồn tại hay chưa
                String query = "SELECT * FROM Rooms WHERE name = ?";
                PreparedStatement checkData = Con.prepareStatement(query);
                checkData.setString(1, RName.getText().toString());
                ResultSet rs = checkData.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Data already exists!");
                } else {
                    // Thêm dữ liệu nếu chưa tồn tại
                    PreparedStatement Save = Con.prepareStatement("Update Rooms set Name = ?,Type = ?, Status = ?,Price = ? where RNumber = ?");
                    Save.setInt(1, Rid);
                    Save.setString(2, RName.getText().toString());
                    Save.setString(3, RCategory.getSelectedItem().toString());
                    Save.setString(4, RStatus.getSelectedItem().toString());
                    Save.setInt(5, Integer.valueOf(RPrice.getText().toString()));
                    int row = Save.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Added!");
                    Con.close();
                    ShowRooms();
                    RName.setText("");
                    RPrice.setText("");   
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_REditActionPerformed

    int Key = 0;
    private void RDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDeleteActionPerformed
       if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                CountRooms();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
        
                PreparedStatement Save = Con.prepareStatement("delete from Rooms where RNumber = ? ");
                Save.setInt(1, Key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Deleted!");
                Con.close();
                ShowRooms();
                RName.setText("");
                RPrice.setText("");     
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_RDeleteActionPerformed

    private void RVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVipActionPerformed
       //JOptionPane.showConfirmDialog(this, "Hello");
       FilterByCat();
    }//GEN-LAST:event_RVipActionPerformed

    private void RNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNameActionPerformed

    private void RFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFreeActionPerformed
        FilterByStatus();
    }//GEN-LAST:event_RFreeActionPerformed

    private void RoomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)RoomTable.getModel();
        int MyIndex = RoomTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        RName.setText(model.getValueAt(MyIndex, 1).toString());
        RCategory.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        RStatus.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        RPrice.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_RoomTableMouseClicked

    private void REditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REditMouseClicked

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomersMouseClicked

    private void RCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RCategoryActionPerformed

    private void RStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RStatusActionPerformed

    private void RRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RRefreshActionPerformed
        ShowRooms();
    }//GEN-LAST:event_RRefreshActionPerformed

    private void RFreeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RFreeItemStateChanged
        FilterByStatus();
    }//GEN-LAST:event_RFreeItemStateChanged

    private void RVipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RVipItemStateChanged
        FilterByCat();
    }//GEN-LAST:event_RVipItemStateChanged

    private void BookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingsMouseClicked
        new Booking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookingsMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
         new Dashboardd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bookings;
    private javax.swing.JLabel Customers;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel LogoutC;
    private java.awt.Button RAdd;
    private javax.swing.JComboBox<String> RCategory;
    private java.awt.Button RDelete;
    private java.awt.Button REdit;
    private javax.swing.JComboBox<String> RFree;
    private javax.swing.JTextField RName;
    private javax.swing.JTextField RPrice;
    private java.awt.Button RRefresh;
    private javax.swing.JComboBox<String> RStatus;
    private javax.swing.JComboBox<String> RVip;
    private javax.swing.JTable RoomTable;
    private javax.swing.JLabel Rooms;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
