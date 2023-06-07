

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientManagement extends javax.swing.JFrame {
    
    final String password = "";
    final String userName = "root";
    final String URL = "jdbc:mysql://localhost:3306/salon management system";
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private DefaultTableModel clientTableModel;

    public ClientManagement() {
        initComponents();
        
        clientTableModel = new DefaultTableModel(); 
        clientTable.setModel(clientTableModel);  
        clientTableModel.setColumnIdentifiers(new Object[] { "First Name", "Last Name", "Age", "Gender", "Address", "Email", "Phone Number", "Note", "Client ID" });
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,userName,password);
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM client");
            
            
             // Fetch initial client data and populate the table
            while (rs.next()) {
                int clientId = rs.getInt("client_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                String note = rs.getString("note");
                
                clientTableModel.addRow(new Object[]{firstName, lastName, age, gender, address, email, phoneNumber, note, clientId});
            }
            
        } catch(Exception e) {
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 188, 156));

        clientTable.setBackground(new java.awt.Color(135, 111, 101));
        clientTable.setForeground(new java.awt.Color(247, 247, 247));
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
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
        clientTable.setSelectionBackground(new java.awt.Color(91, 73, 70));
        jScrollPane4.setViewportView(clientTable);

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 247, 247));
        jLabel4.setText("Search by Phone Number");

        txtSearch.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(91, 73, 70));

        btnSearch.setBackground(new java.awt.Color(91, 73, 70));
        btnSearch.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(247, 247, 247));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnGoBack.setBackground(new java.awt.Color(91, 73, 70));
        btnGoBack.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(247, 247, 247));
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(91, 73, 70));

        txtPhoneNumber.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(91, 73, 70));

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(91, 73, 70));

        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtNote.setForeground(new java.awt.Color(91, 73, 70));
        txtNote.setRows(5);
        jScrollPane2.setViewportView(txtNote);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(91, 73, 70));
        txtAddress.setRows(5);
        jScrollPane3.setViewportView(txtAddress);

        maleRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        maleRadioButton.setText("Male");

        femaleRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        femaleRadioButton.setText("Female");

        btnSave.setBackground(new java.awt.Color(91, 73, 70));
        btnSave.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(247, 247, 247));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Fist Name");

        btnEdit.setBackground(new java.awt.Color(91, 73, 70));
        btnEdit.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(247, 247, 247));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 247, 247));
        jLabel2.setText("Last Name");

        btnUpdate.setBackground(new java.awt.Color(91, 73, 70));
        btnUpdate.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(247, 247, 247));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 247, 247));
        jLabel3.setText("Address");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(247, 247, 247));
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 247));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(247, 247, 247));
        jLabel7.setText("Note");

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(247, 247, 247));
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(247, 247, 247));
        jLabel9.setText("Phone Number");

        txtFName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtFName.setForeground(new java.awt.Color(91, 73, 70));

        txtLName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtLName.setForeground(new java.awt.Color(91, 73, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(549, 549, 549)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addGap(22, 22, 22)
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(222, 222, 222))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(maleRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(femaleRadioButton))
                                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(27, 27, 27)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(maleRadioButton)
                                    .addComponent(femaleRadioButton)))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSave)
                                    .addComponent(btnEdit)
                                    .addComponent(btnUpdate)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnGoBack))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        
        
        String firstName = txtFName.getText();
        String lastName = txtLName.getText();
        String age = txtAge.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String note = txtNote.getText();
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }

        try {
            String query = "INSERT INTO client (first_name, last_name, age, gender, address, email, phone_number, note) VALUES (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, age);
            pst.setString(4,gender);
            pst.setString(5, address);
            pst.setString(6, email);
            pst.setString(7, phoneNumber);
            pst.setString(8, note);
             

            pst.executeUpdate();
            ResultSet generatedKeys = pst.getGeneratedKeys();
            int clientId;
            if (generatedKeys.next()) {
                clientId = generatedKeys.getInt(1);
                clientTableModel.addRow(new Object[]{firstName, lastName, age, gender, address, email, phoneNumber, note, clientId});
                JOptionPane.showMessageDialog(this, "saved");
                
                txtFName.setText("");
                txtLName.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtEmail.setText("");
                txtPhoneNumber.setText("");
                txtNote.setText("");
                genderButtonGroup.clearSelection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        int row = clientTable.getSelectedRow();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row from Table");
            return;
        }
            
        String firstName = (String) clientTable.getValueAt(row, 0); // Get the value from the "first name" column
        String lastName = (String) clientTable.getValueAt(row, 1);    
        String age = (String) clientTable.getValueAt(row, 2);
        String gender = (String) clientTable.getValueAt(row,3);
        String address = (String) clientTable.getValueAt (row, 4);
        String email = (String) clientTable.getValueAt(row, 5);
        String phoneNumber = (String) clientTable.getValueAt(row, 6);
        String note = (String) clientTable.getValueAt(row,7);
        if (gender.equals("Male")) {
            maleRadioButton.setSelected(true);
        } else if (gender.equals("Female")) {
            femaleRadioButton.setSelected(true);
        }
            
            
        txtFName.setText(firstName);
        txtLName.setText(lastName);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtEmail.setText(email);
        txtPhoneNumber.setText(phoneNumber);
        txtNote.setText(note);
             
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int row = clientTable.getSelectedRow();

        if (row == -1) {
            
            return;
        }

        int clientId = (int) clientTable.getValueAt(row, 8); // Assuming the client ID is in the 8th column
        String firstName = txtFName.getText();
        String lastName = txtLName.getText();
        String age = txtAge.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String note = txtNote.getText();
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female"; 
        }

        try {
            String query = "UPDATE client SET first_name=?, last_name=?, age=?, gender=?, address=?, email=?, phone_number=?, note=? WHERE client_id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, address);
            pst.setString(6, email);
            pst.setString(7, phoneNumber);
            pst.setString(8, note);
            pst.setInt(9, clientId);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Update the values in the table model
                clientTable.setValueAt(firstName, row, 0);
                clientTable.setValueAt(lastName, row, 1);
                clientTable.setValueAt(age, row, 2);
                clientTable.setValueAt(gender, row, 3);
                clientTable.setValueAt(address, row, 4);
                clientTable.setValueAt(email, row, 5);
                clientTable.setValueAt(phoneNumber, row, 6);
                clientTable.setValueAt(note, row, 7);

                JOptionPane.showMessageDialog(this, "Client information updated successfully.");
                
            } else {
                JOptionPane.showMessageDialog(this, "No rows were affected. Update failed.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error updating client information. Please try again.");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String search = txtSearch.getText();

        String query = "SELECT * FROM client WHERE phone_number LIKE '%" + search + "%'";

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            // Clear the existing rows from the table model
            clientTableModel.setRowCount(0);

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                int clientId = rs.getInt("client_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                String note = rs.getString("note");

                // Add a new row to the table model
                clientTableModel.addRow(new Object[]{firstName, lastName, age, gender, address, email, phoneNumber, note, clientId});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error retrieving client information. Please try again.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable clientTable;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private static class ClienManagement {

        public ClienManagement() {
        }
    }

}
