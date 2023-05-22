package qlyks;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Customer extends javax.swing.JFrame {

    public Customer() {
        initComponents();
        this.dispose();
        ShowCustomers();
        setBounds(110, 110, 1457, 840);
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        LogoutC = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        CAddress = new javax.swing.JTextField();
        CGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerList = new javax.swing.JTable();
        CAdd = new java.awt.Button();
        CEdit = new java.awt.Button();
        CDelete = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        CPhone = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CDate = new com.toedter.calendar.JDateChooser();
        CSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CRefresh = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(1457, 802));

        jPanel12.setBackground(new java.awt.Color(0, 102, 51));
        jPanel12.setPreferredSize(new java.awt.Dimension(164, 657));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Customer");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Booking");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
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

        Dashboard.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Rooms");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
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
                    .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Adddress");

        CName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameActionPerformed(evt);
            }
        });

        CAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAddressActionPerformed(evt);
            }
        });

        CGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        CustomerList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CustomerList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CustomerList.setForeground(new java.awt.Color(0, 102, 51));
        CustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Gender", "Address", "Date of Birthday"
            }
        ));
        CustomerList.setFillsViewportHeight(true);
        CustomerList.setRowHeight(25);
        CustomerList.setRowMargin(1);
        CustomerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerList);

        CAdd.setBackground(new java.awt.Color(51, 153, 0));
        CAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CAdd.setLabel("Add");
        CAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAddActionPerformed(evt);
            }
        });

        CEdit.setBackground(new java.awt.Color(204, 102, 0));
        CEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CEdit.setLabel("Edit");
        CEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CEditMouseClicked(evt);
            }
        });
        CEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEditActionPerformed(evt);
            }
        });

        CDelete.setActionCommand("Delete");
        CDelete.setBackground(new java.awt.Color(204, 204, 0));
        CDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CDelete.setLabel("Delete");
        CDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("CUSTOMER MANAGEMENT");

        CPhone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPhoneActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 51));
        jLabel30.setText("Date of Birthday");

        CSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CSearchCaretUpdate(evt);
            }
        });
        CSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("Search");

        CRefresh.setBackground(new java.awt.Color(204, 204, 204));
        CRefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CRefresh.setForeground(new java.awt.Color(153, 0, 153));
        CRefresh.setLabel("Refresh");
        CRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CRefreshMouseClicked(evt);
            }
        });
        CRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CAddress)
                                        .addComponent(CGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(CAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(CSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(385, 385, 385))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        new Booking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void LogoutCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutCMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutCMouseClicked

    private  void ShowCustomers() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Customers");
            CustomerList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)
        {         
        }
    }
    
    private  void Search() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Customers where Name like '"+CSearch.getText()+"%'");
            CustomerList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)    
        {   
                        JOptionPane.showMessageDialog(this, e);

        }
    }
    
    int Cid;
    private void CountCustomers()
    {
        try{
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(CNumber) from Customers");
            Rs.next();
            Cid = Rs.getInt(1) + 1;
        }catch(Exception e){
            
        }
    }
    
    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new Dashboardd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameActionPerformed

    private void CAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAddressActionPerformed

    private void CustomerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerListMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerList.getModel();
        int MyIndex = CustomerList.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CName.setText(model.getValueAt(MyIndex, 1).toString());
        CPhone.setText(model.getValueAt(MyIndex, 2).toString());
        CGender.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        CAddress.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_CustomerListMouseClicked

    private void CAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAddActionPerformed
        if(CName.getText().isEmpty() || CGender.getSelectedIndex() == -1 || CPhone.getText() .isEmpty() || CAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                String TheDob = CDate.getDate().toString().substring(1, 10);
                CountCustomers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("insert into Customers values(?,?,?,?,?,?)");
                Save.setInt(1, Cid);
                Save.setString(2, CName.getText().toString());
                Save.setString(3, CPhone.getText().toString());
                Save.setString(4, CGender.getSelectedItem().toString());
                Save.setString(5, CAddress.getText().toString());
                Save.setString(6, TheDob);

                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Added!");
                Con.close();
                ShowCustomers();
                CName.setText("");
                CAddress.setText("");
                CPhone.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_CAddActionPerformed

    int Key = 0;
    private void CEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CEditMouseClicked
        if(CName.getText().isEmpty() || CGender.getSelectedIndex() == -1 || CPhone.getText() .isEmpty() || CAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                String TheDob = CDate.getDate().toString().substring(1, 10);
                CountCustomers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("update Customers set Name = ?,Phone = ?,Gender = ?,Address = ?, Birth = ? where CNumber = ?");
                Save.setInt(6, Key);
                Save.setString(1, CName.getText().toString());
                Save.setString(2, CPhone.getText().toString());
                Save.setString(3, CGender.getSelectedItem().toString());
                Save.setString(4, CAddress.getText().toString());
                Save.setString(5, TheDob);

                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Update!");
                Con.close();
                ShowCustomers();
                CName.setText("");
                CAddress.setText("");
                CPhone.setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_CEditMouseClicked

    private void CEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEditActionPerformed

    private void CDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDeleteActionPerformed
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Customer!");
        }
        else{
            try {
                CountCustomers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("delete from Customers where CNumber = ? ");
                Save.setInt(1, Key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Deleted!");
                Con.close();
                ShowCustomers();
                CName.setText("");
                CAddress.setText("");
                CPhone.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_CDeleteActionPerformed

    private void CPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhoneActionPerformed

    private void CSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CSearchCaretUpdate
        Search();
    }//GEN-LAST:event_CSearchCaretUpdate

    private void CSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSearchActionPerformed

    }//GEN-LAST:event_CSearchActionPerformed

    private void CRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CRefreshMouseClicked

    private void CRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRefreshActionPerformed
        ShowCustomers();
        CSearch.setText("");
    }//GEN-LAST:event_CRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CAdd;
    private javax.swing.JTextField CAddress;
    private com.toedter.calendar.JDateChooser CDate;
    private java.awt.Button CDelete;
    private java.awt.Button CEdit;
    private javax.swing.JComboBox<String> CGender;
    private javax.swing.JTextField CName;
    private javax.swing.JTextField CPhone;
    private java.awt.Button CRefresh;
    private javax.swing.JTextField CSearch;
    private javax.swing.JTable CustomerList;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel LogoutC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
