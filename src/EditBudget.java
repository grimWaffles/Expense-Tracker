
import ProjectClass.UserData;
import ProjectClass.Budget;
import ProjectClass.MonthlyBudget;
import ProjectClass.YearlyBudget;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class EditBudget extends javax.swing.JInternalFrame {

    UserData user;

    public EditBudget(UserData u) {
        initComponents();
        this.user = u;
        ButtonGroup bg = new ButtonGroup();
        bg.add(monthlyRB);
        bg.add(yearlyRB);
        monthlyRB.setSelected(true);
        monthPanel.setVisible(true);
        yearPanel.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        loadBtn = new javax.swing.JButton();
        monthlyRB = new javax.swing.JRadioButton();
        yearlyRB = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        budgetTable = new javax.swing.JTable();
        monthPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox<>();
        yearPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Edit Your Personal Budget");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        delBtn.setForeground(new java.awt.Color(255, 51, 51));
        delBtn.setText("Delete Budget");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("**Double click on on Table to Delete it");

        loadBtn.setText("Load In Table");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        monthlyRB.setText("Monthly Budget");
        monthlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyRBActionPerformed(evt);
            }
        });

        yearlyRB.setText("Yearly Budget");
        yearlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyRBActionPerformed(evt);
            }
        });

        budgetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Budget ", "Categories", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(budgetTable);

        jLabel3.setText("Month");

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
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Year");

        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yearPanelLayout = new javax.swing.GroupLayout(yearPanel);
        yearPanel.setLayout(yearPanelLayout);
        yearPanelLayout.setHorizontalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        yearPanelLayout.setVerticalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthlyRB)
                                .addGap(10, 10, 10)
                                .addComponent(yearlyRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(loadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyRB)
                    .addComponent(yearlyRB))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void populateMonthlyTable(String s) {
        DefaultTableModel dtm = (DefaultTableModel) budgetTable.getModel();
        //seting row 0 everytime.
        dtm.setNumRows(0);

        for (Budget m : user.getMonthArrayList()) {
            if (m.getDate().equals(s)) {
                dtm.addRow(new Object[]{m.getDate(), "Monthly", m.getName(), m.getAmount()});
            }
        }
    }

    public void populateYearlyTable(String s) {
        DefaultTableModel dtm = (DefaultTableModel) budgetTable.getModel();
        //seting row 0 everytime.
        dtm.setNumRows(0);

        for (Budget m : user.getYeaArrayList()) {
            if (m.getDate().equals(s)) {
                dtm.addRow(new Object[]{m.getDate(), "Yearly", m.getName(), m.getAmount()});
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }
    }//GEN-LAST:event_loadBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) budgetTable.getModel();
        if (monthlyRB.isSelected()) {
            for (Budget m : user.getMonthArrayList()) {
                if (model.getValueAt(budgetTable.getSelectedRow(), 0).equals(m.getDate()) && model.getValueAt(budgetTable.getSelectedRow(), 2).equals(m.getName()) && model.getValueAt(budgetTable.getSelectedRow(), 3).equals(m.getAmount())) {
                    user.getMonthArrayList().remove(m);
                } else {
                    for (Budget m1 : user.getYeaArrayList()) {
                        if (model.getValueAt(budgetTable.getSelectedRow(), 0).equals(m.getDate()) && model.getValueAt(budgetTable.getSelectedRow(), 2).equals(m.getName()) && model.getValueAt(budgetTable.getSelectedRow(), 3).equals(m.getAmount())) {
                            user.getYeaArrayList().remove(m1);
                        }
                    }

                }

            }

        }
        model.removeRow(budgetTable.getSelectedRow());

        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }

    }//GEN-LAST:event_delBtnActionPerformed

    private void monthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboActionPerformed

        populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthComboActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        // TODO add your handling code here:
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }
    }//GEN-LAST:event_yearComboActionPerformed

    private void monthlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyRBActionPerformed
        // TODO add your handling code here:
        monthPanel.setVisible(true);
        yearPanel.setVisible(true);
        populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthlyRBActionPerformed

    private void yearlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyRBActionPerformed
        // TODO add your handling code here:
        monthPanel.setVisible(false);
        yearPanel.setVisible(true);
        populateYearlyTable((String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_yearlyRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable budgetTable;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadBtn;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JPanel monthPanel;
    private javax.swing.JRadioButton monthlyRB;
    private javax.swing.JComboBox<String> yearCombo;
    private javax.swing.JPanel yearPanel;
    private javax.swing.JRadioButton yearlyRB;
    // End of variables declaration//GEN-END:variables
}
