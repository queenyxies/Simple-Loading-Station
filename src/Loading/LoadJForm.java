
package Loading;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class LoadJForm extends javax.swing.JFrame {

    double balance;
    //Arraylist for valid prefix digits in mobile number
    ArrayList<String> prefixNum = new ArrayList<String>();
    
    
    public LoadJForm() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unliLoadButton = new javax.swing.JLabel();
        regLoadButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mainJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        numberJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sunJRadioButton = new javax.swing.JRadioButton();
        globeJRadioButton = new javax.swing.JRadioButton();
        smartJRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        regAmountJTextField = new javax.swing.JTextField();
        doneRegJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        unliLoadJComboBox = new javax.swing.JComboBox<>();
        doneUnliJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(240, 244, 243));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(92, 198, 186));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/load_bg.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/helloLogoFinal.jpg"))); // NOI18N

        unliLoadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/button (2).png"))); // NOI18N
        unliLoadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unliLoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unliLoadButtonMouseClicked(evt);
            }
        });

        regLoadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/button (4).png"))); // NOI18N
        regLoadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regLoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regLoadButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regLoadButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regLoadButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(unliLoadButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regLoadButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(regLoadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unliLoadButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 466));

        jPanel6.setBackground(new java.awt.Color(240, 244, 243));

        mainJLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        mainJLabel.setForeground(new java.awt.Color(121, 197, 185));
        mainJLabel.setText("Regular Load");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(122, 132, 131));
        jLabel8.setText("Your Balance:");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(122, 132, 131));
        jLabel9.setText("Mobile Number:");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(122, 132, 131));
        jLabel10.setText("Choose your network:");

        balanceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(122, 132, 131));
        balanceLabel.setText("500.0");

        numberJTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        numberJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberJTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberJTextFieldKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/Sun_Cellular-Logo.wine.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/Globe-logo.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loadimages/Smart_Communications-Logo.wine.png"))); // NOI18N

        buttonGroup1.add(sunJRadioButton);
        sunJRadioButton.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        sunJRadioButton.setForeground(new java.awt.Color(122, 132, 131));
        sunJRadioButton.setText("Sun");
        sunJRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sunJRadioButtonMouseClicked(evt);
            }
        });
        sunJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(globeJRadioButton);
        globeJRadioButton.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        globeJRadioButton.setForeground(new java.awt.Color(122, 132, 131));
        globeJRadioButton.setText("Globe");
        globeJRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                globeJRadioButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(smartJRadioButton);
        smartJRadioButton.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        smartJRadioButton.setForeground(new java.awt.Color(122, 132, 131));
        smartJRadioButton.setText("Smart");
        smartJRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smartJRadioButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 145, 136));
        jLabel1.setText("x");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(122, 132, 131));
        jLabel6.setText("PHP");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(mainJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(balanceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(numberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 123, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel10))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(sunJRadioButton))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(globeJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(smartJRadioButton)))))
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(balanceLabel))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(numberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smartJRadioButton))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(globeJRadioButton)
                            .addComponent(sunJRadioButton))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 550, 310));

        jPanel4.setBackground(new java.awt.Color(240, 244, 243));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 132, 131));
        jLabel2.setText("Amount to be loaded:");

        regAmountJTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regAmountJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regAmountJTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regAmountJTextFieldKeyTyped(evt);
            }
        });

        doneRegJButton.setBackground(new java.awt.Color(85, 183, 163));
        doneRegJButton.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        doneRegJButton.setForeground(new java.awt.Color(255, 255, 255));
        doneRegJButton.setText("Done");
        doneRegJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneRegJButton.setEnabled(false);
        doneRegJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneRegJButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(regAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(doneRegJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(doneRegJButton)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel7.setBackground(new java.awt.Color(240, 244, 243));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 132, 131));
        jLabel3.setText("Choose Unlimited Load:");

        unliLoadJComboBox.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        unliLoadJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Load Promos-" }));

        doneUnliJButton.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        doneUnliJButton.setForeground(new java.awt.Color(85, 183, 163));
        doneUnliJButton.setText("Done");
        doneUnliJButton.setEnabled(false);
        doneUnliJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneUnliJButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(unliLoadJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(doneUnliJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(unliLoadJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(doneUnliJButton)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 470, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void unliLoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unliLoadButtonMouseClicked
        //Change to Unlimited Load panel
        jTabbedPane1.setSelectedIndex(1);
        mainJLabel.setText("Unlimited Load");
    }//GEN-LAST:event_unliLoadButtonMouseClicked

    private void sunJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunJRadioButtonActionPerformed
        
    }//GEN-LAST:event_sunJRadioButtonActionPerformed

    private void regLoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLoadButtonMouseClicked
        //Change to regular load panel
        jTabbedPane1.setSelectedIndex(0);
        mainJLabel.setText("Regular Load");
    }//GEN-LAST:event_regLoadButtonMouseClicked

    private void numberJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberJTextFieldKeyReleased
        //Disable done button if text fields are still empty
        if (numberJTextField.getText().length()>0 && regAmountJTextField.getText().length()>0){
            doneRegJButton.setEnabled(true);
        }
        else if (numberJTextField.getText().length()>0 ){
            doneUnliJButton.setEnabled(true);
        }
        else {
            doneRegJButton.setEnabled(false);
            doneUnliJButton.setEnabled(false);
        }
    }//GEN-LAST:event_numberJTextFieldKeyReleased

    private void regAmountJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regAmountJTextFieldKeyReleased
        //Disable done button if text fields are still empty
        if (regAmountJTextField.getText().length()>0 && numberJTextField.getText().length()>0 ){
            doneRegJButton.setEnabled(true);
        }
        else {
            doneRegJButton.setEnabled(false);
        }
    }//GEN-LAST:event_regAmountJTextFieldKeyReleased

    private void doneRegJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneRegJButtonMouseClicked
        //For regular load
        prefixNum.add("0945");
        prefixNum.add("0919");
        prefixNum.add("0922");
        
        balance= 500.00;
        String balanceStr = Double.toString(balance);
        balanceLabel.setText(balanceStr);
        double amount = Double.parseDouble(regAmountJTextField.getText());
        String mobileNum=numberJTextField.getText();
        
          
          
        //Get first 4 numbers of Mobile number for validation       
        String firstFourNum = "";
        if (mobileNum.length() > 4)
        {
            firstFourNum = mobileNum.substring(0,4);
        }
        else
        {
            firstFourNum = mobileNum;
        }
        
        //Validation        
        if (amount > balance){
            JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
        }
        else if(amount == 0){
            JOptionPane.showMessageDialog(null, "Please input a valid amount of load you want", 
                    "Invalid Load Amount",JOptionPane.ERROR_MESSAGE);
        }
        else if (buttonGroup1.getSelection() == null){            
            JOptionPane.showMessageDialog(null, "Please choose a network", 
                    "Incomplete Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (numberJTextField.getText().length() != 11)        
        {
            JOptionPane.showMessageDialog(null, "Your mobile number is inaccurate.\n Please input 11 digits for your mobile number", 
                    "Invalid Input",JOptionPane.ERROR_MESSAGE);
        }     
        else if (prefixNum.contains(firstFourNum))
        {           
            double resultBalance=balance-amount;                      
            JOptionPane.showMessageDialog(null, "Succesfully loaded " + amount + " PHP of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
        }                  
        else
        {
            JOptionPane.showMessageDialog(null, "Your mobile number is inaccurate.", 
                    "Invalid Input",JOptionPane.ERROR_MESSAGE);
        }                   
    }//GEN-LAST:event_doneRegJButtonMouseClicked

    private void doneUnliJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneUnliJButtonMouseClicked
        //For unlimited load
        balance= 500.00;
        String balanceStr = Double.toString(balance);
        balanceLabel.setText(balanceStr);
        double resultBalance;
        prefixNum.add("0945");
        prefixNum.add("0919");
        prefixNum.add("0922");
        
        //Get first 4 numbers of Mobile number for validation
        String mobileNum=numberJTextField.getText();
        String firstFourNum = "";
        if (mobileNum.length() > 4)
        {
            firstFourNum = mobileNum.substring(0,4);
        }
        else
        {
            firstFourNum = mobileNum;
        }
        
        //Validation
        if (buttonGroup1.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Please choose a network first", 
                    "Incomplete Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if  (numberJTextField.getText().length() != 11)
        {
           JOptionPane.showMessageDialog(null, "Your mobile number is inaccurate.\n Please input 11 numbers for your mobile number", 
                    "Invalid Input",JOptionPane.ERROR_MESSAGE); 
        }
        else if (prefixNum.contains(firstFourNum)){
             int selection = unliLoadJComboBox.getSelectedIndex();
             if (sunJRadioButton.isSelected())
             {
                 switch(selection)
                 {
                     case 0:
                         if (balance < 50){
                             JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
                         }
                         else{
                       resultBalance=balance-50;                
                    JOptionPane.showMessageDialog(null, "Succesfully loaded 50 PHP" + " of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                         }
                         break; 
                    case 1:
                        if (balance < 100){
                             JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
                         }
                        else{
                            resultBalance=balance-100;                
                    JOptionPane.showMessageDialog(null, "Succesfully loaded 100 PHP" + " of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                        }
                    break;                   
                 }
             }
             else if (globeJRadioButton.isSelected())
             {
             switch(selection)
                {
                 case 0:
                     if (balance < 75){
                             JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
                     }
                     else{
                        resultBalance=balance-75;                
                    JOptionPane.showMessageDialog(null, "Succesfully loaded 75 PHP" + " of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                     }
                    break;
                 case 1:
                     if (balance < 700){
                             JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
                     }
                     else{
                        resultBalance=balance-700;                
                    JOptionPane.showMessageDialog(null, "Succesfully loaded 700 PHP" + " of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                     }
                    break;
                }
             }
             else if (smartJRadioButton.isSelected())
             {
               switch(selection)
               {
                 case 0:
                     if (balance < 150){
                             JOptionPane.showMessageDialog(null, "You don't have anough balance!", 
                    "Insufficeint Balance",JOptionPane.ERROR_MESSAGE);
                    
                     }
                     else{
                        resultBalance=balance-150;                
                    JOptionPane.showMessageDialog(null, "Succesfully loaded 150 PHP" + " of Regular Load!"
                    + "\nNumber: " + mobileNum + "\nRemaining Balance: " +  resultBalance,  
                    "Registered",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                     }
               }            
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your mobile number is inaccurate.", 
                    "Invalid Input",JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_doneUnliJButtonMouseClicked
    
    private void sunJRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunJRadioButtonMouseClicked
        //Fills combo box with Array List that contains sun promos
        ArrayList<String> unliSun = new ArrayList<String>();
        unliSun.add("Extra All-Net Texts 50");               
        unliSun.add("Wais 100");
        unliLoadJComboBox.setModel(new DefaultComboBoxModel<String>(unliSun.toArray(new String[0])));
               
    }//GEN-LAST:event_sunJRadioButtonMouseClicked

    private void globeJRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_globeJRadioButtonMouseClicked
        //Fills combo box with Array List that contains globe promos
        ArrayList<String> unliGlobe = new ArrayList<String>();
        unliGlobe.add("Go75");               
        unliGlobe.add("Go 700");
        unliLoadJComboBox.setModel(new DefaultComboBoxModel<String>(unliGlobe.toArray(new String[0])));
    }//GEN-LAST:event_globeJRadioButtonMouseClicked

    private void smartJRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smartJRadioButtonMouseClicked
        //Fills combo box with Array List that contains smart promos
        ArrayList<String> unliSmart = new ArrayList<String>();
        unliSmart.add("Unli Giga 150");
        
        unliLoadJComboBox.setModel(new DefaultComboBoxModel<String>(unliSmart.toArray(new String[0])));
    }//GEN-LAST:event_smartJRadioButtonMouseClicked

    private void regLoadButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLoadButtonMouseEntered
        
    }//GEN-LAST:event_regLoadButtonMouseEntered

    private void regLoadButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLoadButtonMouseExited
        
    }//GEN-LAST:event_regLoadButtonMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void numberJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberJTextFieldKeyPressed
        //Limits user to input 11 digits only
        String mobilenumber = numberJTextField.getText();
        int length = mobilenumber.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
        
            if (length<11){
                numberJTextField.setEditable(true);
        }else{
            numberJTextField.setEditable(false);
        }
    }else{
            //Allows user to back space
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
                numberJTextField.setEditable(true);
            }else{
                numberJTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_numberJTextFieldKeyPressed

    private void regAmountJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regAmountJTextFieldKeyTyped
        //Limits user to type numbers and one decimal point only. Letters and other special characters are not allowed.
        if(Character.isLetter(evt.getKeyChar()))
            evt.consume();
        else{
            try{
                Double.parseDouble(regAmountJTextField.getText()+evt.getKeyChar());
            }catch(NumberFormatException e){
                evt.consume();
            }
        }
    }//GEN-LAST:event_regAmountJTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(LoadJForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadJForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadJForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadJForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadJForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton doneRegJButton;
    private javax.swing.JButton doneUnliJButton;
    private javax.swing.JRadioButton globeJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel mainJLabel;
    private javax.swing.JTextField numberJTextField;
    private javax.swing.JTextField regAmountJTextField;
    private javax.swing.JLabel regLoadButton;
    private javax.swing.JRadioButton smartJRadioButton;
    private javax.swing.JRadioButton sunJRadioButton;
    private javax.swing.JLabel unliLoadButton;
    private javax.swing.JComboBox<String> unliLoadJComboBox;
    // End of variables declaration//GEN-END:variables
}
