/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payroll.subwins;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import payroll.main.db;
import payroll.secSubWins.*;

/**
 *
 * @author ASUS
 */
public class sss extends javax.swing.JDialog {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    int id = 0, bracket = 0, state;
    /** Creates new form sss */
    public sss(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        table();
    }
    public void table(){
        try{
                conn = db.db();
                pst = conn.prepareStatement("SELECT * FROM payroll_schema.subsss_tbl;");
                rs = pst.executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e); 
            }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        newemp1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        brace = new javax.swing.JTextField();
        ee = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        max = new javax.swing.JTextField();
        ec = new javax.swing.JTextField();
        er = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SSS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SSS Table");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/images/refresh_update.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(59, 89, 152));

        newemp1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newemp1.setText("New");
        newemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newemp1ActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        save1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save1.setText("Save");
        save1.setEnabled(false);
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        cancel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel1.setText("Cancel");
        cancel1.setEnabled(false);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SSS Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setText("SSS Bracket");

        jLabel3.setText("SSS Employer Share");

        jLabel4.setText("SSS Employee Share");

        jLabel5.setText("SSS EC");

        jLabel6.setText("SSS Minimum");

        jLabel7.setText("SSS Total");

        jLabel8.setText("SSS Maximum");

        brace.setEditable(false);
        brace.setBackground(new java.awt.Color(255, 255, 255));
        brace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        brace.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ee.setEditable(false);
        ee.setBackground(new java.awt.Color(255, 255, 255));
        ee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ee.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        min.setEditable(false);
        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        min.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        max.setEditable(false);
        max.setBackground(new java.awt.Color(255, 255, 255));
        max.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        max.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ec.setEditable(false);
        ec.setBackground(new java.awt.Color(255, 255, 255));
        ec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ec.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        er.setEditable(false);
        er.setBackground(new java.awt.Color(255, 255, 255));
        er.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        er.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("SSS Salary Credit");

        credit.setEditable(false);
        credit.setBackground(new java.awt.Color(255, 255, 255));
        credit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        credit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(brace, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(ee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(brace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(ee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        table();
        brace.setText("");
        min.setText("");
        max.setText("");
        credit.setText("");
        ee.setText("");
        er.setText("");
        ec.setText("");
        total.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel pm = (DefaultTableModel)table.getModel();
        int sr = table.getSelectedRow();
        id = Integer.parseInt(pm.getValueAt(sr, 0).toString());
        bracket = Integer.parseInt(pm.getValueAt(sr, 1).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void newemp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newemp1ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Do you want to add to SSS table ?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                conn = db.db();
                pst = conn.prepareStatement("SELECT * FROM payroll_schema.subsss_tbl;");
                rs = pst.executeQuery();
                
                while(rs.next()){
                 int recentid  = rs.getInt("sss_id");
                 int newid = recentid + 1;
                 brace.setText(""+newid);
                }
                }
            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
            state = 1;
            brace.setEditable(true);
            min.setEditable(true);
            max.setEditable(true);
            credit.setEditable(true);
            ee.setEditable(true);
            er.setEditable(true);
            ec.setEditable(true);
            total.setEditable(true);

            save1.setEnabled(true);
            cancel1.setEnabled(true);
            newemp1.setEnabled(false);
            edit.setEnabled(false);
            jButton4.setEnabled(false);
            table.setEnabled(false);

            brace.setText("");
            min.setText("");
            max.setText("");
            credit.setText("");
            ee.setText("");
            er.setText("");
            ec.setText("");
            total.setText("");
        }
    }//GEN-LAST:event_newemp1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        if(brace.getText().equals("") && min.getText().equals("") && max.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select a sss bracket to update");
        }else{
            int p = JOptionPane.showConfirmDialog(null, "Do you want to update the sss table?","Update Record",JOptionPane.YES_NO_OPTION);
            if(p == 0){
                state = 2;
                brace.setEditable(true);
                min.setEditable(true);
                max.setEditable(true);
                credit.setEditable(true);
                ee.setEditable(true);
                er.setEditable(true);
                ec.setEditable(true);
                total.setEditable(true);

                save1.setEnabled(true);
                cancel1.setEnabled(true);
                newemp1.setEnabled(false);
                edit.setEnabled(false);
                jButton4.setEnabled(false);
                table.setEnabled(false);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
        if(state== 1){
            if(brace.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The bracket is empty");
            }
            if(min.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The minimum is empty");
            }
            if(max.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The maximum is empty");
            }
            if(credit.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The credit is empty");
            }
            if(ee.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The employee share is empty");
            }
            if(er.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The employeer share is empty");
            }
            if(ec.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The ec is empty");
            }
            if(total.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The total is empty");
            }

            if(!brace.getText().equals("") && !min.getText().equals("") && !max.getText().equals("") && !credit.getText().equals("") && !ee.getText().equals("") && !er.getText().equals("") && !ec.getText().equals("") && !total.getText().equals("")){
                int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this new bracket ?","Add Bracket",JOptionPane.YES_NO_OPTION);
                if(p == 0){
                    try{
                        conn = db.db();
                        pst = conn.prepareStatement("INSERT INTO payroll_schema.subsss_tbl "
                            + "VALUES (?,?,?,?,?,?,?,?,?);");
                        pst.setString(1, brace.getText());
                        pst.setString(2, brace.getText());
                        pst.setString(3, min.getText());
                        pst.setString(4, max.getText());
                        pst.setString(5, credit.getText());
                        pst.setString(6, er.getText());
                        pst.setString(7, ee.getText());
                        pst.setString(8, ec.getText());
                        pst.setString(9, total.getText());
                        pst.execute();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    JOptionPane.showMessageDialog(null, "Added Successfully");
                    state = 0;
                    brace.setEditable(false);
                    min.setEditable(false);
                    max.setEditable(false);
                    credit.setEditable(false);
                    ee.setEditable(false);
                    er.setEditable(false);
                    ec.setEditable(false);
                    total.setEditable(false);

                    save1.setEnabled(false);
                    cancel1.setEnabled(false);
                    newemp1.setEnabled(true);
                    edit.setEnabled(true);
                    jButton4.setEnabled(true);
                    table.setEnabled(true);
                }
            }

        }
        if(state == 2){
            if(brace.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The bracket is empty");
            }
            if(min.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The minimum is empty");
            }
            if(max.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The maximum is empty");
            }
            if(credit.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The credit is empty");
            }
            if(ee.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The employee share is empty");
            }
            if(er.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The employeer share is empty");
            }
            if(ec.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The ec is empty");
            }
            if(total.getText().equals("")){
                JOptionPane.showMessageDialog(null, "The total is empty");
            }
            if(!brace.getText().equals("") && !min.getText().equals("") && !max.getText().equals("") && !credit.getText().equals("") && !ee.getText().equals("") && !er.getText().equals("") && !ec.getText().equals("") && !total.getText().equals("")){
                int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this bracket ?","Update Bracket",JOptionPane.YES_NO_OPTION);
                if(p == 0){
                    try{
                        conn = db.db();
                        pst = conn.prepareStatement("update payroll_schema.subsss_tbl set "
                                + "sss_min = ?,sss_max = ?, sss_salarycredit = ?, er = ?,ee = ?, ec = ?, total = ? "
                                + "where sss_id = ? and sss_brakcet = ?;");
                        pst.setString(8, brace.getText());
                        pst.setString(9, brace.getText());
                        pst.setString(1, min.getText());
                        pst.setString(2, max.getText());
                        pst.setString(3, credit.getText());
                        pst.setString(4, er.getText());
                        pst.setString(5, ee.getText());
                        pst.setString(6, ec.getText());
                        pst.setString(7, total.getText());
                        pst.execute();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                    state = 0;
                    brace.setEditable(false);
                    min.setEditable(false);
                    max.setEditable(false);
                    credit.setEditable(false);
                    ee.setEditable(false);
                    er.setEditable(false);
                    ec.setEditable(false);
                    total.setEditable(false);

                    save1.setEnabled(false);
                    cancel1.setEnabled(false);
                    newemp1.setEnabled(true);
                    edit.setEnabled(true);
                    jButton4.setEnabled(true);
                    table.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Do you want to cancel?","Caution",JOptionPane.YES_NO_OPTION);
        if(p == 0){
            state = 0;
            brace.setEditable(false);
            min.setEditable(false);
            max.setEditable(false);
            credit.setEditable(false);
            ee.setEditable(false);
            er.setEditable(false);
            ec.setEditable(false);
            total.setEditable(false);

            save1.setEnabled(false);
            cancel1.setEnabled(false);
            newemp1.setEnabled(true);
            edit.setEnabled(true);
            jButton4.setEnabled(true);
            table.setEnabled(true);

            brace.setText("");
            min.setText("");
            max.setText("");
            credit.setText("");
            ee.setText("");
            er.setText("");
            ec.setText("");
            total.setText("");
        }
    }//GEN-LAST:event_cancel1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sss dialog = new sss(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField brace;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField credit;
    private javax.swing.JTextField ec;
    private javax.swing.JButton edit;
    private javax.swing.JTextField ee;
    private javax.swing.JTextField er;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField max;
    private javax.swing.JTextField min;
    private javax.swing.JButton newemp1;
    private javax.swing.JButton save1;
    private javax.swing.JTable table;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}
