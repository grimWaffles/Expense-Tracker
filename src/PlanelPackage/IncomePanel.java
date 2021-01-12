package PlanelPackage;


import ProjectClass.Income;
import ProjectClass.UserData;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import static java.lang.Float.parseFloat;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class IncomePanel extends javax.swing.JPanel {

    UserData user;

    public IncomePanel(UserData u) {
        initComponents();
        this.user = u;
        dPanel.setLayout(new GridBagLayout());
        dPanel.add(new DatePanel(), new GridBagConstraints());
        ButtonGroup bg = new ButtonGroup();
        bg.add(monthlyRB);
        bg.add(yearlyRb);
        monthlyRB.setSelected(true);
        monthPanel.setVisible(true);
        yearPanel.setVisible(true);
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        defaultCategory = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        incomeTable = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        incomeDetail = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        monthlyRB = new javax.swing.JRadioButton();
        yearlyRb = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        monthPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox<>();
        yearPanel = new javax.swing.JPanel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        createIncomeCatagory = new javax.swing.JTextField();
        dPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("Income Details");

        defaultCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Salary", "House Rent", "Profit" }));

        incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Monthly/Yearly", "Categories", "Income Detail", "Amount", "Tax"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(incomeTable);

        delBtn.setForeground(new java.awt.Color(255, 51, 51));
        delBtn.setText("Delete Income");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Update/Delete Income Detail");

        jLabel5.setText("**Double click on amount to change it");

        jLabel7.setText("Enter Amount");

        addBtn.setForeground(new java.awt.Color(0, 153, 51));
        addBtn.setText("Add Income");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Default Income Categories");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Add/Edit Income");

        incomeDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeDetailActionPerformed(evt);
            }
        });

        monthlyRB.setText("Monthly Income");
        monthlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyRBActionPerformed(evt);
            }
        });

        yearlyRb.setText("Yearly Income");
        yearlyRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyRbActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");

        jLabel8.setText("Month");

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout monthPanelLayout = new javax.swing.GroupLayout(monthPanel);
        monthPanel.setLayout(monthPanelLayout);
        monthPanelLayout.setHorizontalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(monthCombo, 0, 68, Short.MAX_VALUE)
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });

        jLabel9.setText("Year");

        javax.swing.GroupLayout yearPanelLayout = new javax.swing.GroupLayout(yearPanel);
        yearPanel.setLayout(yearPanelLayout);
        yearPanelLayout.setHorizontalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        yearPanelLayout.setVerticalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jLabel3.setText("Create Income Category");

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(delBtn))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(incomeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(createIncomeCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(defaultCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(monthlyRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(yearlyRb)))
                                        .addGap(20, 20, 20)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {monthPanel, yearPanel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {monthlyRB, yearlyRb});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(defaultCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthlyRB)
                            .addComponent(yearlyRb))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(createIncomeCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incomeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {monthPanel, yearPanel});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {monthlyRB, yearlyRb});

    }// </editor-fold>//GEN-END:initComponents
public void populateMonthlyTable(String s) {
        DefaultTableModel dtm = (DefaultTableModel) incomeTable.getModel();
        //seting row 0 everytime.
        dtm.setNumRows(0);

        for (Income m : user.getIncomeArrayList()) {
            if (m.getDate().equals(s)) {
                dtm.addRow(new Object[]{m.getDate(), "Monthly", m.getIncomeCat(),m.getIncomeDet() ,m.getAmount(), m.calTax(m.getAmount())});
            }
        }
    }

    public void populateYearlyTable(String s) {
        DefaultTableModel dtm = (DefaultTableModel) incomeTable.getModel();
        //seting row 0 everytime.
        dtm.setNumRows(0);

        for (Income m : user.getIncomeArrayList()) {
            if (m.getDate().equals(s)) {
                dtm.addRow(new Object[]{m.getDate(), "Yearly", m.getIncomeCat(),m.getIncomeDet(), m.getAmount(), m.calTax(m.getAmount())});
            }
        }
    }
    private void incomeDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeDetailActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (monthlyRB.isSelected()) {
            if ((createIncomeCatagory.getText().equals(""))) {
                user.getIncomeArrayList().add(new Income((String) defaultCategory.getSelectedItem(), Float.parseFloat(amount.getText()), (String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem(),incomeDetail.getText()));

            } else {
                user.getIncomeArrayList().add(new Income(createIncomeCatagory.getText(), Float.parseFloat(amount.getText()), (String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem(),incomeDetail.getText()));

            }
        }else{
            if ((createIncomeCatagory.getText().equals(""))) {
                user.getIncomeArrayList().add(new Income((String) defaultCategory.getSelectedItem(), Float.parseFloat(amount.getText()),(String) yearCombo.getSelectedItem(),incomeDetail.getText()));

            } else {
                user.getIncomeArrayList().add(new Income(createIncomeCatagory.getText(), Float.parseFloat(amount.getText()),(String) yearCombo.getSelectedItem(),incomeDetail.getText()));

            }
        }

        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }


    }//GEN-LAST:event_addBtnActionPerformed

    private void monthlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyRBActionPerformed
        // TODO add your handling code here:
         monthPanel.setVisible(true);
        yearPanel.setVisible(true);
        populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthlyRBActionPerformed

    private void yearlyRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyRbActionPerformed
        // TODO add your handling code here:
        monthPanel.setVisible(false);
        yearPanel.setVisible(true);
        populateYearlyTable((String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_yearlyRbActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        // TODO add your handling code here:
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }
    }//GEN-LAST:event_yearComboActionPerformed

    private void monthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboActionPerformed
        // TODO add your handling code here:
         populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthComboActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)incomeTable.getModel();
        for(Income i:user.getIncomeArrayList()){
            if(model.getValueAt(incomeTable.getSelectedRow(), 0).equals(i.getDate())&&model.getValueAt(incomeTable.getSelectedRow(), 2).equals(i.getIncomeCat())&&model.getValueAt(incomeTable.getSelectedRow(), 3).equals(i.getIncomeDet())&&model.getValueAt(incomeTable.getSelectedRow(), 4).equals(i.getAmount())){
                user.getIncomeArrayList().remove(i);
            }
        }
        model.removeRow(incomeTable.getSelectedRow());
        amount.setText("");
        incomeDetail.setText("");
        createIncomeCatagory.setText("");
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }
        
    }//GEN-LAST:event_delBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField createIncomeCatagory;
    private javax.swing.JPanel dPanel;
    private javax.swing.JComboBox<String> defaultCategory;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField incomeDetail;
    private javax.swing.JTable incomeTable;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JPanel monthPanel;
    private javax.swing.JRadioButton monthlyRB;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> yearCombo;
    private javax.swing.JPanel yearPanel;
    private javax.swing.JRadioButton yearlyRb;
    // End of variables declaration//GEN-END:variables
}
