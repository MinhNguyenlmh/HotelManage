package qlyks;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Employee extends javax.swing.JFrame {
    
    public Employee() {
        initComponents();
        this.dispose();
        ShowEmployee();
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
        Customer = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        LogoutC = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Room = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EName = new javax.swing.JTextField();
        EAddress = new javax.swing.JTextField();
        EGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeList = new javax.swing.JTable();
        EAdd = new java.awt.Button();
        EEdit = new java.awt.Button();
        EDelete = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        EPhone = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        EBirth = new com.toedter.calendar.JDateChooser();
        ESearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ERefresh = new java.awt.Button();
        EJob = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        ESalary = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(0, 102, 51));

        Customer.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setText("Customer");
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
        });

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

        Room.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        Room.setForeground(new java.awt.Color(255, 255, 255));
        Room.setText("Rooms");
        Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomMouseClicked(evt);
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
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Customer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Date of Birthday");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Address");

        EName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENameActionPerformed(evt);
            }
        });

        EAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAddressActionPerformed(evt);
            }
        });

        EGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        EmployeeList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EmployeeList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeeList.setForeground(new java.awt.Color(0, 102, 51));
        EmployeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Gender", "Address", "Date of Birthday", "Job", "Salary"
            }
        ));
        EmployeeList.setFillsViewportHeight(true);
        EmployeeList.setRowHeight(25);
        EmployeeList.setRowMargin(1);
        EmployeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeList);

        EAdd.setBackground(new java.awt.Color(51, 153, 0));
        EAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EAdd.setLabel("Add");
        EAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAddActionPerformed(evt);
            }
        });

        EEdit.setBackground(new java.awt.Color(204, 204, 0));
        EEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EEdit.setLabel("Edit");
        EEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EEditMouseClicked(evt);
            }
        });
        EEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEditActionPerformed(evt);
            }
        });

        EDelete.setActionCommand("Delete");
        EDelete.setBackground(new java.awt.Color(204, 102, 0));
        EDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EDelete.setLabel("Delete");
        EDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("EMPLOYEE MANAGEMENT");

        EPhone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EPhoneActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 51));
        jLabel30.setText("Gender");

        ESearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ESearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ESearchCaretUpdate(evt);
            }
        });
        ESearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Search");

        ERefresh.setBackground(new java.awt.Color(204, 204, 204));
        ERefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ERefresh.setForeground(new java.awt.Color(153, 0, 153));
        ERefresh.setLabel("Refresh");
        ERefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ERefreshMouseClicked(evt);
            }
        });
        ERefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ERefreshActionPerformed(evt);
            }
        });

        EJob.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Kế toán", "Lễ tân", "Đầu bếp", "Tạp vụ" }));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 51));
        jLabel31.setText("Job");

        ESalary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ESalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESalaryActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 51));
        jLabel32.setText("Salary");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(403, 403, 403)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ESearch, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ERefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(EAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(EDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EAddress)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(EPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EJob, javax.swing.GroupLayout.Alignment.TRAILING, 0, 274, Short.MAX_VALUE)
                                    .addComponent(ESalary, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ESearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(ERefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(12, 12, 12)
                        .addComponent(EGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EJob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ESalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  void ShowEmployee() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Employee");
            EmployeeList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)
        {         
        }
    }
    
    private  void Search() 
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from Employee where Name like '"+ESearch.getText()+"%'");
//            String query = "SELECT * FROM Customers WHERE Name LIKE ? OR Phone LIKE ? OR Gender LIKE ? OR Address LIKE ? OR Birth LIKE ?";
//            Pst = Con.prepareStatement(query);
//            Pst.setString(1, CSearch.getText() + "%");
//            Pst.setString(2, CSearch.getText() + "%");
//            Pst.setString(3, CSearch.getText() + "%");
//            Pst.setString(4, CSearch.getText() + "%");
//            Pst.setString(5, CSearch.getText() + "%");
            
            EmployeeList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e)    
        {   
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    int Cid;
    private void CountEmployee()
    {
        try{
            St = Con.createStatement();
            Rs = St.executeQuery("select Max(ENumber) from Employee");
            Rs.next();
            Cid = Rs.getInt(1) + 1;
        }catch(Exception e){
            
        }
    }
    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        new Booking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void LogoutCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutCMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutCMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new Dashboardd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void RoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomMouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RoomMouseClicked

    private void ENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENameActionPerformed

    private void EAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAddressActionPerformed

    private void EmployeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeListMouseClicked
        DefaultTableModel model = (DefaultTableModel)EmployeeList.getModel();
        int MyIndex = EmployeeList.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        EName.setText(model.getValueAt(MyIndex, 1).toString());
        EPhone.setText(model.getValueAt(MyIndex, 2).toString());
        EGender.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        EAddress.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_EmployeeListMouseClicked

    private void EAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAddActionPerformed
        if(EName.getText().isEmpty() || EGender.getSelectedIndex() == -1 || EPhone.getText() .isEmpty() || EAddress.getText().isEmpty() || EJob.getSelectedIndex() == -1 || ESalary.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                String TheDob = EBirth.getDate().toString().substring(1, 10);
                CountEmployee();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
                Save.setInt(1, Cid);
                Save.setString(2, EName.getText().toString());
                Save.setString(3, EPhone.getText().toString());
                Save.setString(4, EGender.getSelectedItem().toString());
                Save.setString(5, EAddress.getText().toString());
                Save.setString(6, TheDob);
                Save.setString(7,EJob.getSelectedItem().toString());
                Save.setString(8, ESalary.getText().toString());

                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee Added!");
                Con.close();
                ShowEmployee();
                EName.setText("");
                EPhone.setText("");
                EAddress.setText("");
                ESalary.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EAddActionPerformed

    private void EEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EEditMouseClicked
        if(EName.getText().isEmpty() || EGender.getSelectedIndex() == -1 || EPhone.getText().isEmpty() || EAddress.getText().isEmpty() || EJob.getSelectedIndex() == -1 || ESalary.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                String TheDob = EBirth.getDate().toString().substring(1, 10);
                CountEmployee();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("update Employee set Name = ?,Phone = ?,Gender = ?,Address = ?, Birth = ?, Job = ?, Salary = ? where ENumber = ?");
                Save.setInt(8, Key);
                Save.setString(1, EName.getText().toString());
                Save.setString(2, EPhone.getText().toString());
                Save.setString(3, EGender.getSelectedItem().toString());
                Save.setString(4, EAddress.getText().toString());
                Save.setString(5, TheDob);
                Save.setString(6,EJob.getSelectedItem().toString());
                Save.setString(7, ESalary.getText().toString());

                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee Update!");
                Con.close();
                ShowEmployee();
                EName.setText("");
                EPhone.setText("");
                EAddress.setText("");
                ESalary.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EEditMouseClicked

    private void EEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EEditActionPerformed

    int Key = 0;
    private void EDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDeleteActionPerformed
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Missing Data!");
        }
        else{
            try {
                CountEmployee();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlykss","root","Huydvs1403");

                PreparedStatement Save = Con.prepareStatement("delete from Employee where ENumber = ? ");
                Save.setInt(1, Key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Employee Deleted!");
                Con.close();
                ShowEmployee();
                EName.setText("");
                EPhone.setText("");
                EAddress.setText("");
                ESalary.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EDeleteActionPerformed

    private void EPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EPhoneActionPerformed

    private void ESearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ESearchCaretUpdate
        Search();
    }//GEN-LAST:event_ESearchCaretUpdate

    private void ESearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESearchActionPerformed

    }//GEN-LAST:event_ESearchActionPerformed

    private void ERefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ERefreshMouseClicked
        ShowEmployee();
        ESearch.setText("");
    }//GEN-LAST:event_ERefreshMouseClicked

    private void ERefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ERefreshActionPerformed
        ShowEmployee();
        ESearch.setText("");

    }//GEN-LAST:event_ERefreshActionPerformed

    private void ESalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESalaryActionPerformed

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Dashboard;
    private java.awt.Button EAdd;
    private javax.swing.JTextField EAddress;
    private com.toedter.calendar.JDateChooser EBirth;
    private java.awt.Button EDelete;
    private java.awt.Button EEdit;
    private javax.swing.JComboBox<String> EGender;
    private javax.swing.JComboBox<String> EJob;
    private javax.swing.JTextField EName;
    private javax.swing.JTextField EPhone;
    private java.awt.Button ERefresh;
    private javax.swing.JTextField ESalary;
    private javax.swing.JTextField ESearch;
    private javax.swing.JLabel Employee;
    private javax.swing.JTable EmployeeList;
    private javax.swing.JLabel LogoutC;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
