/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.subwins;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.*;
import javax.print.DocFlavor;
import javax.swing.JFileChooser;
import net.proteanit.sql.DbUtils;
import payroll.main.db;
import javax.print.attribute.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class payroll extends javax.swing.JDialog {
    Connection conn, conn1, conn2, conn3, conn4;
    PreparedStatement pst, pst1, pst2, pst3, pst4;
    ResultSet rs, rs1, rs2, rs3, rs4;
    int month,day, year;
    Double deduc1 = 0.0;
    Double deduc2 = 0.0;
    Double deduc3 = 0.0;
    Double deduc4 = 0.0;
    double rate, excess, basicex;
    Properties prop = new Properties();
    Double philhealthrate;
    
    /**
     * Creates new form payroll
     */
    public payroll(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        pnl.setVisible(false);
        pnl.setBackground(new Color(240,240,240));
        jLabel3.setForeground(new Color(104,104,104));
        jLabel5.setForeground(new Color(104,104,104));
        jLabel37.setForeground(new Color(104,104,104));
        jLabel8.setForeground(new Color(104,104,104));
        jLabel6.setForeground(new Color(104,104,104));
        jLabel7.setForeground(new Color(104,104,104));
        jLabel10.setForeground(new Color(104,104,104));
        jLabel14.setForeground(new Color(104,104,104));
        jLabel4.setForeground(new Color(104,104,104));
        jLabel19.setForeground(new Color(104,104,104));
        Regular.setForeground(new Color(104,104,104));
        RestDay.setForeground(new Color(104,104,104));
        Holiday.setForeground(new Color(104,104,104));
        RestDayHoliday.setForeground(new Color(104,104,104));
        Pagibig1.setForeground(new Color(104,104,104));
        jLabel21.setForeground(new Color(104,104,104));
        jLabel22.setForeground(new Color(104,104,104));
        jLabel23.setForeground(new Color(104,104,104));
        Pagibig.setForeground(new Color(104,104,104));
        Philhealth.setForeground(new Color(104,104,104));
        SSS.setForeground(new Color(104,104,104));
        Tax.setForeground(new Color(104,104,104));
        jLabel28.setForeground(new Color(104,104,104));
        jLabel29.setForeground(new Color(104,104,104));
        jLabel30.setForeground(new Color(104,104,104));
        jLabel31.setForeground(new Color(104,104,104));
        jLabel32.setForeground(new Color(104,104,104));
        jLabel33.setForeground(new Color(104,104,104));
        SickLeave.setForeground(new Color(104,104,104));
        VacationLeave.setForeground(new Color(104,104,104));
        AdditionalAdjustment.setForeground(new Color(104,104,104));
        DeductionAdjustment.setForeground(new Color(104,104,104));
        OtherDeduction.setForeground(new Color(104,104,104));
        jLabel9.setForeground(new Color(104,104,104));
        jLabel11.setForeground(new Color(104,104,104));
        jLabel12.setForeground(new Color(104,104,104));
        jLabel13.setForeground(new Color(104,104,104));
        jButton3.setEnabled(false);
        code();
        table();
        
        location.setText(getValue("dir"));
        philhealthrate = Double.parseDouble(getValue("v11"));
    }
    public void table(){
        code();
        java.util.Date cd = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
        String dt = mf.format(cd);
        String mnth = dt.substring(0, 2);
        String yr = dt.substring(2,6);
        Integer m = Integer.parseInt(mnth);
        Integer y = Integer.parseInt(yr);
        try{
            conn = db.db();
            pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl where pr_code = '"+m+""+y+"PYRLL"+"';");
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){}
    }
    public void code(){
        java.util.Date cd = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
        String dt = mf.format(cd);
        String mnth = dt.substring(0, 2);
        String yr = dt.substring(2,6);
        Integer m = Integer.parseInt(mnth);
        Integer y = Integer.parseInt(yr);
        searchCode.setText(m+""+y+"PYRLL");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        empln = new javax.swing.JTextField();
        empfn = new javax.swing.JTextField();
        empmn = new javax.swing.JTextField();
        basic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prcssDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        deduc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        earn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        net = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Regular = new javax.swing.JLabel();
        RestDay = new javax.swing.JLabel();
        Holiday = new javax.swing.JLabel();
        RestDayHoliday = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Pagibig1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Pagibig = new javax.swing.JLabel();
        Philhealth = new javax.swing.JLabel();
        SSS = new javax.swing.JLabel();
        Tax = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        SickLeave = new javax.swing.JLabel();
        VacationLeave = new javax.swing.JLabel();
        AdditionalAdjustment = new javax.swing.JLabel();
        DeductionAdjustment = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        OtherDeduction = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ae = new javax.swing.JRadioButton();
        se = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        location = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        compute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payroll");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payroll Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Code");
        pnl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 31, -1, -1));

        code.setEditable(false);
        code.setBackground(new java.awt.Color(255, 255, 255));
        pnl.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 28, 84, -1));

        empid.setEditable(false);
        empid.setBackground(new java.awt.Color(255, 255, 255));
        empid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 54, 57, -1));

        jLabel5.setText("Employee's ID:");
        pnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 57, -1, -1));

        jLabel37.setText("Employee's Name");
        pnl.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, 10));

        empln.setEditable(false);
        empln.setBackground(new java.awt.Color(255, 255, 255));
        empln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(empln, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 80, 99, -1));

        empfn.setEditable(false);
        empfn.setBackground(new java.awt.Color(255, 255, 255));
        empfn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(empfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 80, 88, -1));

        empmn.setEditable(false);
        empmn.setBackground(new java.awt.Color(255, 255, 255));
        empmn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(empmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 80, 88, -1));

        basic.setEditable(false);
        basic.setBackground(new java.awt.Color(255, 255, 255));
        basic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 106, 90, -1));

        jLabel8.setText("Basic Pay");
        pnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 109, -1, -1));

        jLabel9.setText("Process Date");
        pnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, -1));

        prcssDate.setEditable(false);
        prcssDate.setBackground(new java.awt.Color(255, 255, 255));
        prcssDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(prcssDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 17, 90, -1));

        jLabel11.setText("Total Deduction:");
        pnl.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 109, -1, -1));

        deduc.setEditable(false);
        deduc.setBackground(new java.awt.Color(255, 255, 255));
        deduc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(deduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 106, 126, -1));

        jLabel12.setText("Total Earning:");
        pnl.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 135, -1, -1));

        earn.setEditable(false);
        earn.setBackground(new java.awt.Color(255, 255, 255));
        earn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(earn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 132, 126, -1));

        jLabel13.setText("Net Pay:");
        pnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 164, -1, -1));

        net.setEditable(false);
        net.setBackground(new java.awt.Color(255, 255, 255));
        net.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        net.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl.add(net, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 158, 126, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("OverTime Details");
        pnl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 19, -1, -1));

        jLabel6.setText("Regular:");
        pnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 43, -1, -1));

        jLabel7.setText("Rest day");
        pnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 63, -1, -1));

        jLabel10.setText("Holiday:");
        pnl.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 82, -1, -1));

        jLabel14.setText("Rest day Holiday:");
        pnl.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 102, -1, -1));

        Regular.setText("None");
        pnl.add(Regular, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 43, -1, -1));

        RestDay.setText("None");
        pnl.add(RestDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 63, -1, -1));

        Holiday.setText("None");
        pnl.add(Holiday, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 82, -1, -1));

        RestDayHoliday.setText("None");
        pnl.add(RestDayHoliday, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 102, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Contribution Details");
        pnl.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 19, -1, -1));

        Pagibig1.setText("Pag-ibig:");
        pnl.add(Pagibig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 43, -1, -1));

        jLabel21.setText("Philhealth:");
        pnl.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 63, -1, -1));

        jLabel22.setText("SSS:");
        pnl.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 82, -1, -1));

        jLabel23.setText("Tax:");
        pnl.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 102, -1, -1));

        Pagibig.setText("None");
        pnl.add(Pagibig, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 43, -1, -1));

        Philhealth.setText("None");
        pnl.add(Philhealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 63, -1, -1));

        SSS.setText("None");
        pnl.add(SSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 82, -1, -1));

        Tax.setText("None");
        pnl.add(Tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 102, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Other Details");
        pnl.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 19, -1, -1));

        jLabel29.setText("Sick Leave:");
        pnl.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 43, -1, -1));

        jLabel30.setText("Vacation Leave:");
        pnl.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 63, -1, -1));

        jLabel31.setText("Addtional Adjustment:");
        pnl.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 82, -1, -1));

        jLabel32.setText("Deduction Adjustment:");
        pnl.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 102, -1, -1));

        SickLeave.setText("None");
        pnl.add(SickLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 43, -1, -1));

        VacationLeave.setText("None");
        pnl.add(VacationLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 63, -1, -1));

        AdditionalAdjustment.setText("None");
        pnl.add(AdditionalAdjustment, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 82, -1, -1));

        DeductionAdjustment.setText("None");
        pnl.add(DeductionAdjustment, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 102, -1, -1));

        jLabel33.setText("Other Deduction:");
        pnl.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, -1, -1));

        OtherDeduction.setText("None");
        pnl.add(OtherDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payroll Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Payroll ID", "Payroll Code", "Emplyee ID", "Last Name", "First Name", "Middle Name", "Salary Rate", "Basic Salary", "Regular Overtime", "Rest Day Overtime", "Holiday Overtime", "Holiday Rest Day Overtime", "SSS", "Philhealth", "Pagibig", "Tax", "Adjustment Add", "Adjustment Deduction", "Other Deduction", "Process Date", "Payroll Period", "Total Earning", "Total Deduction", "Total Netpay", "13month Pay", "Worked Day ", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel1.setText("Code");

        searchCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchCodeKeyReleased(evt);
            }
        });

        jLabel2.setText("Search by ID:");

        searchId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchIdKeyReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/images/refresh_update.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(searchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(searchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payroll", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        ae.setBackground(new java.awt.Color(255, 255, 255));
        ae.setText("All Employee");
        ae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeActionPerformed(evt);
            }
        });

        se.setBackground(new java.awt.Color(255, 255, 255));
        se.setText("Single Employee");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        location.setText("C:\\");

            jButton3.setText("Print PaySlip");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(se)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(ae)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ae)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
            );

            compute.setText("Compute Payroll");
            compute.setToolTipText("");
            compute.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    computeMouseClicked(evt);
                }
            });
            compute.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    computeActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(compute))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(compute)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:// <editor-fold defaultstate="collapsed" desc="Browse directory for 13th month payslip txt file ">
        int p1 = JOptionPane.showConfirmDialog(null, "Do you want to browse new directory?","Browse",JOptionPane.YES_NO_OPTION);
        if(p1 == 0){
            location.setText("");
            JFileChooser dialog = new JFileChooser();
            dialog.setCurrentDirectory(new File("."));
            dialog.setDialogTitle("Select Directory");
            dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            dialog.setAcceptAllFileFilterUsed(false);
            if(dialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                location.setText(dialog.getSelectedFile()+"");
            }
        }
        //</editor-fold>
    }//GEN-LAST:event_jButton2ActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
        se.setSelected(true);
        ae.setSelected(false);
        pnl.setVisible(true);
        jButton3.setEnabled(true);
        jLabel3.setForeground(Color.black);
        jLabel5.setForeground(Color.black);
        jLabel37.setForeground(Color.black);
        jLabel8.setForeground(Color.black);
        jLabel6.setForeground(Color.black);
        jLabel7.setForeground(Color.black);
        jLabel10.setForeground(Color.black);
        jLabel14.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        jLabel19.setForeground(Color.black);
        Regular.setForeground(Color.black);
        RestDay.setForeground(Color.black);
        Holiday.setForeground(Color.black);
        RestDayHoliday.setForeground(Color.black);
        Pagibig1.setForeground(Color.black);
        jLabel21.setForeground(Color.black);
        jLabel22.setForeground(Color.black);
        jLabel23.setForeground(Color.black);
        Pagibig.setForeground(Color.black);
        Philhealth.setForeground(Color.black);
        SSS.setForeground(Color.black);
        Tax.setForeground(Color.black);
        jLabel28.setForeground(Color.black);
        jLabel29.setForeground(Color.black);
        jLabel30.setForeground(Color.black);
        jLabel31.setForeground(Color.black);
        jLabel32.setForeground(Color.black);
        jLabel33.setForeground(Color.black);
        SickLeave.setForeground(Color.black);
        VacationLeave.setForeground(Color.black);
        AdditionalAdjustment.setForeground(Color.black);
        DeductionAdjustment.setForeground(Color.black);
        OtherDeduction.setForeground(Color.black);
        jLabel9.setForeground(Color.black);
        jLabel11.setForeground(Color.black);
        jLabel12.setForeground(Color.black);
        jLabel13.setForeground(Color.black);
        pnl.setBackground(Color.white);
    }//GEN-LAST:event_seActionPerformed

    private void aeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeActionPerformed
        // TODO add your handling code here:
        ae.setSelected(true);
        se.setSelected(false);
        pnl.setVisible(false);
        jButton3.setEnabled(true);
        pnl.setBackground(new Color(240,240,240));
        jLabel3.setForeground(new Color(104,104,104));
        jLabel5.setForeground(new Color(104,104,104));
        jLabel37.setForeground(new Color(104,104,104));
        jLabel8.setForeground(new Color(104,104,104));
        jLabel6.setForeground(new Color(104,104,104));
        jLabel7.setForeground(new Color(104,104,104));
        jLabel10.setForeground(new Color(104,104,104));
        jLabel14.setForeground(new Color(104,104,104));
        jLabel4.setForeground(new Color(104,104,104));
        jLabel19.setForeground(new Color(104,104,104));
        Regular.setForeground(new Color(104,104,104));
        RestDay.setForeground(new Color(104,104,104));
        Holiday.setForeground(new Color(104,104,104));
        RestDayHoliday.setForeground(new Color(104,104,104));
        Pagibig1.setForeground(new Color(104,104,104));
        jLabel21.setForeground(new Color(104,104,104));
        jLabel22.setForeground(new Color(104,104,104));
        jLabel23.setForeground(new Color(104,104,104));
        Pagibig.setForeground(new Color(104,104,104));
        Philhealth.setForeground(new Color(104,104,104));
        SSS.setForeground(new Color(104,104,104));
        Tax.setForeground(new Color(104,104,104));
        jLabel28.setForeground(new Color(104,104,104));
        jLabel29.setForeground(new Color(104,104,104));
        jLabel30.setForeground(new Color(104,104,104));
        jLabel31.setForeground(new Color(104,104,104));
        jLabel32.setForeground(new Color(104,104,104));
        jLabel33.setForeground(new Color(104,104,104));
        SickLeave.setForeground(new Color(104,104,104));
        VacationLeave.setForeground(new Color(104,104,104));
        AdditionalAdjustment.setForeground(new Color(104,104,104));
        DeductionAdjustment.setForeground(new Color(104,104,104));
        OtherDeduction.setForeground(new Color(104,104,104));
        jLabel9.setForeground(new Color(104,104,104));
        jLabel11.setForeground(new Color(104,104,104));
        jLabel12.setForeground(new Color(104,104,104));
        jLabel13.setForeground(new Color(104,104,104));
    }//GEN-LAST:event_aeActionPerformed

    private void searchCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCodeKeyReleased
        // TODO add your handling code here:
        
        if(searchCode.getText().equals("")){
            table();
        }else{
            try{
                conn = db.db();
                pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl where pr_code like'%"+searchCode.getText()+"%' ;");
                rs = pst.executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){}
        }
    }//GEN-LAST:event_searchCodeKeyReleased

    private void searchIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchIdKeyReleased
        // TODO add your handling code here:
        if(searchId.getText().equals("")){
            table();
        }else{    
           
        try{
            conn = db.db();
            pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl where emp_id like'%"+searchId.getText()+"%' order by pr_code desc;");
            
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
        }
    }//GEN-LAST:event_searchIdKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        java.util.Date cd = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
        String dt = mf.format(cd);
        String mnth = dt.substring(0, 2);
        String yr = dt.substring(2,6);
        Integer m = Integer.parseInt(mnth);
        Integer y = Integer.parseInt(yr);
        
        String codes = m+""+y+"PYRLL";
        conn = db.db();
        if(ae.isSelected()){
            int p1 = JOptionPane.showConfirmDialog(null, "Do you want to create the Pay Slip for all the Employee?","Choose",JOptionPane.YES_NO_OPTION);
            if(p1 == 0){
                java.util.Date cd1 = GregorianCalendar.getInstance().getTime();
                SimpleDateFormat mf1 = new SimpleDateFormat("MMyyyy");
                String dt1 = mf1.format(cd1);
                
                try{
                    pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl where pr_code = ?");
                    pst.setString(1,codes);
                    rs = pst.executeQuery();
                    
                    while(rs.next()){
                        String prcd = rs.getString("pr_code");
                        int x = rs.getInt("emp_id");
                        String fname = rs.getString("firstname");
                        String lname =rs.getString("lastname");
                        String mname =rs.getString("middlename");
                        
                        double slryrt = rs.getDouble("hourly_rate");
                        double bscslry = rs.getDouble("basic_salary");
                        
                        
                        double or = rs.getDouble("overtime_reg");
                        double od = rs.getDouble("overtime_rd");
                        double oh = rs.getDouble("overtime_hd");
                        double ohrd = rs.getDouble("overtime_hdrd");
                        
                        
                        double sssd = rs.getDouble("sss_deduc");
                        double phd = rs.getDouble("philhealth_deduc");
                        double pid = rs.getDouble("pagibig_deduc");
                        double taxd = rs.getDouble("tax_dduc");
                        
                        
                        double adjadd = rs.getDouble("adjustment_add");
                        double adjdeduc = rs.getDouble("adjustment_deduc");
                        
                        
                        double otherdeduc = rs.getDouble("other_deduc");
                        
                        String prcssdt = rs.getString("process_date");
                        String pyrllprd = rs.getString("payroll_period");
                        
                        double rnng = rs.getDouble("total_earning");
                        double ddctn = rs.getDouble("total_deduc");
                        
                        double ntpy = rs.getDouble("total_netpay");
                        
                        do{
                            try{
                                File file = new File(x+""+lname+""+fname+""+dt1+"NETPAY.pdf");
                                File file1 = new File(location.getText()+"\\PayrollRecords\\"+dt1+"EmployeeNetPay");
                                boolean exist = file1.exists();
                                if(exist == true){
                                    try{
                                        if(file.exists()){
                                            file.delete();
                                        }else if(!file.exists()){
                                            //file.createNewFile();
                                        }
                                        //file.createNewFile();
                                        Document doc = new Document();
                                        
                                        PdfWriter myWriter = PdfWriter.getInstance(doc, new FileOutputStream(file1+"\\"+file));
                                        doc.open();
                                        
                                        doc.add(new Paragraph("Employee Pay Slip"));
                                        doc.add(new Paragraph("The BARR Company",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD)));
                                        doc.add(new Paragraph("Payroll Code:    "+prcd+""));
                                        doc.add(new Paragraph("Employee ID:     "+x+""));
                                        doc.add(new Paragraph("Employee Name:   "+lname+", "+fname+" "+mname+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                                        doc.add(new Paragraph("    "));
                                        doc.add(new Paragraph("Basic Salary:                "+bscslry));
                                        doc.add(new Paragraph("Salary Rate:                 "+slryrt));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("OverTime Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Regular OverTime:            "+or));
                                        doc.add(new Paragraph("Rest Day OverTime:           "+od));
                                        doc.add(new Paragraph("Holiday OverTime:            "+oh));
                                        doc.add(new Paragraph("Rest Day Holiday OverTime:   "+ohrd));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Deduction Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("SSS:                         "+sssd));
                                        doc.add(new Paragraph("Philhealth:                  "+phd));
                                        doc.add(new Paragraph("Pag-ibig:                    "+pid));
                                        doc.add(new Paragraph("Tax:                         "+taxd));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Additional Adjustment:       "+adjadd));
                                        doc.add(new Paragraph("Duduction Adjustment:        "+adjdeduc));
                                        doc.add(new Paragraph("Other Deduction:             "+otherdeduc));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Total Earnings:              "+rnng));
                                        doc.add(new Paragraph("Total Deductions:            "+ddctn));
                                        doc.add(new Paragraph("Total NetPay:                "+ntpy));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("Date Process:                "+prcssdt));
                                        doc.add(new Paragraph("Payroll Period:              "+pyrllprd));
                                        
                                        doc.close();
                                        FileInputStream psStream = null;
                                        try {
                                        psStream = new FileInputStream(file1.getPath()+"\\"+file.getName());
                                        } catch (FileNotFoundException ffne) {ffne.printStackTrace();}
                                        if (psStream == null) {
                                            return;
                                        }
                                        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
                                        Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
                                        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
                                        PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);

                                        // this step is necessary because I have several printers configured
                                        PrintService myPrinter = null;
                                        for (int i = 0; i < services.length; i++){
                                            String svcName = services[i].toString();
                                            System.out.println("service found: "+svcName);
                                            if (svcName.contains("printer closest to me")){
                                                myPrinter = services[i];
                                                System.out.println("my printer found: "+svcName);
                                                break;
                                            }
                                        }

                                        if (myPrinter != null) {
                                            DocPrintJob job = myPrinter.createPrintJob();
                                            try {
                                                job.print(myDoc, aset);

                                            } catch (Exception pe) {pe.printStackTrace();}
                                        } else {
                                            System.out.println("no printer services found");
                                        }
                                    }
                                    catch(Exception e){
                                        
                                    }
                                }else{
                                    int p = JOptionPane.showConfirmDialog(null, "The directory "+file1+" doesn't exist."
                                        + "Do you want to create the directory "+file1+"?","Caution",JOptionPane.YES_NO_OPTION);
                                        if(p == 0){
                                            File dir = new File(file1.getPath());
                                            boolean create = dir.mkdirs();
                                            if(create){
                                                try{
                                                    if(file.exists()){
                                                        file.delete();
                                                    }else if(!file.exists()){
                                                        //file.createNewFile();
                                                    }
                                                    //file.createNewFile();
                                                    Document doc = new Document();

                                                    PdfWriter myWriter = PdfWriter.getInstance(doc, new FileOutputStream(file1+"\\"+file));
                                                    doc.open();

                                                    doc.add(new Paragraph("Employee Pay Slip"));
                                                    doc.add(new Paragraph("The BARR Company",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD)));
                                                    doc.add(new Paragraph("Payroll Code:    "+prcd+""));
                                                    doc.add(new Paragraph("Employee ID:     "+x+""));
                                                    doc.add(new Paragraph("Employee Name:   "+lname+", "+fname+" "+mname+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                                                    doc.add(new Paragraph("    "));
                                                    doc.add(new Paragraph("Basic Salary:                "+bscslry));
                                                    doc.add(new Paragraph("Salary Rate:                 "+slryrt));
                                                    doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                    doc.add(new Paragraph("OverTime Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                    doc.add(new Paragraph("Regular OverTime:            "+or));
                                                    doc.add(new Paragraph("Rest Day OverTime:           "+od));
                                                    doc.add(new Paragraph("Holiday OverTime:            "+oh));
                                                    doc.add(new Paragraph("Rest Day Holiday OverTime:   "+ohrd));
                                                    doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                    doc.add(new Paragraph("Deduction Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                    doc.add(new Paragraph("SSS:                         "+sssd));
                                                    doc.add(new Paragraph("Philhealth:                  "+phd));
                                                    doc.add(new Paragraph("Pag-ibig:                    "+pid));
                                                    doc.add(new Paragraph("Tax:                         "+taxd));
                                                    doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                    doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                    doc.add(new Paragraph("Additional Adjustment:       "+adjadd));
                                                    doc.add(new Paragraph("Duduction Adjustment:        "+adjdeduc));
                                                    doc.add(new Paragraph("Other Deduction:             "+otherdeduc));
                                                    doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                    doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                    doc.add(new Paragraph("Total Earnings:              "+rnng));
                                                    doc.add(new Paragraph("Total Deductions:            "+ddctn));
                                                    doc.add(new Paragraph("Total NetPay:                "+ntpy));
                                                    doc.add(new Paragraph("     "));
                                                    doc.add(new Paragraph("     "));
                                                    doc.add(new Paragraph("     "));
                                                    doc.add(new Paragraph("     "));
                                                    doc.add(new Paragraph("     "));
                                                    doc.add(new Paragraph("Date Process:                "+prcssdt));
                                                    doc.add(new Paragraph("Payroll Period:              "+pyrllprd));

                                                    doc.close();
                                                    FileInputStream psStream = null;
                                                    try {
                                                    psStream = new FileInputStream(file1.getPath()+"\\"+file.getName());
                                                    } catch (FileNotFoundException ffne) {ffne.printStackTrace();}
                                                    if (psStream == null) {
                                                        return;
                                                    }
                                                    DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
                                                    Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
                                                    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
                                                    PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);

                                                    // this step is necessary because I have several printers configured
                                                    PrintService myPrinter = null;
                                                    for (int i = 0; i < services.length; i++){
                                                        String svcName = services[i].toString();
                                                        System.out.println("service found: "+svcName);
                                                        if (svcName.contains("printer closest to me")){
                                                            myPrinter = services[i];
                                                            System.out.println("my printer found: "+svcName);
                                                            break;
                                                        }
                                                    }

                                                    if (myPrinter != null) {
                                                        DocPrintJob job = myPrinter.createPrintJob();
                                                        try {
                                                            job.print(myDoc, aset);

                                                        } catch (Exception pe) {pe.printStackTrace();}
                                                    } else {
                                                        System.out.println("no printer services found");
                                                    }
                                                }
                                                catch(Exception e){

                                                }
                                            }
                                        }
                                }
                            }
                            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        }while(0 >= x);
                    }
                }
                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                JOptionPane.showMessageDialog(null, "Success");
            }
        }else if(se.isSelected()){
            int p1 = JOptionPane.showConfirmDialog(null, "Do you want to create the 13th Month Pay Slip for "+empfn.getText()+"?","Choose",JOptionPane.YES_NO_OPTION);
            if(p1 == 0){
                java.util.Date cd1 = GregorianCalendar.getInstance().getTime();
                SimpleDateFormat mf1 = new SimpleDateFormat("MMyyyy");
                String dt1 = mf1.format(cd1);
                
                try{
                    pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl where pr_code = ? and emp_id = ?");
                    pst.setString(1,codes);
                    pst.setString(2,empid.getText());
                    rs = pst.executeQuery();
                    
                    while(rs.next()){
                        String prcd = rs.getString("pr_code");
                        int x = rs.getInt("emp_id");
                        String fname = rs.getString("firstname");
                        String lname =rs.getString("lastname");
                        String mname =rs.getString("middlename");
                        
                        double slryrt = rs.getDouble("hourly_rate");
                        double bscslry = rs.getDouble("basic_salary");
                        
                        
                        double or = rs.getDouble("overtime_reg");
                        double od = rs.getDouble("overtime_rd");
                        double oh = rs.getDouble("overtime_hd");
                        double ohrd = rs.getDouble("overtime_hdrd");
                        
                        
                        double sssd = rs.getDouble("sss_deduc");
                        double phd = rs.getDouble("philhealth_deduc");
                        double pid = rs.getDouble("pagibig_deduc");
                        double taxd = rs.getDouble("tax_dduc");
                        
                        
                        double adjadd = rs.getDouble("adjustment_add");
                        double adjdeduc = rs.getDouble("adjustment_deduc");
                        
                        
                        double otherdeduc = rs.getDouble("other_deduc");
                        
                        String prcssdt = rs.getString("process_date");
                        String pyrllprd = rs.getString("payroll_period");
                        
                        double rnng = rs.getDouble("total_earning");
                        double ddctn = rs.getDouble("total_deduc");
                        
                        double ntpy = rs.getDouble("total_netpay");
                        try{
                            File file = new File(x+""+lname+""+fname+""+dt1+"NETPAY.txt");
                            File file1 = new File(location.getText()+"\\PayrollRecords\\"+dt1+"EmployeeNetPay");
                            boolean exist = file1.exists();
                            if(exist == true){
                                try{
                                        if(file.exists()){
                                            file.delete();
                                        }else if(!file.exists()){
                                            //file.createNewFile();
                                        }
                                        //file.createNewFile();
                                        Document doc = new Document();
                                        
                                        PdfWriter myWriter = PdfWriter.getInstance(doc, new FileOutputStream(file1+"\\"+file));
                                        doc.open();
                                        
                                        doc.add(new Paragraph("Employee Pay Slip"));
                                        doc.add(new Paragraph("The BARR Company",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD)));
                                        doc.add(new Paragraph("Payroll Code:    "+prcd+""));
                                        doc.add(new Paragraph("Employee ID:     "+x+""));
                                        doc.add(new Paragraph("Employee Name:   "+lname+", "+fname+" "+mname+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                                        doc.add(new Paragraph("    "));
                                        doc.add(new Paragraph("Basic Salary:                "+bscslry));
                                        doc.add(new Paragraph("Salary Rate:                 "+slryrt));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("OverTime Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Regular OverTime:            "+or));
                                        doc.add(new Paragraph("Rest Day OverTime:           "+od));
                                        doc.add(new Paragraph("Holiday OverTime:            "+oh));
                                        doc.add(new Paragraph("Rest Day Holiday OverTime:   "+ohrd));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Deduction Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("SSS:                         "+sssd));
                                        doc.add(new Paragraph("Philhealth:                  "+phd));
                                        doc.add(new Paragraph("Pag-ibig:                    "+pid));
                                        doc.add(new Paragraph("Tax:                         "+taxd));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Additional Adjustment:       "+adjadd));
                                        doc.add(new Paragraph("Duduction Adjustment:        "+adjdeduc));
                                        doc.add(new Paragraph("Other Deduction:             "+otherdeduc));
                                        doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                        doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                        doc.add(new Paragraph("Total Earnings:              "+rnng));
                                        doc.add(new Paragraph("Total Deductions:            "+ddctn));
                                        doc.add(new Paragraph("Total NetPay:                "+ntpy));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("     "));
                                        doc.add(new Paragraph("Date Process:                "+prcssdt));
                                        doc.add(new Paragraph("Payroll Period:              "+pyrllprd));
                                        
                                        doc.close();
                                        FileInputStream psStream = null;
                                        try {
                                        psStream = new FileInputStream(file1.getPath()+"\\"+file.getName());
                                        } catch (FileNotFoundException ffne) {ffne.printStackTrace();}
                                        if (psStream == null) {
                                            return;
                                        }
                                        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
                                        Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
                                        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
                                        PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);

                                        // this step is necessary because I have several printers configured
                                        PrintService myPrinter = null;
                                        for (int i = 0; i < services.length; i++){
                                            String svcName = services[i].toString();
                                            System.out.println("service found: "+svcName);
                                            if (svcName.contains("printer closest to me")){
                                                myPrinter = services[i];
                                                System.out.println("my printer found: "+svcName);
                                                break;
                                            }
                                        }

                                        if (myPrinter != null) {
                                            DocPrintJob job = myPrinter.createPrintJob();
                                            try {
                                                job.print(myDoc, aset);

                                            } catch (Exception pe) {pe.printStackTrace();}
                                        } else {
                                            System.out.println("no printer services found");
                                        }
                                    }
                                    catch(Exception e){
                                        
                                    }
                            }else{
                                int p = JOptionPane.showConfirmDialog(null, "The directory "+file1+" doesn't exist."
                                    + "Do you want to create the directory "+file1+"?","Caution",JOptionPane.YES_NO_OPTION);
                                    if(p == 0){
                                        File dir = new File(file1.getPath());
                                        boolean create = dir.mkdirs();
                                        if(create){
                                            try{
                                                if(file.exists()){
                                                    file.delete();
                                                }else if(!file.exists()){
                                                    //file.createNewFile();
                                                }
                                                //file.createNewFile();
                                                Document doc = new Document();

                                                PdfWriter myWriter = PdfWriter.getInstance(doc, new FileOutputStream(file1+"\\"+file));
                                                doc.open();

                                                doc.add(new Paragraph("Employee Pay Slip"));
                                                doc.add(new Paragraph("The BARR Company",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD)));
                                                doc.add(new Paragraph("Payroll Code:    "+prcd+""));
                                                doc.add(new Paragraph("Employee ID:     "+x+""));
                                                doc.add(new Paragraph("Employee Name:   "+lname+", "+fname+" "+mname+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                                                doc.add(new Paragraph("    "));
                                                doc.add(new Paragraph("Basic Salary:                "+bscslry));
                                                doc.add(new Paragraph("Salary Rate:                 "+slryrt));
                                                doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                doc.add(new Paragraph("OverTime Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                doc.add(new Paragraph("Regular OverTime:            "+or));
                                                doc.add(new Paragraph("Rest Day OverTime:           "+od));
                                                doc.add(new Paragraph("Holiday OverTime:            "+oh));
                                                doc.add(new Paragraph("Rest Day Holiday OverTime:   "+ohrd));
                                                doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                doc.add(new Paragraph("Deduction Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                doc.add(new Paragraph("SSS:                         "+sssd));
                                                doc.add(new Paragraph("Philhealth:                  "+phd));
                                                doc.add(new Paragraph("Pag-ibig:                    "+pid));
                                                doc.add(new Paragraph("Tax:                         "+taxd));
                                                doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                doc.add(new Paragraph("Additional Adjustment:       "+adjadd));
                                                doc.add(new Paragraph("Duduction Adjustment:        "+adjdeduc));
                                                doc.add(new Paragraph("Other Deduction:             "+otherdeduc));
                                                doc.add(new Paragraph("--------------------------------------------------------------------------------------------------------------"));
                                                doc.add(new Paragraph("Other Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD)));
                                                doc.add(new Paragraph("Total Earnings:              "+rnng));
                                                doc.add(new Paragraph("Total Deductions:            "+ddctn));
                                                doc.add(new Paragraph("Total NetPay:                "+ntpy));
                                                doc.add(new Paragraph("     "));
                                                doc.add(new Paragraph("     "));
                                                doc.add(new Paragraph("     "));
                                                doc.add(new Paragraph("     "));
                                                doc.add(new Paragraph("     "));
                                                doc.add(new Paragraph("Date Process:                "+prcssdt));
                                                doc.add(new Paragraph("Payroll Period:              "+pyrllprd));

                                                doc.close();
                                                FileInputStream psStream = null;
                                                try {
                                                psStream = new FileInputStream(file1.getPath()+"\\"+file.getName());
                                                } catch (FileNotFoundException ffne) {ffne.printStackTrace();}
                                                if (psStream == null) {
                                                    return;
                                                }
                                                DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
                                                Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
                                                PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
                                                PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);

                                                // this step is necessary because I have several printers configured
                                                PrintService myPrinter = null;
                                                for (int i = 0; i < services.length; i++){
                                                    String svcName = services[i].toString();
                                                    System.out.println("service found: "+svcName);
                                                    if (svcName.contains("printer closest to me")){
                                                        myPrinter = services[i];
                                                        System.out.println("my printer found: "+svcName);
                                                        break;
                                                    }
                                                }

                                                if (myPrinter != null) {
                                                    DocPrintJob job = myPrinter.createPrintJob();
                                                    try {
                                                        job.print(myDoc, aset);

                                                    } catch (Exception pe) {pe.printStackTrace();}
                                                } else {
                                                    System.out.println("no printer services found");
                                                }
                                            }
                                            catch(Exception e){

                                            }
                                        }
                                    }
                                }
                            }
                            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        
                    }
                }
                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        // TODO add your handling code here:
        if(ae.isSelected()){
            JOptionPane.showMessageDialog(null, "All Employee is selected. Can't display details, please select Single Employee");
        }else if(se.isSelected()){
        DefaultTableModel pm = (DefaultTableModel)table.getModel();
        int sr = table.getSelectedRow();
        code.setText(pm.getValueAt(sr, 0).toString());
        empid.setText(pm.getValueAt(sr, 1).toString());
        empln.setText(pm.getValueAt(sr, 2).toString());
        empfn.setText(pm.getValueAt(sr, 3).toString());
        empmn.setText(pm.getValueAt(sr, 4).toString());
        basic.setText(pm.getValueAt(sr, 6).toString());
        Regular.setText(pm.getValueAt(sr, 7).toString());
        RestDay.setText(pm.getValueAt(sr, 8).toString());
        Holiday.setText(pm.getValueAt(sr, 9).toString());
        RestDayHoliday.setText(pm.getValueAt(sr, 10).toString());
        Pagibig.setText(pm.getValueAt(sr, 13).toString());
        SSS.setText(pm.getValueAt(sr, 11).toString());
        Philhealth.setText(pm.getValueAt(sr, 12).toString());
        Tax.setText(pm.getValueAt(sr, 14).toString());
        VacationLeave.setText(pm.getValueAt(sr, 15).toString());
        SickLeave.setText(pm.getValueAt(sr, 16).toString());
        AdditionalAdjustment.setText(pm.getValueAt(sr, 17).toString());
        DeductionAdjustment.setText(pm.getValueAt(sr, 18).toString());
        OtherDeduction.setText(pm.getValueAt(sr, 19).toString());
        deduc.setText(pm.getValueAt(sr, 23).toString());
        earn.setText(pm.getValueAt(sr, 22).toString());
        net.setText(pm.getValueAt(sr, 24).toString());
        prcssDate.setText(pm.getValueAt(sr, 20).toString());
        }else if(!ae.isSelected() && !se.isSelected()){
            JOptionPane.showMessageDialog(null, "Can't display details, please select Single Employee");
        }
    }//GEN-LAST:event_tableMouseReleased

    private void computeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
        int p1 = JOptionPane.showConfirmDialog(null, "Do you want to Compute Overall Net Pay for all the Employee for this month?","Choose",JOptionPane.YES_NO_OPTION);
            if(p1 == 0){
                try{
                    
                    java.util.Date cd1 = GregorianCalendar.getInstance().getTime();
                    SimpleDateFormat mf1 = new SimpleDateFormat("MM/dd/yyyy");
                    String dt = mf1.format(cd1);
                    
                    String mnth = dt.substring(0, 2);
                    String dy = dt.substring(3, 5);
                    String yr = dt.substring(6, 10);
                    Integer m = Integer.parseInt(mnth);
                    Integer d = Integer.parseInt(dy);
                    Integer y = Integer.parseInt(yr);
                    //String search = m+""+y+"PYRLL";
                    
                    if ( m != 12){
                        month = m +1;
                        year = y;
                    }else{
                        month = 1;
                        year = y + 1;
                    }
                    day = 28;
                    
                    
                    conn= db.db();
                    pst = conn.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl WHERE pr_code = ?;");
                    pst.setString(1, "2"+y+"PYRLL");
                    rs = pst.executeQuery();
                    while(rs.next()){
                        int id = rs.getInt("emp_id");
                        String ln = rs.getString("lastname");
                        String fn = rs.getString("firstname");
                        String mn = rs.getString("middlename");
                        double slryrt= rs.getDouble("hourly_rate");
                        int wd = rs.getInt("worked_day");
                        
                        
                        double basicpay = rs.getDouble("basic_salary");
                        double or = rs.getDouble("overtime_reg");
                        double od = rs.getDouble("overtime_rd");
                        double oh = rs.getDouble("overtime_hd");
                        double ohrd = rs.getDouble("overtime_hdrd");
                        double sssd = rs.getDouble("sss_deduc");
                        double phd = rs.getDouble("philhealth_deduc");
                        double pid = rs.getDouble("pagibig_deduc");
                        double taxd = rs.getDouble("tax_dduc");
                        double adjadd = rs.getDouble("adjustment_add");
                        double adjdeduc = rs.getDouble("adjustment_deduc");
                        double otherdeduc = rs.getDouble("other_deduc");
                        
                        double earning = or + od + oh + ohrd + adjadd;
                        double deduction = sssd + phd + pid + taxd + adjdeduc + otherdeduc;
                        
                        double netpay = basicpay + earning- deduction;
                        do{
                            try{
                                
                                conn = db.db();
                                pst = conn.prepareStatement("update payroll_schema.payroll_tbl set "
                                        + "process_date = '"+dt+"', "
                                        + "total_earning = "+String.valueOf(earning)+", "
                                        + "total_deduc = "+String.valueOf(deduction)+", "
                                        + "total_netpay = "+String.valueOf(netpay)+" "
                                        + "where pr_code = '"+m+""+y+"PYRLL' and "
                                        + "emp_id = "+id+" and "
                                        + "lastname = '"+ln+"' and "
                                        + "firstname = '"+fn+"' and "
                                        + "middlename = '"+mn+"';");
                                pst.execute();
                                JOptionPane.showMessageDialog(null, "Success");
                            }
                            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                            
                            try{
                                conn = db.db();
                                pst = conn.prepareStatement("insert into payroll_schema.payroll_tbl "
                                        + " values "
                                        + "('"+month+""+year+"PYRLL',"//1
                                        + ""+id+","//2
                                        + "'"+ln+"',"//3
                                        + "'"+fn+"',"//4
                                        + "'"+mn+"',"//5
                                        + ""+slryrt+","//6
                                        + ""+basicpay+","//7
                                        + "0,0,0,0,"//8-11
                                        + "0,0,0,0,"//12-15
                                        + "0,0,0,0,"//16-19
                                        + "0,null,"//20-21
                                        + "'"+month+"/"+day+"/"+year+"',"//22
                                        + "0,0,0,"//23-25
                                        + ""+wd+");");//26
                                pst.execute();
                            }
                            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        
                        }while(0 >= id);
                        
                    }
                    
                }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
            }
        }
    }//GEN-LAST:event_computeMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        table();
        code.setText("");
        empid.setText("");
        empln.setText("");
        empfn.setText("");
        empmn.setText("");
        basic.setText("");
        Regular.setText("None");
        RestDay.setText("None");
        Holiday.setText("None");
        RestDayHoliday.setText("None");
        Pagibig.setText("None");
        SSS.setText("None");
        Philhealth.setText("None");
        Tax.setText("None");
        VacationLeave.setText("None");
        SickLeave.setText("None");
        AdditionalAdjustment.setText("None");
        DeductionAdjustment.setText("None");
        OtherDeduction.setText("None");
        deduc.setText("");
        earn.setText("");
        net.setText("");
        prcssDate.setText("");
        ae.setSelected(false);
        se.setSelected(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computeActionPerformed

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
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                payroll dialog = new payroll(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel AdditionalAdjustment;
    private javax.swing.JLabel DeductionAdjustment;
    private javax.swing.JLabel Holiday;
    private javax.swing.JLabel OtherDeduction;
    private javax.swing.JLabel Pagibig;
    private javax.swing.JLabel Pagibig1;
    private javax.swing.JLabel Philhealth;
    private javax.swing.JLabel Regular;
    private javax.swing.JLabel RestDay;
    private javax.swing.JLabel RestDayHoliday;
    private javax.swing.JLabel SSS;
    private javax.swing.JLabel SickLeave;
    private javax.swing.JLabel Tax;
    private javax.swing.JLabel VacationLeave;
    private javax.swing.JRadioButton ae;
    private javax.swing.JTextField basic;
    private javax.swing.JTextField code;
    private javax.swing.JButton compute;
    private javax.swing.JTextField deduc;
    private javax.swing.JTextField earn;
    private javax.swing.JTextField empfn;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField empln;
    private javax.swing.JTextField empmn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField net;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField prcssDate;
    private javax.swing.JRadioButton se;
    private javax.swing.JTextField searchCode;
    private javax.swing.JTextField searchId;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
public String getValue(String title){
    String value = "";
        try{
            prop.load(new FileInputStream("config.properties"));
            value = prop.getProperty(title);
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, "2");}
        return value;
}
}
