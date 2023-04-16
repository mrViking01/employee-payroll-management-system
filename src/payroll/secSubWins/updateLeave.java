/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.secSubWins;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import payroll.main.db;
/**
 *
 * @author ASUS
 */
public class updateLeave extends javax.swing.JDialog {
    String status, addordeduc, ids, l,f,m,c,d,rate;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form updateLeave
     */
    public updateLeave(java.awt.Frame parent, boolean modal,String emp_id, String lastname,String firstname,String middlename, String code, String dt) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        adjcode.setText(code);
        date.setText(dt);
        empid.setText(emp_id);
        last.setText(lastname);
        first.setText(firstname);
        middle.setText(middlename);
        ids = emp_id;
        l = lastname;
        f = firstname;
        m = middlename;
        c = code;
        d = dt;
        
        
        detail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTextArea();
        additional = new javax.swing.JRadioButton();
        deduction = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        adjcode = new javax.swing.JTextField();
        middle = new javax.swing.JTextField();
        dontRecord = new javax.swing.JRadioButton();
        recordNow = new javax.swing.JRadioButton();
        addRecord = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        noofdays = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Leave");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adjustments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel33.setText("Employee's ID");

        empid.setEditable(false);
        empid.setBackground(new java.awt.Color(255, 255, 255));
        empid.setText(" ");

        jLabel35.setText("Employee's Name");

        last.setEditable(false);
        last.setBackground(new java.awt.Color(255, 255, 255));

        first.setEditable(false);
        first.setBackground(new java.awt.Color(255, 255, 255));

        detail.setColumns(20);
        detail.setRows(5);
        jScrollPane2.setViewportView(detail);

        additional.setBackground(new java.awt.Color(255, 255, 255));
        additional.setText("Additional");
        additional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalActionPerformed(evt);
            }
        });

        deduction.setBackground(new java.awt.Color(255, 255, 255));
        deduction.setText("Deduction");
        deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionActionPerformed(evt);
            }
        });

        jLabel2.setText("Detail:");

        jLabel3.setText("Date");

        date.setEditable(false);

        jLabel4.setText("Amount:");

        jLabel34.setText("Leave Code");

        adjcode.setEditable(false);

        middle.setEditable(false);
        middle.setBackground(new java.awt.Color(255, 255, 255));

        dontRecord.setBackground(new java.awt.Color(255, 255, 255));
        dontRecord.setText("Don't Record");
        dontRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontRecordActionPerformed(evt);
            }
        });

        recordNow.setBackground(new java.awt.Color(255, 255, 255));
        recordNow.setText("Record Now");
        recordNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordNowActionPerformed(evt);
            }
        });

        addRecord.setText("Update");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("No of days Leave");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jLabel33))
                                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(adjcode, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addRecord)
                                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73)
                                        .addComponent(jButton2)))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noofdays, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recordNow)
                            .addComponent(dontRecord)
                            .addComponent(additional)
                            .addComponent(deduction))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(adjcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noofdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(additional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deduction)
                        .addGap(18, 18, 18)
                        .addComponent(recordNow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dontRecord)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecord)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalActionPerformed
        // TODO add your handling code here:
        additional.setSelected(true);
        deduction.setSelected(false);
        addordeduc = "Vacation Leave";
    }//GEN-LAST:event_additionalActionPerformed

    private void deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionActionPerformed
        // TODO add your handling code here:
        additional.setSelected(false);
        deduction.setSelected(true);
        addordeduc = "Sick Leave";
    }//GEN-LAST:event_deductionActionPerformed

    private void dontRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontRecordActionPerformed
        // TODO add your handling code here:
        recordNow.setSelected(false);
        dontRecord.setSelected(true);
        status = "Not Yet Recorded";
    }//GEN-LAST:event_dontRecordActionPerformed

    private void recordNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordNowActionPerformed
        // TODO add your handling code here:
        recordNow.setSelected(true);
        dontRecord.setSelected(false);
        status = "Recorded";
    }//GEN-LAST:event_recordNowActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        // TODO add your handling code here:
        if(first.getText().equals("") || last.getText().equals("") || middle.getText().equals("") || amount.getText().equals("") || detail.getText().equals("")|| empid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill up all the Fields");
        }else{
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record ?","Update Record ",JOptionPane.YES_NO_OPTION);
            if(p == 0){
                double totala = Double.parseDouble(rate) * Double.parseDouble(noofdays.getText());
                amount.setText(String.valueOf(totala));
                String a = amount.getText();
                if(recordNow.isSelected()){

                    java.util.Date cd = GregorianCalendar.getInstance().getTime();
                    SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
                    String dtm = mf.format(cd);
                    String mnth = dtm.substring(0, 2);
                    String yr = dtm.substring(2,6);
                    Integer m = Integer.parseInt(mnth);
                    Integer y = Integer.parseInt(yr);

                    if(additional.isSelected()){
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.leave_tbl set amount = ?, type_of_leave = ?, status = ?, reason = ?, noofdays = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and date = ? and leave_code = ?; ");

                            pst.setString(6,empid.getText());
                            pst.setString(7,last.getText());
                            pst.setString(8,first.getText());
                            pst.setString(9,middle.getText());
                            pst.setString(10,date.getText());
                            pst.setString(11,adjcode.getText());
                            pst.setString(1,amount.getText());
                            pst.setString(2,addordeduc);
                            pst.setString(3,status);
                            pst.setString(4,detail.getText());
                            pst.setString(5,noofdays.getText());
                            pst.execute();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("select * from payroll_schema.payroll_tbl where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                            pst.setString(1,empid.getText());
                            pst.setString(2,last.getText());
                            pst.setString(3,first.getText());
                            pst.setString(4,middle.getText());
                            pst.setString(5, m+""+y+"PYRLL");
                            rs = pst.executeQuery();

                            while(rs.next()){
                                double recentAmount = rs.getDouble("vacation_leave");
                                Double latestAmount = Double.parseDouble(a);
                                double total = recentAmount + latestAmount;
                                String totalAmount = String.valueOf(total);

                                try{
                                    conn = db.db();
                                    pst = conn.prepareStatement("update payroll_schema.payroll_tbl set vacation_leave = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                                    pst.setString(1,totalAmount);
                                    pst.setString(2,empid.getText());
                                    pst.setString(3,last.getText());
                                    pst.setString(4,first.getText());
                                    pst.setString(5,middle.getText());
                                    pst.setString(6, m+""+y+"PYRLL");
                                    pst.execute();
                                }
                                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                            }

                        } catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
                        JOptionPane.showMessageDialog(null, "Success");

                    }else if(deduction.isSelected()){
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.leave_tbl set amount = ?, type_of_leave = ?, status = ?, reason = ?, noofdays = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and date = ? and leave_code = ?; ");

                            pst.setString(6,empid.getText());
                            pst.setString(7,last.getText());
                            pst.setString(8,first.getText());
                            pst.setString(9,middle.getText());
                            pst.setString(10,date.getText());
                            pst.setString(11,adjcode.getText());
                            pst.setString(1,amount.getText());
                            pst.setString(2,addordeduc);
                            pst.setString(3,status);
                            pst.setString(4,detail.getText());
                            pst.setString(5,noofdays.getText());
                            pst.execute();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("select * from payroll_schema.payroll_tbl where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                            pst.setString(1,empid.getText());
                            pst.setString(2,last.getText());
                            pst.setString(3,first.getText());
                            pst.setString(4,middle.getText());
                            pst.setString(5, m+""+y+"PYRLL");
                            rs = pst.executeQuery();

                            while(rs.next()){
                                double recentAmount = rs.getDouble("sick_leave");
                                Double latestAmount = Double.parseDouble(a);
                                double total = recentAmount + latestAmount;
                                String totalAmount = String.valueOf(total);

                                try{
                                    conn = db.db();
                                    pst = conn.prepareStatement("update payroll_schema.payroll_tbl set sick_leave = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                                    pst.setString(1,totalAmount);
                                    pst.setString(2,empid.getText());
                                    pst.setString(3,last.getText());
                                    pst.setString(4,first.getText());
                                    pst.setString(5,middle.getText());
                                    pst.setString(6, m+""+y+"PYRLL");
                                    pst.execute();
                                }
                                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                            }

                        } catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
                        JOptionPane.showMessageDialog(null, "Success");
                    }
                }else if(dontRecord.isSelected()){

                    java.util.Date cd = GregorianCalendar.getInstance().getTime();
                    SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
                    String dtm = mf.format(cd);
                    String mnth = dtm.substring(0, 2);
                    String yr = dtm.substring(2,6);
                    Integer m = Integer.parseInt(mnth);
                    Integer y = Integer.parseInt(yr);

                    if(additional.isSelected()){
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.leave_tbl set amount = ?, type_of_leave = ?, status = ?, reason = ?, noofdays = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and date = ? and leave_code = ?; ");

                            pst.setString(6,empid.getText());
                            pst.setString(7,last.getText());
                            pst.setString(8,first.getText());
                            pst.setString(9,middle.getText());
                            pst.setString(10,date.getText());
                            pst.setString(11,adjcode.getText());
                            pst.setString(1,amount.getText());
                            pst.setString(2,addordeduc);
                            pst.setString(3,status);
                            pst.setString(4,detail.getText());
                            pst.setString(5,noofdays.getText());
                            pst.execute();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("select * from payroll_schema.payroll_tbl where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?; ");
                            pst.setString(1,empid.getText());
                            pst.setString(2,last.getText());
                            pst.setString(3,first.getText());
                            pst.setString(4,middle.getText());
                            pst.setString(5, m+""+y+"PYRLL");
                            rs = pst.executeQuery();

                            while(rs.next()){
                                double recentAmount = rs.getDouble("vacation_leave");
                                Double latestAmount = Double.parseDouble(a);
                                double total = recentAmount - latestAmount;
                                String totalAmount = String.valueOf(total);

                                try{
                                    conn = db.db();
                                    pst = conn.prepareStatement("update payroll_schema.payroll_tbl set vacation_leave = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                                    pst.setString(1,totalAmount);
                                    pst.setString(2,empid.getText());
                                    pst.setString(3,last.getText());
                                    pst.setString(4,first.getText());
                                    pst.setString(5,middle.getText());
                                    pst.setString(6, m+""+y+"PYRLL");
                                    pst.execute();
                                }
                                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                            }

                        } catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
                        JOptionPane.showMessageDialog(null, "Success");

                    }else if(deduction.isSelected()){
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.leave_tbl set amount = ?, type_of_leave = ?, status = ?, reason = ?, noofdays = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and date = ? and leave_code = ?; ");

                            pst.setString(6,empid.getText());
                            pst.setString(7,last.getText());
                            pst.setString(8,first.getText());
                            pst.setString(9,middle.getText());
                            pst.setString(10,date.getText());
                            pst.setString(11,adjcode.getText());
                            pst.setString(1,amount.getText());
                            pst.setString(2,addordeduc);
                            pst.setString(3,status);
                            pst.setString(4,detail.getText());
                            pst.setString(5,noofdays.getText());
                            pst.execute();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("select * from payroll_schema.payroll_tbl where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                            pst.setString(1,empid.getText());
                            pst.setString(2,last.getText());
                            pst.setString(3,first.getText());
                            pst.setString(4,middle.getText());
                            pst.setString(5, m+""+y+"PYRLL");
                            rs = pst.executeQuery();

                            while(rs.next()){
                                double recentAmount = rs.getDouble("sick_leave");
                                Double latestAmount = Double.parseDouble(a);
                                double total = recentAmount - latestAmount;
                                String totalAmount = String.valueOf(total);

                                try{
                                    conn = db.db();
                                    pst = conn.prepareStatement("update payroll_schema.payroll_tbl set sick_leave = ? where emp_id = ? and lastname = ? and firstname = ? and middlename = ? and pr_code = ?;");
                                    pst.setString(1,totalAmount);
                                    pst.setString(2,empid.getText());
                                    pst.setString(3,last.getText());
                                    pst.setString(4,first.getText());
                                    pst.setString(5,middle.getText());
                                    pst.setString(6, m+""+y+"PYRLL");
                                    pst.execute();
                                }
                                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                            }

                        } catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
                        JOptionPane.showMessageDialog(null, "Success");
                    }
                }

            }

        }
    }//GEN-LAST:event_addRecordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        amount.setText("");
        recordNow.setSelected(false);
        dontRecord.setSelected(false);
        additional.setSelected(false);
        deduction.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updateLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateLeave dialog = new updateLeave(new javax.swing.JFrame(), true,null,null,null,null,null,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecord;
    private javax.swing.JRadioButton additional;
    private javax.swing.JTextField adjcode;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField date;
    private javax.swing.JRadioButton deduction;
    private javax.swing.JTextArea detail;
    private javax.swing.JRadioButton dontRecord;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField first;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField last;
    private javax.swing.JTextField middle;
    private javax.swing.JTextField noofdays;
    private javax.swing.JRadioButton recordNow;
    // End of variables declaration//GEN-END:variables
public void detail(){
    try{
        conn = db.db();
        pst = conn.prepareStatement("SELECT * FROM payroll_schema.adjustment_tbl WHERE adj_code = ? and emp_id = ? and lastname = ? and firstname = ? and middlename = ? and date = ? ;");
        pst.setString(1, c);
        pst.setString(2, ids);
        pst.setString(3, l);
        pst.setString(4, f);
        pst.setString(5, m);
        pst.setString(6, d);
        rs = pst.executeQuery();
        
        while(rs.next()){
            amount.setText(rs.getString("amount"));
            detail.setText(rs.getString("reason"));
            noofdays.setText(rs.getString("noofdays"));
            String stts = rs.getString("status");
            String ad = rs.getString("typeofleave");
            
            if(stts.equals("Recorded")){
                recordNow.setSelected(true);
            }else if(stts.equals("Not Yet Recorded")){
                dontRecord.setSelected(true);
            }
            
            if(ad.equals("Vacation Leave")){
                additional.setSelected(true);
            }else if(stts.equals("Sick Leave")){
                deduction.setSelected(true);
            }
            
        }
    }
    catch(Exception e){}
}
}
