import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class TimeTableManagement extends javax.swing.JFrame {

    final String password = "";
    final String userName = "root";
    final String URL = "jdbc:mysql://localhost:3306/salon management system";
    Connection con = null;
    ResultSet rs, rs2 = null;
    Statement statement = null;
    private DefaultTableModel bookedTableModel; 
    private DefaultTableModel clientTableModel;
    Helper helper = new Helper();
    PreparedStatement pst = null;
    

    public TimeTableManagement() {
        
        initComponents();
        
        
        bookedTableModel = new DefaultTableModel(); 
        bookedTable.setModel(bookedTableModel);  
        bookedTableModel.setColumnIdentifiers(new Object[] { "Time Period", "Client Name", "Client Id" }); 
        
        clientTableModel = new DefaultTableModel(); 
        clientTable.setModel(clientTableModel);  
        clientTableModel.setColumnIdentifiers(new Object[] { "First Name", "Last Name", "Age", "Gender", "Phone Number", "Client ID" });
        
        updateEmpoyeeComboBox ();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,userName,password);
            statement = con.createStatement();
            
            rs2 = statement.executeQuery("SELECT * FROM client");
            
            while (rs2.next()) {
                String firstName = rs2.getString("first_name");
                String lastName = rs2.getString("last_name");
                String age = rs2.getString("age");
                String gender = rs2.getString("gender");
                String phoneNumber = rs2.getString("phone_number");
                int clientId = rs2.getInt("client_id");
                
              clientTableModel.addRow(new Object[] { firstName, lastName, age, gender, phoneNumber, clientId });
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        JOptionPane = new javax.swing.JOptionPane();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookedTable = new javax.swing.JTable();
        txtDate = new com.toedter.calendar.JCalendar();
        timePanel = new javax.swing.JPanel();
        startComboBox = new javax.swing.JComboBox<>();
        endComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        bookedButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        txtAppoinmentSearch = new javax.swing.JTextField();
        btnAppoinmentSearch = new javax.swing.JButton();
        btnAppoinmentSelect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appoinment");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 188, 156));

        bookedTable.setBackground(new java.awt.Color(135, 111, 101));
        bookedTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bookedTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        bookedTable.setForeground(new java.awt.Color(247, 247, 247));
        bookedTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bookedTable.setSelectionBackground(new java.awt.Color(91, 73, 70));
        jScrollPane1.setViewportView(bookedTable);

        txtDate.setBackground(new java.awt.Color(153, 255, 255));
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        txtDate.setWeekdayForeground(new java.awt.Color(91, 73, 70));

        timePanel.setBackground(new java.awt.Color(0, 188, 156));

        startComboBox.setBackground(new java.awt.Color(91, 73, 70));
        startComboBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        startComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Start", "08 : 00", "09 : 00", "10 : 00", "11 : 00", "12 : 00", "13 : 00", "14 : 00", "15 : 00", "16 : 00", "17 : 00" }));
        startComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startComboBoxActionPerformed(evt);
            }
        });

        endComboBox.setBackground(new java.awt.Color(91, 73, 70));
        endComboBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        endComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "End", "08 : 00", "09 : 00", "10 : 00", "11 : 00", "12 : 00", "13 : 00", "14 : 00", "15 : 00", "16 : 00", "17 : 00" }));

        jLabel2.setBackground(new java.awt.Color(0, 188, 156));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 247, 247));
        jLabel2.setText("Select time");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setText("--");

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(startComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15))
        );

        employeeComboBox.setBackground(new java.awt.Color(91, 73, 70));
        employeeComboBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        employeeComboBox.setForeground(new java.awt.Color(247, 247, 247));
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Employee" }));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Employee");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 247, 247));
        jLabel3.setText("Check Available Time");

        checkButton.setBackground(new java.awt.Color(91, 73, 70));
        checkButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        checkButton.setForeground(new java.awt.Color(247, 247, 247));
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        bookedButton.setBackground(new java.awt.Color(91, 73, 70));
        bookedButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        bookedButton.setForeground(new java.awt.Color(247, 247, 247));
        bookedButton.setText("Booked");
        bookedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(91, 73, 70));
        deleteButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(247, 247, 247));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        txtDetails.setEditable(false);
        txtDetails.setBackground(new java.awt.Color(135, 111, 101));
        txtDetails.setColumns(20);
        txtDetails.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtDetails.setForeground(new java.awt.Color(247, 247, 247));
        txtDetails.setRows(5);
        jScrollPane2.setViewportView(txtDetails);

        btnSearch.setBackground(new java.awt.Color(91, 73, 70));
        btnSearch.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(247, 247, 247));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 247, 247));
        jLabel4.setText("Search by Client Phone Number");

        clientTable.setBackground(new java.awt.Color(135, 111, 101));
        clientTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
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
        jScrollPane3.setViewportView(clientTable);

        btnSelect.setBackground(new java.awt.Color(91, 73, 70));
        btnSelect.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(247, 247, 247));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        txtAppoinmentSearch.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btnAppoinmentSearch.setBackground(new java.awt.Color(91, 73, 70));
        btnAppoinmentSearch.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAppoinmentSearch.setForeground(new java.awt.Color(247, 247, 247));
        btnAppoinmentSearch.setText("Search");
        btnAppoinmentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppoinmentSearchActionPerformed(evt);
            }
        });

        btnAppoinmentSelect.setBackground(new java.awt.Color(91, 73, 70));
        btnAppoinmentSelect.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAppoinmentSelect.setForeground(new java.awt.Color(247, 247, 247));
        btnAppoinmentSelect.setText("Select");
        btnAppoinmentSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppoinmentSelectActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 247));
        jLabel6.setText("Search by client Name");

        goBack.setBackground(new java.awt.Color(91, 73, 70));
        goBack.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        goBack.setForeground(new java.awt.Color(247, 247, 247));
        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookedButton)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(checkButton))
                    .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelect))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(goBack)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(txtAppoinmentSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAppoinmentSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnAppoinmentSelect)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton)))))
                .addGap(25, 25, 25))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnSelect))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkButton))
                .addGap(18, 18, 18)
                .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookedButton)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAppoinmentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppoinmentSearch)
                    .addComponent(btnAppoinmentSelect)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(goBack)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void bookedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedButtonActionPerformed
        
        String start = startComboBox.getSelectedItem().toString();
        String end = endComboBox.getSelectedItem().toString();
        SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_form.format(txtDate.getDate());
        String employeeName = employeeComboBox.getSelectedItem().toString(); 
        
        int row = clientTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row from Table");
            return;
        }
        
        int clientId = (int) clientTable.getValueAt(row,5);
        
        
        
        if ("End".equals(end)&& "Start".equals(start)) {
            JOptionPane.showMessageDialog(this, "Please select a start time and an end time.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if ("Start".equals(start)) {
            JOptionPane.showMessageDialog(this, "Please select a start time.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if ("End".equals(end)) {
            JOptionPane.showMessageDialog(this, "Please select an end time.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        

        
        // Check if the selected time period overlaps with any existing bookings
        boolean isOverlapping = false;
        
        try {
            rs = statement.executeQuery("SELECT * FROM booked_time_periods");
            while (rs.next()) {
                String existingStart = rs.getString("start");
                String existingEnd = rs.getString("end");
                String existingDate = rs.getString("date");
                String existingEmployeeName = rs.getString("emp_name");
                
                
                if (helper.isTimeOverlapping(start, end, date, employeeName, existingStart, existingEnd, existingDate, existingEmployeeName)) {
                    isOverlapping = true;
                    break;
                }
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(this, "Error occurred while checking for overlapping bookings.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        if (isOverlapping) {
            JOptionPane.showMessageDialog(this, "That time period is already booked.", "Overlapping Booking", JOptionPane.ERROR_MESSAGE);
        }else {
            
            try {
                // Insert the new booking into the database
                String query = "INSERT INTO booked_time_periods (start, end, date, emp_name, client_id) VALUES (?, ?, ?, ?, ?)"; //change
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, start);
                pst.setString(2, end);
                pst.setString(3, date);
                pst.setString(4, employeeName); 
                pst.setInt(5,clientId);
                pst.executeUpdate();
                
                
                bookedTableModel.setRowCount(0);

                rs = statement.executeQuery("SELECT * FROM booked_time_periods JOIN client ON booked_time_periods.client_id = client.client_id WHERE date = '" + date + "' AND emp_name = '" + employeeName +"'");
                
                while (rs.next()) {
                    String bookedStart = rs.getString("start");
                    String bookedEnd = rs.getString("end");
                    String bookedClientName = rs.getString("first_name");
                    int bookedclientId = rs.getInt("client_id"); 
                    
                    String timePeriod = bookedStart + " - " + bookedEnd;
                    bookedTableModel.addRow(new Object[] { timePeriod, bookedClientName, bookedclientId }); 
                    
                    JOptionPane.showMessageDialog(this, "Appoinment booked successfully.");
                    
                }
                
            } catch (SQLException e1) {
               JOptionPane.showMessageDialog(this, "Please select an employee.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_bookedButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        int row = bookedTable.getSelectedRow();
        
        if (row >= 0) {
            
            String timePeriod = (String) bookedTable.getValueAt(row, 0); // Get the value from the "Time Period" column
            try {
                String[] timeParts = timePeriod.split(" - ");
                String start = timeParts[0];
                String end = timeParts[1];
                
                statement.executeUpdate("DELETE FROM booked_time_periods WHERE start = '" + start + "' AND end = '" + end + "'");
                bookedTableModel.removeRow(row);
                
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

        SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_form.format(txtDate.getDate());
        String employeeName = employeeComboBox.getSelectedItem().toString(); 
        
        try {
            rs = statement.executeQuery("SELECT * FROM booked_time_periods JOIN client ON booked_time_periods.client_id = client.client_id WHERE date = '" + date + "' AND emp_name = '" + employeeName +"'"); 
            bookedTableModel.setRowCount(0);
            

            while (rs.next()) {
                String bookedStart = rs.getString("start");
                String bookedEnd = rs.getString("end");
                String bookedClientName = rs.getString("first_name");
                int bookedclientId = rs.getInt("client_id");
                
                String timePeriod = bookedStart + " - " + bookedEnd;
                bookedTableModel.addRow(new Object[] { timePeriod, bookedClientName, bookedclientId });
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TimeTableManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void updateEmpoyeeComboBox () {
        
        String query = "SELECT DISTINCT emp_name FROM employee"; 
        try {
            con = DriverManager.getConnection(URL, userName, password); 
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                String employeeName = rs.getString("emp_name");
                employeeComboBox.addItem(employeeName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    private void startComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startComboBoxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_startComboBoxActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String search = txtSearch.getText();

        String query = "SELECT * FROM client WHERE phone_number LIKE '%" + search + "%'";

        try {
            pst = con.prepareStatement(query);
            rs2 = pst.executeQuery();

            // Clear the existing rows from the table model
            clientTableModel.setRowCount(0);

            // Iterate through the result set and add rows to the table model
            while (rs2.next()) {
                
                String firstName = rs2.getString("first_name");
                String lastName = rs2.getString("last_name");
                String age = rs2.getString("age");
                String gender = rs2.getString("gender");
                String phoneNumber = rs2.getString("phone_number");
                int clientId = rs2.getInt("client_id");

                // Add a new row to the table model
                clientTableModel.addRow(new Object[]{firstName, lastName, age, gender, phoneNumber, clientId});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error retrieving client information. Please try again.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
       
        txtDetails.setText("");
        
        try {
            int row = clientTable.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Select a row from Table");
                return;
            }

            int clientId = (int) clientTable.getValueAt(row, 5);

            String query = "SELECT * FROM client WHERE client_id = ?";
            pst = con.prepareStatement(query);
            pst.setInt(1, clientId);
            rs = pst.executeQuery();

            if (rs.next()) {
                String firstName = (String) clientTable.getValueAt(row, 0);
                String lastName = (String) clientTable.getValueAt(row, 1);
                String age = (String) clientTable.getValueAt(row, 2);
                String gender = (String) clientTable.getValueAt(row, 3);
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phoneNumber = (String) clientTable.getValueAt(row, 4);
                String note = rs.getString("note");


                txtDetails.setText(txtDetails.getText() + "****************  CLIENT DETAILS  ****************\n\n");
                txtDetails.setText(txtDetails.getText() + "Client Name      : " + firstName + " " + lastName + "\n");
                txtDetails.setText(txtDetails.getText() + "Age                     : " + age + " Years" + "\n");
                txtDetails.setText(txtDetails.getText() + "Gender               : " + gender + "\n");
                txtDetails.setText(txtDetails.getText() + "Address              : " + address + "\n");
                txtDetails.setText(txtDetails.getText() + "Email                   : " + email + "\n");
                txtDetails.setText(txtDetails.getText() + "Phone Number  : " + phoneNumber + "\n");
                txtDetails.setText(txtDetails.getText() + "Note                    : " + note + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "No data found for the selected client");
            }

            pst.close();
            rs.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(TimeTableManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAppoinmentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppoinmentSearchActionPerformed
        
        String search = txtAppoinmentSearch.getText();

        String query = "SELECT * FROM client,booked_time_periods WHERE first_name LIKE '%" + search + "%'";

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            bookedTableModel.setRowCount(0);

            while (rs.next()) {
                
                String start = rs.getString("start");
                String end = rs.getString("end");
                String timePeriod = start + " - " + end;
                int clientId = rs.getInt("client_id");
                String user = rs.getString("first_name");
                
                bookedTableModel.addRow(new Object[] { timePeriod, user, clientId });
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error retrieving client information. Please try again.");
        }
    }//GEN-LAST:event_btnAppoinmentSearchActionPerformed

    private void btnAppoinmentSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppoinmentSelectActionPerformed

        txtDetails.setText("");
        try {
            int row = bookedTable.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Select a row from Table");
                return;
            }

            int clientId = (int) bookedTable.getValueAt(row, 2);

            String query = "SELECT * FROM booked_time_periods,client WHERE booked_time_periods.client_id = ?";
            pst = con.prepareStatement(query);
            pst.setInt(1, clientId);
            rs = pst.executeQuery();

            if (rs.next()) {
                String firstName = (String) bookedTable.getValueAt(row, 1);
                String lastName = rs.getString("last_name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                
                String timePeriod = (String) bookedTable.getValueAt(row, 0);
                String date = rs.getString("date");
                String employee = rs.getString("emp_name");


                txtDetails.setText(txtDetails.getText() + "*************  APPOINMENT DETAILS  *************\n\n");
                txtDetails.setText(txtDetails.getText() + "Client Name      : " + firstName + " " + lastName + "\n");
                txtDetails.setText(txtDetails.getText() + "Age                     : " + age + " Years" + "\n");
                txtDetails.setText(txtDetails.getText() + "Gender               : " + gender + "\n");
                txtDetails.setText(txtDetails.getText() + "Email                   : " + email + "\n");
                txtDetails.setText(txtDetails.getText() + "Phone Number  : " + phoneNumber + "\n");
                txtDetails.setText(txtDetails.getText() + "Employee           : " + employee + "\n");
                txtDetails.setText(txtDetails.getText() + "Date                    : " + date + "\n");
                txtDetails.setText(txtDetails.getText() + "Time                    : " + timePeriod + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "No data found for the selected client");
            }

            pst.close();
            rs.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(TimeTableManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAppoinmentSelectActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        
        Homepage homepage = new Homepage();
        homepage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_goBackActionPerformed

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
            java.util.logging.Logger.getLogger(TimeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTableManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton bookedButton;
    private javax.swing.JTable bookedTable;
    private javax.swing.JButton btnAppoinmentSearch;
    private javax.swing.JButton btnAppoinmentSelect;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton checkButton;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JComboBox<String> endComboBox;
    private javax.swing.JButton goBack;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> startComboBox;
    private javax.swing.JPanel timePanel;
    private javax.swing.JTextField txtAppoinmentSearch;
    private com.toedter.calendar.JCalendar txtDate;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
