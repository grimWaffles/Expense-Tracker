
import ProjectClass.UserData;
import PlanelPackage.DatePanel;
import ProjectClass.Budget;
import ProjectClass.MonthlyBudget;
import ProjectClass.YearlyBudget;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class CreateBudget extends javax.swing.JInternalFrame {

    UserData user;

    DefaultComboBoxModel defaultDelCombo = new DefaultComboBoxModel();

    public CreateBudget(UserData u) {
        initComponents();
        this.user = u;
        //Time panel
        dPanel.setLayout(new GridBagLayout());
        dPanel.add(new DatePanel(), new GridBagConstraints());

        //Sorting ComboBox
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<String> comboIteam = new ArrayList<>();

        for (int i = 0; i < defaultCategory.getItemCount(); i++) {
            comboIteam.add(defaultCategory.getItemAt(i));
        }
        Collections.sort(comboIteam);
        for (int i = 0; i < defaultCategory.getItemCount(); i++) {
            model.addElement(comboIteam.get(i));
        }
        defaultCategory.setModel(model);
        defaultCategory.setSelectedIndex(0);

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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        createBudgetCategory = new javax.swing.JTextField();
        defaultCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        amount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        budgetTable = new javax.swing.JTable();
        saveCloseBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        monthPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox<>();
        yearlyRb = new javax.swing.JRadioButton();
        yearPanel = new javax.swing.JPanel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        monthlyRB = new javax.swing.JRadioButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Create Your Personal Budget");

        defaultCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Education", "House", "Transport", "Utilities", "Phone", "Health", "Clothing", "Sports", "Toiletry", "Entertainment" }));

        jLabel2.setText("Default Budget Categories");

        jLabel3.setText("Create Budget Category");

        jLabel4.setText("Enter Amount");

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 153, 51));
        addBtn.setText("Add Budget");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
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
        jScrollPane1.setViewportView(budgetTable);

        saveCloseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveCloseBtn.setForeground(new java.awt.Color(204, 0, 0));
        saveCloseBtn.setText("Close");
        saveCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCloseBtnActionPerformed(evt);
            }
        });

        delBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 51, 51));
        delBtn.setText("Delete Budget");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("**Double click on amount to change it");

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jLabel6.setText("**Click on table iteam and press delete to delete Budget");

        jLabel7.setText("Month");

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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(monthCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        yearlyRb.setText("Yearly Budget");
        yearlyRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyRbActionPerformed(evt);
            }
        });

        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });

        jLabel8.setText("Year");

        javax.swing.GroupLayout yearPanelLayout = new javax.swing.GroupLayout(yearPanel);
        yearPanel.setLayout(yearPanelLayout);
        yearPanelLayout.setHorizontalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        yearPanelLayout.setVerticalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        monthlyRB.setText("Monthly Budget");
        monthlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(createBudgetCategory)
                                        .addComponent(defaultCategory, 0, 140, Short.MAX_VALUE)
                                        .addComponent(amount)))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(saveCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(monthlyRB)
                                                .addComponent(yearlyRb)))
                                        .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(defaultCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(createBudgetCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monthlyRB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearlyRb)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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


    private void saveCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCloseBtnActionPerformed
        // TODO add your handling code here
        for (int i = 0; i < defaultDelCombo.getSize(); i++) {
            boolean check = false;
            if (user.getSelArrayList().isEmpty()) {
                user.getSelArrayList().add((String) defaultDelCombo.getElementAt(i));
            } else {
                for (String s : user.getSelArrayList()) {
                    if (defaultDelCombo.getElementAt(i).equals(s)) {
                        check = true;
                    }
                }
                if (check == false) {
                    user.getSelArrayList().add((String) defaultDelCombo.getElementAt(i));
                }
            }

        }

        this.dispose();
    }//GEN-LAST:event_saveCloseBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (monthlyRB.isSelected()) {
            if ((createBudgetCategory.getText().equals(""))) {
                user.getMonthArrayList().add(new MonthlyBudget((String) defaultCategory.getSelectedItem(), Float.parseFloat(amount.getText()), (String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem()));
                defaultDelCombo.addElement(defaultCategory.getSelectedItem());
            } else {
                user.getMonthArrayList().add(new MonthlyBudget(createBudgetCategory.getText(), Float.parseFloat(amount.getText()), (String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem()));
                defaultDelCombo.addElement(createBudgetCategory.getText());
            }
        } else {

            if (createBudgetCategory.getText().equals("")) {
                user.getYeaArrayList().add(new YearlyBudget((String) defaultCategory.getSelectedItem(), Float.parseFloat(amount.getText()), (String) yearCombo.getSelectedItem()));

                defaultDelCombo.addElement(defaultCategory.getSelectedItem());
            } else {
                user.getYeaArrayList().add(new YearlyBudget(createBudgetCategory.getText(), Float.parseFloat(amount.getText()), (String) yearCombo.getSelectedItem()));
                defaultDelCombo.addElement(createBudgetCategory.getText());
            }
        }

        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
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
        amount.setText("");
        createBudgetCategory.setText("");
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }

    }//GEN-LAST:event_delBtnActionPerformed

    private void yearlyRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyRbActionPerformed
        monthPanel.setVisible(false);
        yearPanel.setVisible(true);
        populateYearlyTable((String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_yearlyRbActionPerformed

    private void monthlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyRBActionPerformed
        monthPanel.setVisible(true);
        yearPanel.setVisible(true);
        populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthlyRBActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        // TODO add your handling code here:
        if (monthlyRB.isSelected()) {
            populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
        } else {
            populateYearlyTable((String) yearCombo.getSelectedItem());
        }

    }//GEN-LAST:event_yearComboActionPerformed

    private void monthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboActionPerformed

        populateMonthlyTable((String) monthCombo.getSelectedItem() + "/" + (String) yearCombo.getSelectedItem());
    }//GEN-LAST:event_monthComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amount;
    private javax.swing.JTable budgetTable;
    private javax.swing.JTextField createBudgetCategory;
    private javax.swing.JPanel dPanel;
    private javax.swing.JComboBox<String> defaultCategory;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JPanel monthPanel;
    private javax.swing.JRadioButton monthlyRB;
    private javax.swing.JButton saveCloseBtn;
    private javax.swing.JComboBox<String> yearCombo;
    private javax.swing.JPanel yearPanel;
    private javax.swing.JRadioButton yearlyRb;
    // End of variables declaration//GEN-END:variables
}
