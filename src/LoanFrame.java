
import PlanelPackage.DatePanel;
import ProjectClass.BankLoan;
import ProjectClass.Loan;
import ProjectClass.PersonalLoan;
import ProjectClass.UserData;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoanFrame extends javax.swing.JInternalFrame {

    UserData u;

    ;

    public LoanFrame(UserData u) {
        initComponents();
        this.u = u;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        dPanel.setLayout(new GridBagLayout());
        dPanel.add(new DatePanel(), new GridBagConstraints());
        ButtonGroup lbtn = new ButtonGroup();
        lbtn.add(bLoanRadio);
        lbtn.add(pLoanRadio);

        for (Loan l : u.getLoanList()) {

            model.addRow(new Object[]{l.getDate(), l.getCategory(), l.getName(), l.getDetail(), Float.toString(l.getAmount()), Float.toString(l.getInterestRate()), Integer.toString(l.getTimePeriod())});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLoanRadio = new javax.swing.JRadioButton();
        pLoanRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LoanName = new javax.swing.JTextField();
        LoanAmount = new javax.swing.JTextField();
        LoanDetails = new javax.swing.JTextField();
        LoanInterest = new javax.swing.JTextField();
        addLoanBtn = new javax.swing.JButton();
        SaveLoan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LoanPeriod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        bLoanRadio.setText("Bank Loan");

        pLoanRadio.setText("Personal Loan");

        jLabel1.setText("Name of Loaner ");

        jLabel2.setText("Details");

        jLabel3.setText("Amount");

        jLabel4.setText("Interest Rate %");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Category", "Name", "Detail", "Amount", "Interest Rate(%)", "Loan Period"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        LoanName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanNameActionPerformed(evt);
            }
        });

        addLoanBtn.setText("Add Loan");
        addLoanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLoanBtnActionPerformed(evt);
            }
        });

        SaveLoan.setText("Save&Close");
        SaveLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveLoanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Add/Edit Loan");

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel6.setText("Loan Period (Years)");

        jLabel7.setText("Select Loan to Delete or Update:");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(updateBtn)
                                .addGap(49, 49, 49)
                                .addComponent(deleteBtn))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bLoanRadio)
                                .addGap(46, 46, 46)
                                .addComponent(pLoanRadio))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(LoanInterest, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addGap(226, 226, 226))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LoanDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(LoanAmount))
                                    .addGap(96, 96, 96)
                                    .addComponent(addLoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(SaveLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bLoanRadio)
                            .addComponent(pLoanRadio))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LoanDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LoanInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLoanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLoanBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf1.format(d);
        String name = LoanName.getText(), details = LoanDetails.getText(), amount = LoanAmount.getText(), interestRate = LoanInterest.getText();
        String category = "";
        String loanPeriod = LoanPeriod.getText();

        if (bLoanRadio.isSelected()) {
            category = bLoanRadio.getText();
        } else if (pLoanRadio.isSelected()) {
            category = pLoanRadio.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Please pick a loan category", "Error", WIDTH);
        }

        try {
            float tAmount = Float.parseFloat(LoanAmount.getText());

            float tIR = Float.parseFloat(LoanInterest.getText());
            int tLoanPeriod = Integer.parseInt(LoanPeriod.getText());
            model.addRow(new Object[]{date, category, name, details, amount, interestRate, loanPeriod});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter proper values", "Error", WIDTH);
            LoanName.setText("");
            LoanDetails.setText("");
            LoanAmount.setText("");
            LoanInterest.setText("");
            LoanPeriod.setText("");
        }

    }//GEN-LAST:event_addLoanBtnActionPerformed

    private void LoanNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanNameActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //LoanCategory.setSelected(model.getValueAt(jTable1.getSelectedRow(),1).toString());

        LoanName.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        LoanDetails.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        LoanAmount.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        LoanInterest.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
        LoanPeriod.setText(model.getValueAt(jTable1.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setValueAt(LoanName.getText(), jTable1.getSelectedRow(), 2);
        model.setValueAt(LoanDetails.getText(), jTable1.getSelectedRow(), 3);
        model.setValueAt(LoanAmount.getText(), jTable1.getSelectedRow(), 4);
        model.setValueAt(LoanInterest.getText(), jTable1.getSelectedRow(), 5);
        model.setValueAt(LoanPeriod.getText(), jTable1.getSelectedRow(), 6);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void SaveLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveLoanActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //LnList = u.getLoanList();
        for (int i = 0; i < model.getRowCount(); i++) {

            if (((String) model.getValueAt(i, 1)).equals("Bank Loan")) {
                u.getLoanList().add(new BankLoan((String) model.getValueAt(i, 2), (String) model.getValueAt(i, 3), (String) model.getValueAt(i, 4),
                        (String) model.getValueAt(i, 5), (String) model.getValueAt(i, 6), (String) model.getValueAt(i, 0), (String) model.getValueAt(i, 1)));
            } else {
                u.getLoanList().add(new PersonalLoan((String) model.getValueAt(i, 2), (String) model.getValueAt(i, 3), (String) model.getValueAt(i, 4),
                        (String) model.getValueAt(i, 5), (String) model.getValueAt(i, 6), (String) model.getValueAt(i, 0), (String) model.getValueAt(i, 1)));

            }

        }
        JOptionPane.showMessageDialog(null, "Success", "Notice", WIDTH);
        this.dispose();
    }//GEN-LAST:event_SaveLoanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LoanAmount;
    private javax.swing.JTextField LoanDetails;
    private javax.swing.JTextField LoanInterest;
    private javax.swing.JTextField LoanName;
    private javax.swing.JTextField LoanPeriod;
    private javax.swing.JButton SaveLoan;
    private javax.swing.JButton addLoanBtn;
    private javax.swing.JRadioButton bLoanRadio;
    private javax.swing.JPanel dPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton pLoanRadio;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
