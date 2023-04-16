/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class EmployeeWindow extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    String id, onename, endname;
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle r = new Rectangle(0,0,d.width,d.height-40);
    /**
     * Creates new form EmployeeWindodw
     */
    public EmployeeWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(6);
        setMaximizedBounds(r);
        detail();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lo.png")));
    }
    
    public EmployeeWindow(String usr,String frname,String lsname, String opt) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(6);
        setMaximizedBounds(r);
        id = usr;
        onename = frname;
        endname = lsname;
        detail();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lo.png")));
        
    }
    public void detail(){
        try{
            conn = db.db();
            pst = conn.prepareStatement("Select * FROM payroll_schema.emp_tbl WHERE emp_id = ? and firstname = ? and lastname = ?;");
            pst.setString(1, id);
            pst.setString(2, onename);
            pst.setString(3, endname);
            rs = pst.executeQuery();
            
            if(rs.next()){
                fname.setText(rs.getString("firstname"));
                lname.setText(rs.getString("lastname"));
                mname.setText(rs.getString("middlename"));
                po.setText(rs.getString("position"));
                di.setText(rs.getString("emp_id"));
                age.setText(rs.getString("age"));
                bday.setText(rs.getString("birthday"));
                sex.setText(rs.getString("gender"));
                ms.setText(rs.getString("marital_status"));
                religion.setText(rs.getString("religion"));
                citi.setText(rs.getString("citizenship"));
                noc.setText(rs.getString("no_of_child"));
                ca.setText(rs.getString("current_address"));
                pa.setText(rs.getString("permanent_address"));
                ea.setText(rs.getString("email_add"));
                cn.setText(rs.getString("contact_no"));
                dep.setText(rs.getString("department"));
                doc.setText(rs.getString("date_of_commencement"));
                sr.setText(rs.getString("hourly_rate"));
                bs.setText(rs.getString("basic_salary"));
                state.setText(rs.getString("status"));
                cn.setText(rs.getString("contact_no"));
                byte[] img1 = rs.getBytes("photo");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img1).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
                img.setIcon(imageIcon);
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        java.util.Date cd = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat mf = new SimpleDateFormat("MMyyyy");
        String dt = mf.format(cd);
        String mnth = dt.substring(0, 2);
        String yr = dt.substring(2,6);
        Integer m = Integer.parseInt(mnth);
        Integer y = Integer.parseInt(yr);
        String code = m+""+y+"PYRLL";
        try{
            conn = db.db();
            pst = conn.prepareStatement("Select * FROM payroll_schema.payroll_tbl WHERE emp_id = ? and firstname = ? and lastname = ? and pr_code = ?;");
            pst.setString(1, id);
            pst.setString(2, onename);
            pst.setString(3, endname);
            pst.setString(4, code);
            rs = pst.executeQuery();
            if(rs.next()){
                reg.setText(rs.getString("overtime_reg"));
                res.setText(rs.getString("overtime_rd"));
                hol.setText(rs.getString("overtime_hd"));
                reshol.setText(rs.getString("overtime_hdrd"));
                sss.setText(rs.getString("sss_deduc"));
                philhealth.setText(rs.getString("philhealth_deduc"));
                pagibig.setText(rs.getString("pagibig_deduc"));
                tax.setText(rs.getString("tax_dduc"));
                sl.setText(rs.getString("sick_leave"));
                vl.setText(rs.getString("vacation_leave"));
                aa.setText(rs.getString("adjustment_add"));
                da.setText(rs.getString("adjustment_deduc"));
                od.setText(rs.getString("tax_dduc"));
                
            }
        }
        catch(Exception e){
            
        }
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
        jPanel3 = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        di = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        level1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        bday = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        citi = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        noc = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        ea = new javax.swing.JLabel();
        pa = new javax.swing.JLabel();
        ca = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        dep = new javax.swing.JLabel();
        po = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        sr = new javax.swing.JLabel();
        bs = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        od = new javax.swing.JLabel();
        da = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        vl = new javax.swing.JLabel();
        sl = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        pagibig = new javax.swing.JLabel();
        philhealth = new javax.swing.JLabel();
        sss = new javax.swing.JLabel();
        reshol = new javax.swing.JLabel();
        hol = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee");
        setExtendedState(6);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(59, 89, 152));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setToolTipText("Press to Log out now");
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Log Out");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOut)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logged In as:");

        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setText("lname");

        level.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));
        level.setText("division");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Level:");

        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setText("fname");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(level)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firstname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastname)))
                .addContainerGap(1091, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(firstname)
                            .addComponent(lastname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(level)
                            .addComponent(jLabel9)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(23, 32, 53));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname.setText("FirstName");

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel.setText("Employee name:");

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.setText("LastName");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Employee ID:");

        di.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        di.setText("ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Status:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Access Level:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("login || logout");

        level1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        level1.setText("level");

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mname.setText("MiddleName");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(fname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mname))
                            .addComponent(level1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(di)
                            .addComponent(jLabel14))))
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(di))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(level1))
                .addGap(30, 30, 30))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Age:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Birthday:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Marital Status:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Religion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Citizenship:");

        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        age.setText("age");

        bday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bday.setText("bday");

        sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sex.setText("sex");

        ms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ms.setText("ms");

        religion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        religion.setText("religion");

        citi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        citi.setText("citisenship");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Number of Children:");

        noc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noc.setText("no of child");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(bday)
                    .addComponent(religion)
                    .addComponent(citi)
                    .addComponent(sex)
                    .addComponent(ms)
                    .addComponent(noc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(religion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(citi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(noc))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Current Address:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Permanent Address:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Email Address:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Contact Nuumber:");

        cn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cn.setText("contact no");

        ea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ea.setText("email add");

        pa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pa.setText("permanent add");

        ca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ca.setText("current add");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cn)
                    .addComponent(ea)
                    .addComponent(pa)
                    .addComponent(ca))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(pa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(ea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cn))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Department:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Position:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Date of Commencement:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Salart Rate:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Basic Salary:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Status:");

        dep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dep.setText("depart");

        po.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        po.setText("postion");

        doc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doc.setText("doc");

        sr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sr.setText("sr");

        bs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bs.setText("bs");

        state.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        state.setText("state");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dep, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(po, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sr, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bs, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(state, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doc, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(dep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(po))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(doc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(sr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(bs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(state))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payroll Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Rest Day Overtime:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Holiday Overtime:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Rest Day Holiday:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("SSS:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Philhealth:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Padibig:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Tax:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Regular Overtime:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Vacation Leave:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Sick Leave:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Additional Adjuustment:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Deduction Adjustment:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Other Deduction:");

        od.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        od.setText("Other Deduction:");

        da.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        da.setText("Deduction Adjustment:");

        aa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aa.setText("Additional Adjuustment:");

        vl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vl.setText("Vacation Leave:");

        sl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sl.setText("Sick Leave:");

        tax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tax.setText("Tax:");

        pagibig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagibig.setText("Padibig:");

        philhealth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        philhealth.setText("Philhealth:");

        sss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sss.setText("SSS:");

        reshol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reshol.setText("Rest Day Holiday:");

        hol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hol.setText("Holiday Overtime:");

        res.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        res.setText("Rest Day Overtime:");

        reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reg.setText("Regular Overtime:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(aa)
                        .addComponent(od, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tax, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pagibig, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(philhealth, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sss, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reshol, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hol, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(res, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reg, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(da))
                .addGap(53, 53, 53))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(reg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(hol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(reshol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(sss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(philhealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(pagibig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(tax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(sl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(vl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(aa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(da))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(od))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 216, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(Color.red);
        LogOut.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(102,153,255));
        LogOut.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
        // <editor-fold defaultstate="collapsed" desc="Logged Out Codes Process">
        login login = new login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();

        Date cd = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = df.format(cd);

        Date da = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(da);

        String ds = dateString;
        String ts = timeString;
        String id = emp.empid;
        String fn = emp.empfn;
        String ln = emp.empln;
        // <editor-fold defaultstate="collapsed" desc="Logged Out Audit">
        try{
            conn = db.db();
            pst = conn.prepareStatement("SELECT * FROM payroll_schema.timemonitor_tbl WHERE id = ? AND date_in = ? AND time_in = ? ;");
            pst.setString(1, id);
            pst.setString(2, time.datein);
            pst.setString(3, time.timein);
            rs = pst.executeQuery();

            while(rs.next()){
                String timein = rs.getString("time_in");
                String datein = rs.getString("date_in");
                
                String hour = timein.substring(0, 2);//first
                String min = timein.substring(3, 5);//first
                
                String hour1 = ts.substring(0, 2);//second
                String min1 = ts.substring(3, 5);//second
                
                Integer hours = Integer.parseInt(hour);//first
                Integer mins = Integer.parseInt(min);//first
                
                Integer hours1 = Integer.parseInt(hour1);//second
                Integer mins1 = Integer.parseInt(min1);//second
                    if(hours == hours1){
                        int timemin = mins1 -mins ;
                        if(timemin < 60){
                            int twh = 1;
                        try{
                            
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.timemonitor_tbl set date_out = '"+ds+"', time_out='"+ts+"', status = 'Logged Out', twh = "+twh+" where ID = "+id+" AND Status = 'Logged In';");
                            pst.execute();
                            this.dispose();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("insert into payroll_schema.overtime_tbl values (?,?,?,?,?,?,?,?,?,?);");
                            pst.setString(1, id);
                            pst.setString(2, ln);
                            pst.setString(3, fn);
                            pst.setString(4, String.valueOf(twh));
                            pst.setString(5, "No Validation");
                            pst.setString(6, timein);
                            pst.setString(7, ts);
                            pst.setString(8, datein);
                            pst.setString(9, "Not yet recorded");
                            pst.setString(10, "No Validation");
                            pst.execute();
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                        }
                        
                    }else if(hours < hours1 && mins1 <= 30){
                        int hou = hours1 - hours;
                        try{
                            System.out.print(min1);
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.timemonitor_tbl set date_out = '"+ds+"', time_out='"+ts+"', status = 'Logged Out', twh = "+hou+" where ID = "+id+" AND Status = 'Logged In';");
                            pst.execute();
                            this.dispose();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("insert into payroll_schema.overtime_tbl values (?,?,?,?,?,?,?,?,?,?);");
                            pst.setString(1, id);
                            pst.setString(2, ln);
                            pst.setString(3, fn);
                            pst.setString(4, String.valueOf(hou));
                            pst.setString(5, "No Validation");
                            pst.setString(6, timein);
                            pst.setString(7, ts);
                            pst.setString(8, datein);
                            pst.setString(9, "Not yet recorded");
                            pst.setString(10, "No Validation");
                            pst.execute();
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }else if(hours < hours1 && mins1 > 30){
                            int hou = hours1 - hours + 1;
                        try{
                            System.out.println(hour);
                            System.out.println(hour1);
                            System.out.println(min1);
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.timemonitor_tbl set date_out = '"+ds+"', time_out='"+ts+"', status = 'Logged Out', twh = "+hou+" where ID = "+id+" AND Status = 'Logged In';");
                            pst.execute();
                            this.dispose();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("insert into payroll_schema.overtime_tbl values (?,?,?,?,?,?,?,?,?,?);");
                            pst.setString(1, id);
                            pst.setString(2, ln);
                            pst.setString(3, fn);
                            pst.setString(4, String.valueOf(hou));
                            pst.setString(5, "No Validation");
                            pst.setString(6, timein);
                            pst.setString(7, ts);
                            pst.setString(8, datein);
                            pst.setString(9, "Not yet recorded");
                            pst.setString(10, "No Validation");
                            pst.execute();
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                        
                    }else if(hours1 > 0 && hours1 < hours && mins1 > 30){
                        int twh1 =  ((24 - hours) + hours1)+1;
                        try{
                            
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.timemonitor_tbl set date_out = '"+ds+"', time_out='"+ts+"', status = 'Logged Out', twh = "+twh1+" where ID = "+id+" AND Status = 'Logged In';");
                            pst.execute();
                            this.dispose();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("insert into payroll_schema.overtime_tbl values (?,?,?,?,?,?,?,?,?,?);");
                            pst.setString(1, id);
                            pst.setString(2, ln);
                            pst.setString(3, fn);
                            pst.setString(4, String.valueOf(twh1));
                            pst.setString(5, "No Validation");
                            pst.setString(6, timein);
                            pst.setString(7, ts);
                            pst.setString(8, datein);
                            pst.setString(9, "Not yet recorded");
                            pst.setString(10, "No Validation");
                            pst.execute();
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }else if(hours1 > 0 && hours1 < hours && mins1 < 30){
                            int twh1 =  (24 - hours) + hours1;
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("update payroll_schema.timemonitor_tbl set date_out = '"+ds+"', time_out='"+ts+"', status = 'Logged Out', twh = "+twh1+" where ID = "+id+" AND Status = 'Logged In';");
                            pst.execute();
                            this.dispose();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                        try{
                            conn = db.db();
                            pst = conn.prepareStatement("insert into payroll_schema.overtime_tbl values (?,?,?,?,?,?,?,?,?,?);");
                            pst.setString(1, id);
                            pst.setString(2, ln);
                            pst.setString(3, fn);
                            pst.setString(4, String.valueOf(twh1));
                            pst.setString(5, "No Validation");
                            pst.setString(6, timein);
                            pst.setString(7, ts);
                            pst.setString(8, datein);
                            pst.setString(9, "Not yet recorded");
                            pst.setString(10, "No Validation");
                            pst.execute();
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
            }
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}

        // </editor-fold>
        //</editor-fold>
    }//GEN-LAST:event_jPanel3MouseReleased

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
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel age;
    private javax.swing.JLabel bday;
    private javax.swing.JLabel bs;
    private javax.swing.JLabel ca;
    private javax.swing.JLabel citi;
    private javax.swing.JLabel cn;
    private javax.swing.JLabel da;
    private javax.swing.JLabel dep;
    private javax.swing.JLabel di;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel ea;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel hol;
    private javax.swing.JLabel img;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel level;
    private javax.swing.JLabel level1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel ms;
    private javax.swing.JLabel noc;
    private javax.swing.JLabel od;
    private javax.swing.JLabel pa;
    private javax.swing.JLabel pagibig;
    private javax.swing.JLabel philhealth;
    private javax.swing.JLabel po;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel religion;
    private javax.swing.JLabel res;
    private javax.swing.JLabel reshol;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel sl;
    private javax.swing.JLabel sr;
    private javax.swing.JLabel sss;
    private javax.swing.JLabel state;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel vl;
    // End of variables declaration//GEN-END:variables
}
