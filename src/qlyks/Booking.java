package qlyks;
import java.sql.*; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
        this.dispose();
        GetRooms();
        GetCustomers();
        ShowBookings();
        BCost.setEditable(false);
        setBounds(110, 110, 1457, 840);
    }
     
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    
    int RC;
    private void GetCost(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Price from Rooms where RNumber = "+BRoom.getSelectedItem().toString());
            Rs1.next();
            RC = Rs1.getInt(1);
            BCost.setText(""+RC);
            
        }catch (SQLException e){  
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void GetRooms(){
        try{
            String S = "Free";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Rooms where Status = '"+S+"'");
            while(Rs.next()){
                //String R = Rs.getInt("RNum");
                String R = String.valueOf(Rs.getInt("RNumber"));
                BRoom.addItem(R);
            }
        }catch (SQLException e){  
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void UpdateRoom()
    {
            try {
                String S = "Booked";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
        
                PreparedStatement Save = Con.prepareStatement("Update Rooms set Status = ? where RNumber = ?");
                Save.setInt(2, Integer.valueOf(BRoom.getSelectedItem().toString()));
                Save.setString(1, S);
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Update!");
                Con.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }
    
    private void UpdatetoFree()
    {
            try {
                String S = "Free";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
        
                PreparedStatement Save = Con.prepareStatement("Update Rooms set Status = ? where RNumber = ?");
                Save.setInt(2, R);
                Save.setString(1, S);
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Update!");
                Con.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    
    private void GetCustomers(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Customers");
            while(Rs.next()){
                //int C = Rs.getInt("CustNum");
                String C = String.valueOf(Rs.getInt("CNumber"));
                BCustomer.addItem(C); 
            }
        }catch (Exception e){  
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Customers = new javax.swing.JLabel();
        Bookings = new javax.swing.JLabel();
        LogoutC = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Rooms = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingList = new javax.swing.JTable();
        BSum = new java.awt.Button();
        BCancel = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        BDate = new com.toedter.calendar.JDateChooser();
        BDuration = new javax.swing.JTextField();
        BCustomer = new javax.swing.JComboBox<>();
        BRoom = new javax.swing.JComboBox<>();
        BAdd = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
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

        LogoutC.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        LogoutC.setForeground(new java.awt.Color(255, 255, 255));
        LogoutC.setText("Logout");
        LogoutC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutCMouseClicked(evt);
            }
        });

        Dashboard.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });

        Rooms.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Rooms.setForeground(new java.awt.Color(255, 255, 255));
        Rooms.setText("Rooms");
        Rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(30, 30, 30)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Room");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Customer");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Booking Date");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Duration in Days");

        BCost.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCostActionPerformed(evt);
            }
        });

        BookingList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BookingList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BookingList.setForeground(new java.awt.Color(0, 102, 51));
        BookingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Rooms", "Customer", "Date", "Check out", "Duration", "Cost"
            }
        ));
        BookingList.setFillsViewportHeight(true);
        BookingList.setRowHeight(25);
        BookingList.setRowMargin(1);
        BookingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookingList);

        BSum.setBackground(new java.awt.Color(204, 204, 204));
        BSum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BSum.setForeground(new java.awt.Color(153, 0, 153));
        BSum.setLabel("Sum");
        BSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSumActionPerformed(evt);
            }
        });

        BCancel.setBackground(new java.awt.Color(204, 204, 0));
        BCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BCancel.setLabel("Cancel");
        BCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("BOOKING");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 51));
        jLabel30.setText("Cost");

        BDuration.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDurationActionPerformed(evt);
            }
        });

        BCustomer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCustomerActionPerformed(evt);
            }
        });

        BRoom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BRoom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BRoomItemStateChanged(evt);
            }
        });

        BAdd.setBackground(new java.awt.Color(51, 153, 0));
        BAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BAdd.setLabel("Book");
        BAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(BAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BSum, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BRoom, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BCustomer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(BDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(551, 551, 551))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(86, 86, 86)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BCost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(BAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomersMouseClicked

    private void LogoutCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutCMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutCMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new Dashboardd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void RoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsMouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RoomsMouseClicked

    private void BCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCostActionPerformed
    private  void ShowBookings() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Booking");
            BookingList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e){
        } 
    }
    
    int Bid;
    private void CountBookings()
    {
        try{
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(BNumber) from Booking");
            Rs.next();
            Bid = Rs.getInt(1 ) + 1;
        }catch(SQLException e){
            
        }
    }
   
    int R;
    private void BookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingListMouseClicked
        DefaultTableModel model = (DefaultTableModel)BookingList.getModel();
        int MyIndex = BookingList.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        R = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
        BRoom.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        BCustomer.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        BDuration.setText(model.getValueAt(MyIndex, 3).toString());
        BCost.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_BookingListMouseClicked

    private void BSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSumActionPerformed
        int TotAmt = RC *Integer.valueOf(BDuration.getText().toString());
        BCost.setText(""+TotAmt);
    }//GEN-LAST:event_BSumActionPerformed

     int Key = 0;
    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Missing Data");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("delete from Booking where BNumber = ? ");
                Save.setInt(1, Key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Booking Deleted!");
                ShowBookings();
                UpdatetoFree();
                BRoom.removeAllItems();
                GetRooms();
                Con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_BCancelActionPerformed

    private void BDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDurationActionPerformed

    private void BCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCustomerActionPerformed

    private void BRoomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BRoomItemStateChanged
        GetCost();
    }//GEN-LAST:event_BRoomItemStateChanged

    private void BAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAddActionPerformed
        if(BRoom.getSelectedIndex() == -1  || BCustomer.getSelectedIndex() == -1 || BDuration.getText().isEmpty() || BCost.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                String Bdate = BDate.getDate().toString().substring(0, 11);
                CountBookings();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss?autoReconnectForPools=false&useSSL=false","root","Huydvs1403");
                PreparedStatement Save = Con.prepareStatement("insert into Booking values(?,?,?,?,?,?)");
                Save.setInt(1, Bid);
                Save.setInt(2, Integer.valueOf(BRoom.getSelectedItem().toString()));
                Save.setInt(3, Integer.valueOf(BCustomer.getSelectedItem().toString()));
                Save.setString(4, Bdate);
                Save.setInt(5, Integer.valueOf(BDuration.getText()));
                Save.setInt(6, Integer.valueOf(BCost.getText()));

                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Booked!");
                ShowBookings();
                UpdateRoom();
                BRoom.removeAllItems();
                GetRooms();
                Con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_BAddActionPerformed

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BAdd;
    private java.awt.Button BCancel;
    private javax.swing.JTextField BCost;
    private javax.swing.JComboBox<String> BCustomer;
    private com.toedter.calendar.JDateChooser BDate;
    private javax.swing.JTextField BDuration;
    private javax.swing.JComboBox<String> BRoom;
    private java.awt.Button BSum;
    private javax.swing.JTable BookingList;
    private javax.swing.JLabel Bookings;
    private javax.swing.JLabel Customers;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel LogoutC;
    private javax.swing.JLabel Rooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
