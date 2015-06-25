package assesment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author 3100298414
 */
//Main Form done by Nick
public class FormMain extends javax.swing.JFrame {
    //Define Variables
    String currentUser;
    String defaultOption;
    User user;
    DBInterface db;
    
    FormOutput formOutput;
    LoginScreen login;
    FromStdEditUser standardEdit;
    EditUser adminEdit;
    
    ArrayList<String> comboBoxDefaultArray = new ArrayList();
    ArrayList<Integer> idArrayCbx1 = new ArrayList<>();
    ArrayList<Integer> idArrayCbx2 = new ArrayList<>();
    ArrayList<Integer> idArrayCbx3 = new ArrayList<>();
    ArrayList<Integer> idArrayCbx4 = new ArrayList<>();
    ArrayList<Integer> idArrayCbx5 = new ArrayList<>();
    ArrayList<Integer> idArrayCbx6 = new ArrayList<>();
    
    ArrayList<String> textArrayCbx1 = new ArrayList<>();
    ArrayList<String> textArrayCbx2 = new ArrayList<>();
    ArrayList<String> textArrayCbx3 = new ArrayList<>();
    ArrayList<String> textArrayCbx4 = new ArrayList<>();
    ArrayList<String> textArrayCbx5 = new ArrayList<>();
    ArrayList<String> textArrayCbx6 = new ArrayList<>();
    
    /**
     * Creates new form FormMain
     * @param passUser
     */
    public FormMain(User passUser) {
        //Initialize Form and Set Positioning
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(this.getExtendedState() | FormMain.MAXIMIZED_BOTH);
        
        //Initialize Variables
        db = new DBInterface();
        user = passUser;
        defaultOption = "Select An Option...";
        comboBoxDefaultArray.add("");
        
        setCurrentUser();
        populateDefaultComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        cbx4 = new javax.swing.JComboBox();
        cbx5 = new javax.swing.JComboBox();
        cbx1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbx2 = new javax.swing.JComboBox();
        cbx3 = new javax.swing.JComboBox();
        cbx6 = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        cbxActions = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        cbx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx4, gridBagConstraints);

        cbx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx5, gridBagConstraints);

        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Find My Career");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 32, 0, 32);
        jPanel1.add(jLabel1, gridBagConstraints);

        jSeparator1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);

        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx2, gridBagConstraints);

        cbx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx3, gridBagConstraints);

        cbx6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 10, 0);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(65, 28));
        btnExit.setMinimumSize(new java.awt.Dimension(65, 28));
        btnExit.setPreferredSize(new java.awt.Dimension(65, 28));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 0);
        jPanel3.add(btnExit, gridBagConstraints);

        btnSubmit.setText("Submit");
        btnSubmit.setMaximumSize(new java.awt.Dimension(65, 28));
        btnSubmit.setMinimumSize(new java.awt.Dimension(65, 28));
        btnSubmit.setPreferredSize(new java.awt.Dimension(65, 28));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 2);
        jPanel3.add(btnSubmit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel3, gridBagConstraints);

        lblUser.setText("Logged In User");
        lblUser.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblUserInputMethodTextChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        jPanel1.add(lblUser, gridBagConstraints);

        cbxActions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Options...", "Edit Information", "Log Out" }));
        cbxActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxActionsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        jPanel1.add(cbxActions, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        int selectedId;
        int id;
        String text;
        ResultSet result;
        
        int selectionIndex = cbx1.getSelectedIndex();
        
        if (selectionIndex != 0) {
            ArrayList<ResultSet> resultArray = db.getFieldByParent(0, selectionIndex);

            idArrayCbx2.clear();
            textArrayCbx2.clear();
            textArrayCbx2.add(defaultOption);

            for (int i = 0; i < resultArray.size(); i++) {
                result = resultArray.get(i);

                try {
                    while (result.next()) {
                        id = result.getInt("id");
                        idArrayCbx2.add(id);
                        text = result.getString("text");
                        textArrayCbx2.add(text);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            setCbx(cbx2, textArrayCbx2);
            cbx2.setSelectedIndex(0);
            cbx2.setEnabled(true);
        } else {
            setCbx(cbx2, comboBoxDefaultArray);
            cbx2.setSelectedIndex(0);
            cbx2.setEnabled(false);
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        int selectedId;
        int id;
        String text;
        ResultSet result;
        
        int selectionIndex = cbx2.getSelectedIndex();
        String selectedItem = cbx2.getSelectedItem().toString();
        
        
        
        if (selectionIndex != 0) {
            textArrayCbx3.clear();
            textArrayCbx3.addAll(Arrays.asList(defaultOption, "Career Pathways", "Skills In Demand", "Essential Employability Skills"));
            
//            selectedId = 0;
//            
//            for (int i = 1; i < textArrayCbx2.size(); i++) {
//                if (textArrayCbx2.get(i).equals(selectedItem)) {
//                    selectedId = idArrayCbx2.get(i - 1);
//                }
//            }
//            
//            ArrayList<ResultSet> resultArray = db.getFieldByParent(1, selectedId);
//
//            idArrayCbx3.clear();
//            textArrayCbx3.clear();
//            textArrayCbx3.add(defaultOption);
//
//            for (int i = 0; i < resultArray.size(); i++) {
//                result = resultArray.get(i);
//
//                try {
//                    while (result.next()) {
//                        id = result.getInt("id");
//                        idArrayCbx3.add(id);
//                        text = result.getString("text");
//                        textArrayCbx3.add(text);
//                    }
//
//                } catch (SQLException ex) {
//                    Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
            setCbx(cbx3, textArrayCbx3);
            cbx3.setSelectedIndex(0);
            cbx3.setEnabled(true);
        } else {
            setCbx(cbx3, comboBoxDefaultArray);
            cbx3.setSelectedIndex(0);
            cbx3.setEnabled(false);
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx3ActionPerformed
        int selectedId;
        int id;
        String text;
        ResultSet result;
        
        int selectionIndex = cbx3.getSelectedIndex();
        String selectedItem = cbx2.getSelectedItem().toString();
        
        if (selectionIndex != 0) {
            if (selectionIndex == 1) {
                selectedId = 0;
            
                for (int i = 1; i < textArrayCbx2.size(); i++) {
                    if (textArrayCbx2.get(i).equals(selectedItem)) {
                        selectedId = idArrayCbx2.get(i - 1);
                    }
                }

                ArrayList<ResultSet> resultArray = db.getFieldByParent(1, selectedId);

                idArrayCbx4.clear();
                textArrayCbx4.clear();
                textArrayCbx4.add(defaultOption);

                for (int i = 0; i < resultArray.size(); i++) {
                    result = resultArray.get(i);

                    try {
                        while (result.next()) {
                            id = result.getInt("id");
                            idArrayCbx4.add(id);
                            text = result.getString("text");
                            textArrayCbx4.add(text);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                setCbx(cbx4, textArrayCbx4);
                cbx4.setSelectedIndex(0);
                cbx4.setEnabled(true);
            }
        } else {
            setCbx(cbx4, comboBoxDefaultArray);
            cbx4.setSelectedIndex(0);
            cbx4.setEnabled(false);
        }
    }//GEN-LAST:event_cbx3ActionPerformed

    private void cbx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx4ActionPerformed
        int selectedId;
        int id;
        String text;
        ResultSet result;
        
        int selectionIndex = cbx4.getSelectedIndex();
        String selectedItem = cbx4.getSelectedItem().toString();
        
        
        
        if (selectionIndex != 0) {
            selectedId = 0;
            
            for (int i = 1; i < textArrayCbx4.size(); i++) {
                if (textArrayCbx4.get(i).equals(selectedItem)) {
                    selectedId = idArrayCbx4.get(i - 1);
                }
            }
            
            ArrayList<ResultSet> resultArray = db.getFieldByParent(2, selectedId);

            idArrayCbx5.clear();
            textArrayCbx5.clear();
            textArrayCbx5.add(defaultOption);

            for (int i = 0; i < resultArray.size(); i++) {
                result = resultArray.get(i);

                try {
                    while (result.next()) {
                        id = result.getInt("id");
                        idArrayCbx5.add(id);
                        text = result.getString("text");
                        textArrayCbx5.add(text);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            setCbx(cbx5, textArrayCbx5);
            cbx5.setSelectedIndex(0);
            cbx5.setEnabled(true);
        } else {
            setCbx(cbx5, comboBoxDefaultArray);
            cbx5.setSelectedIndex(0);
            cbx5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx4ActionPerformed

    private void cbx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx5ActionPerformed
        int selectionIndex = cbx5.getSelectedIndex();
        
        if (selectionIndex != 0) {
            textArrayCbx6.clear();
            textArrayCbx6.addAll(Arrays.asList(defaultOption, "Job Description", "Statistical data on demand / salary range"));
            
            setCbx(cbx6, textArrayCbx6);
            cbx6.setSelectedIndex(0);
            cbx6.setEnabled(true);
        } else {
            setCbx(cbx6, comboBoxDefaultArray);
            cbx6.setSelectedIndex(0);
            cbx6.setEnabled(false);
        }
        
    }//GEN-LAST:event_cbx5ActionPerformed

    private void cbx6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx6ActionPerformed
        
    }//GEN-LAST:event_cbx6ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int selectionIndex = cbx6.getSelectedIndex();
        String heading = cbx5.getSelectedItem().toString();
        String subHeading = cbx6.getSelectedItem().toString();
        ResultSet result;
        
        if (selectionIndex != 0) {
            result = db.getOutput(selectionIndex);
        
            if (formOutput == null) {
                formOutput = new FormOutput(user, heading, subHeading);
            }
            formOutput.setVisible(true);
            formOutput.displayOutput(result);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void lblUserInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblUserInputMethodTextChanged
        
    }//GEN-LAST:event_lblUserInputMethodTextChanged

    private void cbxActionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxActionsActionPerformed
        int selectedIndex = cbxActions.getSelectedIndex();
        
        if (selectedIndex == 1 && user != null) {
            if (user.isAdmin()) {
                if (adminEdit == null) {
                    adminEdit = new EditUser(user);
                }
                adminEdit.setVisible(true);
                this.setVisible(false);
            } else {
                if (standardEdit == null) {
                    standardEdit = new FromStdEditUser(user);
                }
                standardEdit.setVisible(true);
                this.setVisible(false);
            }
            
        } else if (selectedIndex == 2) {
            user = null;
            if (login == null) {
                login = new LoginScreen();
            }
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxActionsActionPerformed

    //Set the current user label
    private void setCurrentUser() {
        if (user != null) {
            String firstInitial = user.getFirstName().substring(0, 1).toUpperCase();
            String firstNameNoInitial = user.getFirstName().substring(1);
            String lastInitial = user.getLastName().substring(0, 1).toUpperCase();
            currentUser = firstInitial + firstNameNoInitial + " " + lastInitial;
            lblUser.setText(currentUser);
        } else {
            lblUser.setText("Current User");
        }
    }
    
    //Populate the first comboBox with values from industries database table
    private void populateDefaultComboBox() {
        int id;
        ResultSet result;
        String text;
        
        textArrayCbx1.clear();
        textArrayCbx1.add(defaultOption);
        
        for (int i = 1; i <= 4; i++) {
             result = db.getField(0, i);
             
             try {
                 while (result.next()) {
                    id = result.getInt("id");
                    idArrayCbx1.add(id);
                    text = result.getString("text");
                    textArrayCbx1.add(text); 
                 } 
             } catch (SQLException ex) {
                 Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        setCbx(cbx1, textArrayCbx1);
        
        //Set all other comboBoxes to be disabled
        JComboBox[] comboBoxArray = new JComboBox[] {cbx2, cbx3, cbx4, cbx5, cbx6};
        
        for (int i = 0; i < comboBoxArray.length; i++) {
            comboBoxArray[i].setEnabled(false);
        }
    }
    
    private void setCbx(JComboBox cbx, ArrayList<String> array) {
        cbx.setModel(new DefaultComboBoxModel(array.toArray()));
    }
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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbx1;
    private javax.swing.JComboBox cbx2;
    private javax.swing.JComboBox cbx3;
    private javax.swing.JComboBox cbx4;
    private javax.swing.JComboBox cbx5;
    private javax.swing.JComboBox cbx6;
    private javax.swing.JComboBox cbxActions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}