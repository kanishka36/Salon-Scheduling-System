
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PaymentForm extends javax.swing.JFrame {

    final String password = "";
    final String userName = "root";
    final String URL = "jdbc:mysql://localhost:3306/salon management system";
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private DefaultTableModel clientTableModel;
    private DefaultTableModel paymentTableModel;
    
    public PaymentForm() {
        
        initComponents();
         
         clientTableModel = new DefaultTableModel();
         clientTable.setModel(clientTableModel);  
         clientTableModel.setColumnIdentifiers(new Object[] { "Client Id", "Client Name"});
         
         paymentTableModel = new DefaultTableModel();
         paymentTable.setModel(paymentTableModel);  
         paymentTableModel.setColumnIdentifiers(new Object[] { "Service", "Price"});
         
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,userName,password);
            statement = con.createStatement();
            
            rs = statement.executeQuery("SELECT * FROM client");
            
            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String clientName = firstName + " " + lastName;
                int clientId = rs.getInt("client_id");
                
                clientTableModel.addRow(new Object[] { clientId,clientName });
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cashRadioButton = new javax.swing.JRadioButton();
        cardRadioButton = new javax.swing.JRadioButton();
        txtPrice6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serviceCBox1 = new javax.swing.JCheckBox();
        serviceCBox2 = new javax.swing.JCheckBox();
        serviceCBox3 = new javax.swing.JCheckBox();
        serviceCBox4 = new javax.swing.JCheckBox();
        serviceCBox5 = new javax.swing.JCheckBox();
        serviceCBox6 = new javax.swing.JCheckBox();
        serviceCBox7 = new javax.swing.JCheckBox();
        serviceCBox8 = new javax.swing.JCheckBox();
        txtPrice1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtPrice4 = new javax.swing.JTextField();
        txtPrice2 = new javax.swing.JTextField();
        txtPrice3 = new javax.swing.JTextField();
        txtPrice8 = new javax.swing.JTextField();
        txtPrice7 = new javax.swing.JTextField();
        txtPrice5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 188, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1035, 726));

        btnGoBack.setBackground(new java.awt.Color(91, 73, 70));
        btnGoBack.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(247, 247, 247));
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(91, 73, 70));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(247, 247, 247));
        jButton1.setText("Pay");

        txtDetails.setBackground(new java.awt.Color(91, 73, 70));
        txtDetails.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtDetails.setForeground(new java.awt.Color(247, 247, 247));
        txtDetails.setText("See Details");
        txtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetailsActionPerformed(evt);
            }
        });

        clientTable.setBackground(new java.awt.Color(135, 111, 101));
        clientTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        clientTable.setForeground(new java.awt.Color(247, 247, 247));
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Client Id", "Client Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientTable.setSelectionBackground(new java.awt.Color(91, 73, 70));
        jScrollPane2.setViewportView(clientTable);
        if (clientTable.getColumnModel().getColumnCount() > 0) {
            clientTable.getColumnModel().getColumn(0).setResizable(false);
            clientTable.getColumnModel().getColumn(1).setResizable(false);
        }

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

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 247, 247));
        jLabel3.setText("Total");

        txtTotal.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(91, 73, 70));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 247, 247));
        jLabel4.setText("Payment Method");

        cashRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cashRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        cashRadioButton.setText("Cash");

        cardRadioButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cardRadioButton.setForeground(new java.awt.Color(247, 247, 247));
        cardRadioButton.setText("Card");

        txtPrice6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice6.setForeground(new java.awt.Color(91, 73, 70));

        paymentTable.setBackground(new java.awt.Color(135, 111, 101));
        paymentTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        paymentTable.setForeground(new java.awt.Color(247, 247, 247));
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Service", "Price"
            }
        ));
        paymentTable.setSelectionBackground(new java.awt.Color(91, 73, 70));
        jScrollPane1.setViewportView(paymentTable);
        if (paymentTable.getColumnModel().getColumnCount() > 0) {
            paymentTable.getColumnModel().getColumn(0).setResizable(false);
            paymentTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Service");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 247, 247));
        jLabel2.setText("Price");

        serviceCBox1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox1.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox1.setText("Hair-Cutting");

        serviceCBox2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox2.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox2.setText("Colouring and Styling");

        serviceCBox3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox3.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox3.setText("Waxing");

        serviceCBox4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox4.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox4.setText("Hair Removal");

        serviceCBox5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox5.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox5.setText("Hair Extensions");

        serviceCBox6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox6.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox6.setText("Hair Coloring");

        serviceCBox7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox7.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox7.setText("Shampoo and Conditioning");

        serviceCBox8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        serviceCBox8.setForeground(new java.awt.Color(247, 247, 247));
        serviceCBox8.setText("Scalp Massage");

        txtPrice1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice1.setForeground(new java.awt.Color(91, 73, 70));

        btnAdd.setBackground(new java.awt.Color(91, 73, 70));
        btnAdd.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(247, 247, 247));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPrice4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice4.setForeground(new java.awt.Color(91, 73, 70));

        txtPrice2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice2.setForeground(new java.awt.Color(91, 73, 70));

        txtPrice3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice3.setForeground(new java.awt.Color(91, 73, 70));

        txtPrice8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice8.setForeground(new java.awt.Color(91, 73, 70));

        txtPrice7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice7.setForeground(new java.awt.Color(91, 73, 70));

        txtPrice5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPrice5.setForeground(new java.awt.Color(91, 73, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceCBox1)
                                    .addComponent(serviceCBox2)
                                    .addComponent(serviceCBox4)
                                    .addComponent(serviceCBox3)
                                    .addComponent(serviceCBox7)
                                    .addComponent(serviceCBox8)
                                    .addComponent(serviceCBox6)
                                    .addComponent(serviceCBox5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardRadioButton)
                                    .addComponent(cashRadioButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDetails)))
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox1)
                            .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox2)
                            .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox3)
                            .addComponent(txtPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox4)
                            .addComponent(txtPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox5)
                            .addComponent(txtPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox6)
                            .addComponent(txtPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox7)
                            .addComponent(txtPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceCBox8)
                            .addComponent(txtPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cashRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardRadioButton)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(txtDetails)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoBack)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        
        Homepage home = new Homepage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String search = txtSearch.getText();

        String query = "SELECT * FROM client WHERE first_name LIKE '%" + search + "%'";

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            clientTableModel.setRowCount(0);

            while (rs.next()) {
                
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String clientName = firstName + " " + lastName;
                int clientId = rs.getInt("client_id");
                
                clientTableModel.addRow(new Object[] { clientId,clientName });
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error retrieving client information. Please try again.");
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        paymentTableModel.setRowCount(0);
        
        String service1 = "Hair-Cutting";
        String service2 = "Colouring and Styling";
        String service3 = "Waxing";
        String service4 = "Hair Removal";
        String service5 = "Hair Extensions";
        String service6 = "Hair Coloring";
        String service7 = "Shampoo and Conditioning";
        String service8 = "Scalp Massage";

        
        
        int row = clientTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row from the table.");
            return;
        }

        int clientId = (int) clientTable.getValueAt(row, 0);

        String priceInput1 = txtPrice1.getText();
        String priceInput2 = txtPrice2.getText();
        String priceInput3 = txtPrice3.getText();
        String priceInput4 = txtPrice4.getText();
        String priceInput5 = txtPrice5.getText();
        String priceInput6 = txtPrice6.getText();
        String priceInput7 = txtPrice7.getText();
        String priceInput8 = txtPrice8.getText();

        List<String> selectedServices = new ArrayList<>();
        int totalPrice = 0; // Variable to hold the total price

        if (serviceCBox1.isSelected() && !priceInput1.isEmpty()) {
            selectedServices.add(service1);
            totalPrice += Integer.parseInt(priceInput1);
        }
        if (serviceCBox2.isSelected() && !priceInput2.isEmpty()) {
            selectedServices.add(service2);
            totalPrice += Integer.parseInt(priceInput2);
        }
        if (serviceCBox3.isSelected() && !priceInput3.isEmpty()) {
            selectedServices.add(service3);
            totalPrice += Integer.parseInt(priceInput3);
        }
        if (serviceCBox4.isSelected() && !priceInput4.isEmpty()) {
            selectedServices.add(service4);
            totalPrice += Integer.parseInt(priceInput4);
        }
        if (serviceCBox5.isSelected() && !priceInput5.isEmpty()) {
            selectedServices.add(service5);
            totalPrice += Integer.parseInt(priceInput5);
        }
        if (serviceCBox6.isSelected() && !priceInput6.isEmpty()) {
            selectedServices.add(service6);
            totalPrice += Integer.parseInt(priceInput6);
        }
        if (serviceCBox7.isSelected() && !priceInput7.isEmpty()) {
            selectedServices.add(service7);
            totalPrice += Integer.parseInt(priceInput7);
        }
        if (serviceCBox8.isSelected() && !priceInput8.isEmpty()) {
            selectedServices.add(service8);
            totalPrice += Integer.parseInt(priceInput8);
        }

        try {
            String query = "INSERT INTO service_payment (service, price, client_id, total) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(query);

            for (String selectedService : selectedServices) {
                int price = 0; 

                if (selectedService.equals(service1)) {
                    price = Integer.parseInt(priceInput1);
                } else if (selectedService.equals(service2)) {
                    price = Integer.parseInt(priceInput2);
                } else if (selectedService.equals(service3)) {
                    price = Integer.parseInt(priceInput3);
                } else if (selectedService.equals(service4)) {
                    price = Integer.parseInt(priceInput4);
                } else if (selectedService.equals(service5)) {
                    price = Integer.parseInt(priceInput5);
                } else if (selectedService.equals(service6)) {
                    price = Integer.parseInt(priceInput6);
                } else if (selectedService.equals(service7)) {
                    price = Integer.parseInt(priceInput7);
                } else if (selectedService.equals(service8)) {
                    price = Integer.parseInt(priceInput8);
                } 

                pst.setString(1, selectedService);
                pst.setInt(2, price);
                pst.setInt(3, clientId);
                pst.setInt(4, totalPrice);
                pst.executeUpdate();
            }

            String selectQuery = "SELECT * FROM service_payment WHERE client_id = ?";
            pst = con.prepareStatement(selectQuery);
            pst.setInt(1, clientId);
            rs = pst.executeQuery();

            paymentTableModel.setRowCount(0);

            while (rs.next()) {
                String addedService = rs.getString("service");
                int addedPrice = rs.getInt("price");
                int addedTotal = rs.getInt("total");
                paymentTableModel.addRow(new Object[]{addedService, addedPrice});
                txtTotal.setText(String.valueOf(totalPrice));
                txtPrice1.setText("");
                txtPrice2.setText("");
                txtPrice3.setText("");
                txtPrice4.setText("");
                txtPrice5.setText("");
                txtPrice6.setText("");

                serviceCBox1.setSelected(false);
                serviceCBox2.setSelected(false);
                serviceCBox3.setSelected(false);
                serviceCBox4.setSelected(false);
                serviceCBox5.setSelected(false);
                serviceCBox6.setSelected(false);
            }

            // Display total price in the txtTotal text field
//            txtTotal.setText(String.valueOf(totalPrice));
            

        } catch (Exception e) {
            e.printStackTrace();
        }
                
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetailsActionPerformed
        
        int selectedRow = clientTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a row from the table.");
            return;
        }
        int clientId = (int) clientTable.getValueAt(selectedRow, 0);
        AppoinmentDetails details = new AppoinmentDetails(clientId);
        details.setVisible(true);
    }//GEN-LAST:event_txtDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton cardRadioButton;
    private javax.swing.JRadioButton cashRadioButton;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable paymentTable;
    private javax.swing.JCheckBox serviceCBox1;
    private javax.swing.JCheckBox serviceCBox2;
    private javax.swing.JCheckBox serviceCBox3;
    private javax.swing.JCheckBox serviceCBox4;
    private javax.swing.JCheckBox serviceCBox5;
    private javax.swing.JCheckBox serviceCBox6;
    private javax.swing.JCheckBox serviceCBox7;
    private javax.swing.JCheckBox serviceCBox8;
    private javax.swing.JButton txtDetails;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JTextField txtPrice3;
    private javax.swing.JTextField txtPrice4;
    private javax.swing.JTextField txtPrice5;
    private javax.swing.JTextField txtPrice6;
    private javax.swing.JTextField txtPrice7;
    private javax.swing.JTextField txtPrice8;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
