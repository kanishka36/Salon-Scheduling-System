
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 

public class EmployeeForm extends javax.swing.JFrame {

    final String password = "";
    final String userName = "root";
    final String URL = "jdbc:mysql://localhost:3306/salon management system";
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private DefaultTableModel employeeTableModel;
    
    public EmployeeForm() {
        
        initComponents();
        
        employeeTableModel = new DefaultTableModel();
        employeeTable.setModel(employeeTableModel);
        employeeTableModel.setColumnIdentifiers(new Object[] { "Employee Name", "Age", "Gender", "Address", "Email", "Phone Number", "Employee ID" });
        buttonGroup1.add(maleRadioButton);
        buttonGroup1.add(femaleRadioButton);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, userName, password);
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                String employeeName = rs.getString("emp_name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                int employeeId = rs.getInt("emp_id");

                employeeTableModel.addRow(new Object[]{employeeName, age, gender, address, email, phoneNumber, employeeId});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        btnGoBack = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 188, 156));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 247, 247));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(247, 247, 247));
        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 247));
        jLabel6.setText("Address");

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Employee Name");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 247, 247));
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 247, 247));
        jLabel3.setText("Gender");

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(91, 73, 70));

        txtPhoneNumber.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(91, 73, 70));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(91, 73, 70));
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        maleRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        maleRadioButton.setText("Male");

        femaleRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        femaleRadioButton.setText("Female");

        txtName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(91, 73, 70));

        txtAge.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(91, 73, 70));

        txtDetails.setBackground(new java.awt.Color(135, 111, 101));
        txtDetails.setColumns(20);
        txtDetails.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtDetails.setForeground(new java.awt.Color(247, 247, 247));
        txtDetails.setRows(5);
        jScrollPane4.setViewportView(txtDetails);

        btnAdd.setBackground(new java.awt.Color(91, 73, 70));
        btnAdd.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(247, 247, 247));
        btnAdd.setText("Add Employee");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(91, 73, 70));
        btnEdit.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(247, 247, 247));
        btnEdit.setText("Edit Employee");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(91, 73, 70));
        btnUpdate.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(247, 247, 247));
        btnUpdate.setText("Update Employee");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(91, 73, 70));
        btnDelete.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(247, 247, 247));
        btnDelete.setText("Delete Employee");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDetails.setBackground(new java.awt.Color(91, 73, 70));
        btnDetails.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(247, 247, 247));
        btnDetails.setText("Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        employeeTable.setBackground(new java.awt.Color(135, 111, 101));
        employeeTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        employeeTable.setForeground(new java.awt.Color(247, 247, 247));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTable.setSelectionBackground(new java.awt.Color(91, 73, 70));
        jScrollPane2.setViewportView(employeeTable);

        btnGoBack.setBackground(new java.awt.Color(91, 73, 70));
        btnGoBack.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(247, 247, 247));
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(849, 849, 849)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtAge)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnEdit)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGoBack)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String employeeName = txtName.getText();
        String age = txtAge.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }

        try {
            String query = "INSERT INTO employee (emp_name, age, gender, address, email, phone_number) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, employeeName);
            pst.setString(2, age);
            pst.setString(3, gender);
            pst.setString(4, address);
            pst.setString(5, email);
            pst.setString(6, phoneNumber);

            pst.executeUpdate();
            ResultSet generatedKeys = pst.getGeneratedKeys();
            int employeeId;
            if (generatedKeys.next()) {
                employeeId = generatedKeys.getInt(1);
                employeeTableModel.addRow(new Object[]{employeeName, age, gender, address, email, phoneNumber, employeeId});
                JOptionPane.showMessageDialog(this, "Data saved successfully!");

                txtName.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtEmail.setText("");
                txtPhoneNumber.setText("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        
        int row = employeeTable.getSelectedRow();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row from Table");
            return;
        }
            
        String employeeName = (String) employeeTable.getValueAt(row, 0); 
        String age = (String) employeeTable.getValueAt(row, 1);
        String gender = (String) employeeTable.getValueAt(row,2);
        String address = (String) employeeTable.getValueAt (row, 3);
        String email = (String) employeeTable.getValueAt(row, 4);
        String phoneNumber = (String) employeeTable.getValueAt(row, 5);
        if (gender.equals("Male")) {
            maleRadioButton.setSelected(true);
        } else if (gender.equals("Female")) {
            femaleRadioButton.setSelected(true);
        }
            
        txtName.setText(employeeName);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtEmail.setText(email);
        txtPhoneNumber.setText(phoneNumber);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int row = employeeTable.getSelectedRow();

        if (row == -1) {
            
            return;
        }

        int employeeId = (int) employeeTable.getValueAt(row, 6);
        String employeeName = txtName.getText();
        String age = txtAge.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female"; 
        }

        try {
            String query = "UPDATE employee SET emp_name=?, age=?, gender=?, address=?, email=?, phone_number=? WHERE emp_id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, employeeName);
            pst.setString(2, age);
            pst.setString(3, gender);
            pst.setString(4, address);
            pst.setString(5, email);
            pst.setString(6, phoneNumber);
            pst.setInt(7, employeeId);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Update the values in the table model
                employeeTable.setValueAt(employeeName, row, 0);
                employeeTable.setValueAt(age, row, 1);
                employeeTable.setValueAt(gender, row, 2);
                employeeTable.setValueAt(address, row, 3);
                employeeTable.setValueAt(email, row, 4);
                employeeTable.setValueAt(phoneNumber, row, 5);

                JOptionPane.showMessageDialog(this, "Employee information updated successfully.");
                
            } else {
                JOptionPane.showMessageDialog(this, "No rows were affected. Update failed.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error updating employee information. Please try again.");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int row = employeeTable.getSelectedRow();

        if (row >= 0) {
            
            String employeeId = employeeTable.getValueAt(row, 6).toString();
            
            try {
                
                String query = "DELETE FROM employee WHERE emp_id = ?";
                pst = con.prepareStatement(query);
                pst.setString(1, employeeId);
                pst.executeUpdate();
                employeeTableModel.removeRow(row);
                
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        
        txtDetails.setText("");
        
        try {
            int row = employeeTable.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Select a row from Table");
                return;
            }

            int employeeId = (int) employeeTable.getValueAt(row, 6);




            String employeeName = (String) employeeTable.getValueAt(row, 0);
            String age = (String) employeeTable.getValueAt(row, 1);
            String gender = (String) employeeTable.getValueAt(row, 2);
            String address = (String) employeeTable.getValueAt(row, 3);
            String email = (String) employeeTable.getValueAt(row, 4);
            String phoneNumber = (String) employeeTable.getValueAt(row, 5);


            txtDetails.setText(txtDetails.getText() + "******************  CLIENT DETAILS  ****************\n\n");
            txtDetails.setText(txtDetails.getText() + "Client Name      : " + employeeName + "\n");
            txtDetails.setText(txtDetails.getText() + "Age                     : " + age + " Years" + "\n");
            txtDetails.setText(txtDetails.getText() + "Gender               : " + gender + "\n");
            txtDetails.setText(txtDetails.getText() + "Address              : " + address + "\n");
            txtDetails.setText(txtDetails.getText() + "Email                   : " + email + "\n");
            txtDetails.setText(txtDetails.getText() + "Phone Number  : " + phoneNumber + "\n");



        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        
        Homepage home = new Homepage();
        home.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable employeeTable;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
