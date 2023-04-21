/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.main;

import interfaces.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import payroll.subwins.*;
import payroll.basecodes.*;
/**
 *
 * @author ASUS
 */
public class EmployeeWindow extends javax.swing.JFrame  implements IRetrieveDetails {
    ResultSet result;
    DataType[] values;
    
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rectangle = new Rectangle(0,0,dimension.width,dimension.height-40);
    /**
     * Creates new form EmployeeWindodw
     */
    public EmployeeWindow() {
        SetupWindow();
    }
    
    public EmployeeWindow(String id, String full_name) {
        SetupWindow();
        FullNameText.setText(full_name);
        EmployeeNameText.setText(full_name);
    }
    
    private void SetupWindow()
    {
        initComponents();
        setLocationRelativeTo(null);
//        setExtendedState(MAXIMIZED_BOTH);
        RetrieveDetails();
//        setMaximizedBounds(rectangle);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lo.png")));
    }
    
    @Override
    public void RetrieveDetails(){
        
//        try{
//            conn = db.db();
//            pst = conn.prepareStatement("Select * FROM payroll_schema.emp_tbl WHERE emp_id = ? and firstname = ? and lastname = ?;");
//            pst.setString(1, id);
//            pst.setString(2, onename);
//            pst.setString(3, endname);
//            rs = pst.executeQuery();
//            
//            if(rs.next()){
//                fname.setText(rs.getString("firstname"));
//                lname.setText(rs.getString("lastname"));
//                mname.setText(rs.getString("middlename"));
//                po.setText(rs.getString("position"));
//                di.setText(rs.getString("emp_id"));
//                age.setText(rs.getString("age"));
//                bday.setText(rs.getString("birthday"));
//                sex.setText(rs.getString("gender"));
//                ms.setText(rs.getString("marital_status"));
//                religion.setText(rs.getString("religion"));
//                citi.setText(rs.getString("citizenship"));
//                noc.setText(rs.getString("no_of_child"));
//                ca.setText(rs.getString("current_address"));
//                pa.setText(rs.getString("permanent_address"));
//                ea.setText(rs.getString("email_add"));
//                cn.setText(rs.getString("contact_no"));
//                dep.setText(rs.getString("department"));
//                doc.setText(rs.getString("date_of_commencement"));
//                sr.setText(rs.getString("hourly_rate"));
//                bs.setText(rs.getString("basic_salary"));
//                state.setText(rs.getString("status"));
//                cn.setText(rs.getString("contact_no"));
//                byte[] img1 = rs.getBytes("photo");
//                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img1).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
//                img.setIcon(imageIcon);
//            }
//        }
//        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
//        java.util.Date cd = GregorianCalendar.getInstance().getTime();
//        SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
//        String dt = mf.format(cd);
//        String mnth = dt.substring(0, 2);
//        String yr = dt.substring(2,6);
//        Integer m = Integer.parseInt(mnth);
//        Integer y = Integer.parseInt(yr);
//        String code = m+""+y+"PYRLL";
//        try{
//            conn = db.db();
//            pst = conn.prepareStatement("Select * FROM payroll_schema.payroll_tbl WHERE emp_id = ? and firstname = ? and lastname = ? and pr_code = ?;");
//            pst.setString(1, id);
//            pst.setString(2, onename);
//            pst.setString(3, endname);
//            pst.setString(4, code);
//            rs = pst.executeQuery();
//            if(rs.next()){
//                reg.setText(rs.getString("overtime_reg"));
//                res.setText(rs.getString("overtime_rd"));
//                hol.setText(rs.getString("overtime_hd"));
//                reshol.setText(rs.getString("overtime_hdrd"));
//                sss.setText(rs.getString("sss_deduc"));
//                philhealth.setText(rs.getString("philhealth_deduc"));
//                pagibig.setText(rs.getString("pagibig_deduc"));
//                tax.setText(rs.getString("tax_dduc"));
//                sl.setText(rs.getString("sick_leave"));
//                vl.setText(rs.getString("vacation_leave"));
//                aa.setText(rs.getString("adjustment_add"));
//                da.setText(rs.getString("adjustment_deduc"));
//                od.setText(rs.getString("tax_dduc"));
//                
//            }
//        }
//        catch(Exception e){
//            
//        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BottomPanel = new javax.swing.JPanel();
        LogOutBtnBg = new javax.swing.JPanel();
        LogOutText = new javax.swing.JLabel();
        LoggedAsDesc = new javax.swing.JLabel();
        FullNameText = new javax.swing.JLabel();
        UserLevelDescText = new javax.swing.JLabel();
        UserLevelText = new javax.swing.JLabel();
        TopPanel = new javax.swing.JPanel();
        EmployeeDetailPanel = new javax.swing.JPanel();
        EmployeeDetailSubPanel = new javax.swing.JPanel();
        IconPanel = new javax.swing.JDesktopPane();
        Icon = new javax.swing.JLabel();
        EmployeeNameDesc = new javax.swing.JLabel();
        EmployeeNameText = new javax.swing.JLabel();
        EmployeeIDDesc = new javax.swing.JLabel();
        EmployeeIDText = new javax.swing.JLabel();
        StatusDesc = new javax.swing.JLabel();
        StatusText = new javax.swing.JLabel();
        DepartmentDesc = new javax.swing.JLabel();
        DepartmentText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee");
        setExtendedState(6);
        setUndecorated(true);

        BottomPanel.setBackground(new java.awt.Color(59, 89, 152));

        LogOutBtnBg.setBackground(new java.awt.Color(102, 153, 255));
        LogOutBtnBg.setToolTipText("Press to Log out now");
        LogOutBtnBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutBtnBgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutBtnBgMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LogOutBtnBgMouseReleased(evt);
            }
        });

        LogOutText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutText.setForeground(new java.awt.Color(255, 255, 255));
        LogOutText.setText("Log Out");

        javax.swing.GroupLayout LogOutBtnBgLayout = new javax.swing.GroupLayout(LogOutBtnBg);
        LogOutBtnBg.setLayout(LogOutBtnBgLayout);
        LogOutBtnBgLayout.setHorizontalGroup(
            LogOutBtnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutBtnBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutText)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        LogOutBtnBgLayout.setVerticalGroup(
            LogOutBtnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogOutBtnBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LoggedAsDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoggedAsDesc.setForeground(new java.awt.Color(255, 255, 255));
        LoggedAsDesc.setText("Logged In as:");

        FullNameText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FullNameText.setForeground(new java.awt.Color(255, 255, 255));
        FullNameText.setText("fname");

        UserLevelDescText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserLevelDescText.setForeground(new java.awt.Color(255, 255, 255));
        UserLevelDescText.setText("Access Level:");

        UserLevelText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserLevelText.setForeground(new java.awt.Color(255, 255, 255));
        UserLevelText.setText("division");

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutBtnBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoggedAsDesc)
                    .addComponent(UserLevelDescText))
                .addGap(18, 18, 18)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FullNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserLevelText, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BottomPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoggedAsDesc)
                            .addComponent(FullNameText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserLevelText)
                            .addComponent(UserLevelDescText)))
                    .addComponent(LogOutBtnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        TopPanel.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        getContentPane().add(TopPanel, java.awt.BorderLayout.PAGE_START);

        EmployeeDetailPanel.setBackground(new java.awt.Color(23, 32, 53));

        EmployeeDetailSubPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmployeeDetailSubPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        IconPanel.setLayer(Icon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout IconPanelLayout = new javax.swing.GroupLayout(IconPanel);
        IconPanel.setLayout(IconPanelLayout);
        IconPanelLayout.setHorizontalGroup(
            IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IconPanelLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(42, 42, 42)))
        );
        IconPanelLayout.setVerticalGroup(
            IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IconPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        EmployeeNameDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmployeeNameDesc.setText("Employee name:");

        EmployeeNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmployeeNameText.setText("FullName");

        EmployeeIDDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmployeeIDDesc.setText("Employee ID:");

        EmployeeIDText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmployeeIDText.setText("ID");

        StatusDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusDesc.setText("Status:");

        StatusText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusText.setText("Active || Not Active");

        DepartmentDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DepartmentDesc.setText("Department");

        DepartmentText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DepartmentText.setText("Department");

        javax.swing.GroupLayout EmployeeDetailSubPanelLayout = new javax.swing.GroupLayout(EmployeeDetailSubPanel);
        EmployeeDetailSubPanel.setLayout(EmployeeDetailSubPanelLayout);
        EmployeeDetailSubPanelLayout.setHorizontalGroup(
            EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(IconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                                .addComponent(EmployeeNameDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmployeeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DepartmentDesc)
                            .addComponent(EmployeeIDDesc)
                            .addComponent(StatusDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeIDText)
                            .addComponent(StatusText)
                            .addComponent(DepartmentText))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EmployeeDetailSubPanelLayout.setVerticalGroup(
            EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDetailSubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeNameDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeIDDesc)
                    .addComponent(EmployeeIDText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusDesc)
                    .addComponent(StatusText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmployeeDetailSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentDesc)
                    .addComponent(DepartmentText))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout EmployeeDetailPanelLayout = new javax.swing.GroupLayout(EmployeeDetailPanel);
        EmployeeDetailPanel.setLayout(EmployeeDetailPanelLayout);
        EmployeeDetailPanelLayout.setHorizontalGroup(
            EmployeeDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmployeeDetailSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeDetailPanelLayout.setVerticalGroup(
            EmployeeDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmployeeDetailSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(EmployeeDetailPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutBtnBgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnBgMouseEntered
        // TODO add your handling code here:
        LogOutBtnBg.setBackground(Color.red);
        LogOutText.setForeground(Color.BLACK);
    }//GEN-LAST:event_LogOutBtnBgMouseEntered

    private void LogOutBtnBgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnBgMouseExited
        // TODO add your handling code here:
        LogOutBtnBg.setBackground(new Color(102,153,255));
        LogOutText.setForeground(Color.WHITE);
    }//GEN-LAST:event_LogOutBtnBgMouseExited

    private void LogOutBtnBgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnBgMouseReleased
        // TODO add your handling code here:
        // <editor-fold defaultstate="collapsed" desc="Logged Out Codes Process">
        AppWindow.Switch(new Login(), this);
        ProcessLog.LogOut(EmployeeInfo.getEmployee_id());
        //</editor-fold>
    }//GEN-LAST:event_LogOutBtnBgMouseReleased

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
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JLabel DepartmentDesc;
    private javax.swing.JLabel DepartmentText;
    private javax.swing.JPanel EmployeeDetailPanel;
    private javax.swing.JPanel EmployeeDetailSubPanel;
    private javax.swing.JLabel EmployeeIDDesc;
    private javax.swing.JLabel EmployeeIDText;
    private javax.swing.JLabel EmployeeNameDesc;
    private javax.swing.JLabel EmployeeNameText;
    private javax.swing.JLabel FullNameText;
    private javax.swing.JLabel Icon;
    private javax.swing.JDesktopPane IconPanel;
    private javax.swing.JPanel LogOutBtnBg;
    private javax.swing.JLabel LogOutText;
    private javax.swing.JLabel LoggedAsDesc;
    private javax.swing.JLabel StatusDesc;
    private javax.swing.JLabel StatusText;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel UserLevelDescText;
    private javax.swing.JLabel UserLevelText;
    // End of variables declaration//GEN-END:variables
}
