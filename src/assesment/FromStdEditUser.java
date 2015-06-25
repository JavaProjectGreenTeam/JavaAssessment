/*
 * @author James Buttigieg
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;
    
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;




/**
 *
 * @author James Buttigieg
 */
public class FromStdEditUser   extends  javax.swing.JFrame {
    ResultSet user;
    int id;
    DBInterface db = new DBInterface();
    ArrayList<String> stateArray = new ArrayList<>();
    ArrayList<String> monthArray = new ArrayList<>();
    ArrayList<String> dayArray = new ArrayList<>();
    /**
     * Creates new form eduser
     */
    User currentUser;
    FromStdEditUser EditMyAcc;
    FormMain myhome;
 int userId ;
 
 
    public FromStdEditUser(User passUser) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        currentUser = passUser;
//        int years = 2000;
//        int months = 3;
//        int days = 10;
//        String dobStrings = String.format("%d-%02d-%02d", years, months,  days);
//        Date dobs = Date.valueOf(dobStrings);
        //currentUser = new User(00001, "Walter", "White", "walt@white.com", "password", 0, 0, 6, "texas", dobs);
        
        //Populate the state dropdown from State enum
        stateArray.add("Select your state");
        for (int i = 0; i <= 7; i++) {
            stateArray.add(State.getById(i));
        }
        setCbx(cbxState, stateArray);
        
        //Populate the default day dropdown
        dayArray.add("Day");
        for (int i = 1; i <= 31; i++) {
            dayArray.add(Integer.toString(i));
        }
        setCbx(cbxDay, dayArray);
        
        //Populate the month dropdown from Month enum
        monthArray.add("Month");
        for (int i = 1; i <= 12; i++) {
            monthArray.add(Month.getById(i));
        }
        setCbx(cbxMonth, monthArray);
        //Fill cbxYear with all years from 1900 to the current year
        cbxYear.removeAllItems();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        cbxYear.addItem("Year");
        for(int i = year; i>= 1900; i--){
            cbxYear.addItem(i);
        }
        populateFields();
        //populate table
//         db.getUser(userId);
//      try{
//          
//         String firstName = currentUser.getFirstName();
//         String lastName = currentUser.getLastName();
//         String email = currentUser.getEmail();
//         String password = currentUser.getPassword();
//         int sex = currentUser.getSex();
//         int state = currentUser.getState();
//         String town = currentUser.getTown();
//         Date dob = currentUser.getDob();
//        
//         
//         
//          }catch (Exception ex){
//              System.out.println("Error: "+ex.getMessage());
//    }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupSex = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblDob = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSub = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblFname = new javax.swing.JLabel();
        txtTown = new javax.swing.JTextField();
        lblHead = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTown = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        cbxState = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        cbxDay = new javax.swing.JComboBox();
        cbxMonth = new javax.swing.JComboBox();
        cbxYear = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        lblSex = new javax.swing.JLabel();
        radbtnMale = new javax.swing.JRadioButton();
        radbtnOther = new javax.swing.JRadioButton();
        radbtnFemale = new javax.swing.JRadioButton();
        lblConPass = new java.awt.Label();
        pwdPassword = new javax.swing.JPasswordField();
        pwdConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblDob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDob.setText("D.O.B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 6);
        jPanel2.add(lblDob, gridBagConstraints);

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 1);
        jPanel2.add(txtFirstName, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnSub.setLabel("Submit");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 4, 18);
        jPanel1.add(btnSub, gridBagConstraints);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 4, 18);
        jPanel1.add(btnExit, gridBagConstraints);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 4, 18);
        jPanel1.add(btnHome, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 2.5;
        gridBagConstraints.insets = new java.awt.Insets(19, 3, 0, 0);
        jPanel2.add(jPanel1, gridBagConstraints);

        lblFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFname.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 4);
        jPanel2.add(lblFname, gridBagConstraints);

        txtTown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTown.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 1);
        jPanel2.add(txtTown, gridBagConstraints);

        lblHead.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHead.setText("Edit User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.3;
        jPanel2.add(lblHead, gridBagConstraints);

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 6);
        jPanel2.add(lblEmail, gridBagConstraints);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 1);
        jPanel2.add(txtEmail, gridBagConstraints);

        lblTown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTown.setText("Town");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 7);
        jPanel2.add(lblTown, gridBagConstraints);

        lblState.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblState.setText("State");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 6);
        jPanel2.add(lblState, gridBagConstraints);

        lblLname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLname.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 8);
        jPanel2.add(lblLname, gridBagConstraints);

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSurname.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 1);
        jPanel2.add(txtSurname, gridBagConstraints);

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPass.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        jPanel2.add(lblPass, gridBagConstraints);

        cbxState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        jPanel2.add(cbxState, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        cbxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 7, 32);
        jPanel3.add(cbxDay, gridBagConstraints);

        cbxMonth.setMinimumSize(new java.awt.Dimension(77, 20));
        cbxMonth.setPreferredSize(new java.awt.Dimension(77, 20));
        cbxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 7, 26);
        jPanel3.add(cbxMonth, gridBagConstraints);

        cbxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxYearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 1, 7, 27);
        jPanel3.add(cbxYear, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 7);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        lblSex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSex.setText("Sex");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 2, 6);
        jPanel4.add(lblSex, gridBagConstraints);

        buttonGroupSex.add(radbtnMale);
        radbtnMale.setText("Male");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(radbtnMale, gridBagConstraints);

        buttonGroupSex.add(radbtnOther);
        radbtnOther.setSelected(true);
        radbtnOther.setText("Other");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(radbtnOther, gridBagConstraints);

        buttonGroupSex.add(radbtnFemale);
        radbtnFemale.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(radbtnFemale, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 14);
        jPanel2.add(jPanel4, gridBagConstraints);

        lblConPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConPass.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(lblConPass, gridBagConstraints);

        pwdPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(pwdPassword, gridBagConstraints);

        pwdConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdConfirmPassword.setText("jPasswordField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(pwdConfirmPassword, gridBagConstraints);

        getContentPane().add(jPanel2, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStateActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
         boolean checkSuccess = true;//checkFields();
        if (checkSuccess) {
            int sex;
            int accountType;

            //Get variables from form elements
            String fName = txtFirstName.getText();
            String lName = txtSurname.getText();
            String email = txtEmail.getText();
            String password = pwdPassword.getText();
//            String accountName = cbxAccountType.getSelectedItem().toString();
            int state = cbxState.getSelectedIndex();
            String town = txtTown.getText();
            int day = Integer.parseInt(cbxDay.getSelectedItem().toString());
            int month = cbxMonth.getSelectedIndex();
            int year = Integer.parseInt(cbxYear.getSelectedItem().toString());
            

            if (radbtnMale.isSelected()) {
                sex = 0;
            } else if (radbtnFemale.isSelected()) {
                sex = 1;
            } else {
                sex = 2;
            }
            
//            if(accountName.equalsIgnoreCase("Standard User")){
//                accountType = 0;
//            }else{
//                accountType = 1;
//            }

            //Create date value from individial day, month, year variables
            String dobString = String.format("%d-%02d-%02d", year, month, day);
            Date dob = Date.valueOf(dobString);

//            User user = new User(fName, lName, email, password, accountType, sex, state, town, dob);
//            boolean success = handler.updateUser(user);

            boolean success = db.updateUser(id, fName, lName, email, password, 0, sex, state, town, dob);
            
            if (success) {
                // links back to login screen
                if (myhome == null) {
                    myhome = new FormMain(currentUser);
                }
                myhome.setVisible(true);

                this.setVisible(false);
            }
        }

    }//GEN-LAST:event_btnSubActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        if (myhome == null){
            myhome = new FormMain(currentUser);
        }
        myhome.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void cbxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDayActionPerformed

    private void cbxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMonthActionPerformed
        calcDays();
    }//GEN-LAST:event_cbxMonthActionPerformed

    private void cbxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxYearActionPerformed
        // TODO add your handling code here:
        calcDays();
    }//GEN-LAST:event_cbxYearActionPerformed

    private void calcDays() {
        int days;
        int selectedYear = 0;
        
        int dayIndex = cbxDay.getSelectedIndex();
        int monthIndex = cbxMonth.getSelectedIndex();
        int yearIndex = cbxYear.getSelectedIndex();
        
        
        
        if (yearIndex != 0) {
            selectedYear = Integer.parseInt(cbxYear.getSelectedItem().toString());
        }
        
        //Determine what month is selected and set number of days depending on that
        if (monthIndex != 0) {
            if (monthIndex == 1 || monthIndex == 3 || monthIndex == 5 || monthIndex == 7 || monthIndex == 8 || monthIndex == 10 || monthIndex == 12) {
                days = 31;
                
            } else if (monthIndex == 4 || monthIndex == 6 || monthIndex == 9 || monthIndex == 11) {
                days = 30;
                
            } else if (monthIndex == 2 && yearIndex != 0) {
                //Check if year is leap year
                if ((selectedYear % 4 == 0) && (selectedYear % 100 != 0) || (selectedYear % 400 == 0)) {
                    days = 29;
                    
                } else {
                    days = 28;
                }
            } else {
                days = 0;
            }
            
            //Construct the new values and set to days combo box
            if (days != 0) {
                dayArray.clear();
                dayArray.add("Day");
                for (int i = 1; i <= days; i++) {
                    dayArray.add(Integer.toString(i));
                }
                setCbx(cbxDay, dayArray);
            }
            
            //Set the selected day to the previous selected day
            if (dayIndex != 0 && ((dayIndex) <= Integer.parseInt(dayArray.get(dayArray.size() - 1)))) {
                cbxDay.setSelectedIndex(dayIndex);
            }
        }
    }
    
    private void setCbx(JComboBox cbx, ArrayList<String> array) {
        cbx.setModel(new DefaultComboBoxModel(array.toArray()));
    }
    
    private void populateFields(){
        ResultSet user = db.getUser(currentUser.getUserId());
        
        try{
            if(user.next()){
                String firstName = user.getString("firstName");
                String lastName = user.getString("lastName");
                String email = user.getString("email");
                String password = user.getString("password");
                String town = user.getString("town");
                int accountType = user.getInt("accountType");
                int sex = user.getInt("sex");
                int state = user.getInt("state");
                
                id = user.getInt("id");
                String dob = user.getDate("dob").toString();
                String year = dob.substring(0, 4);
                String month = dob.substring(5, 7);
                String day = dob.substring(8, 10);
                
                if (Integer.parseInt(month) < 10) {
                    month = dob.substring(6, 7);
                }
                
                if (Integer.parseInt(day) < 10) {
                    day = dob.substring(9, 10);
                }
            
                this.txtFirstName.setText(firstName);
                this.txtSurname.setText(lastName);
                this.txtEmail.setText(email);
                this.pwdPassword.setText(password);
                this.pwdConfirmPassword.setText(password);
                this.txtTown.setText(town);
                this.cbxState.setSelectedIndex(state);
                this.cbxDay.setSelectedIndex(Integer.parseInt(day));
                this.cbxMonth.setSelectedIndex(Integer.parseInt(month));
                this.cbxYear.setSelectedItem(Integer.parseInt(year));

                if(sex == 0){
                    this.radbtnMale.setSelected(true);
                }else if(sex == 1){
                    this.radbtnFemale.setSelected(true);
                }else{
                    this.radbtnOther.setSelected(true);
                }
            }             
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(FromStdEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromStdEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromStdEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromStdEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FromStdEditUser(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSub;
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JComboBox cbxDay;
    private javax.swing.JComboBox cbxMonth;
    private javax.swing.JComboBox cbxState;
    private javax.swing.JComboBox cbxYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Label lblConPass;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTown;
    private javax.swing.JPasswordField pwdConfirmPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JRadioButton radbtnFemale;
    private javax.swing.JRadioButton radbtnMale;
    private javax.swing.JRadioButton radbtnOther;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}
