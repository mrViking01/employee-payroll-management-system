/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.pratices;

import java.sql.*;
import payroll.main.db;

/**
 *
 * @author ASUS
 */
public class nearestValue {
    Connection conn, conn1;
    PreparedStatement pst, pst1;
    ResultSet rs, rs1;
    public void ifCondition(){
        int x = 0;
        
        try{
            conn1 = db.db();
            pst1 = conn1.prepareStatement("SELECT * FROM payroll_schema.payroll_tbl WHERE pr_code = ?;");
            pst1.setString(1, "22019PYRLL");
            rs1 = pst1.executeQuery();
            while(rs1.next()){
                double givenValue = rs1.getDouble("basic_salary");
                int id = rs1.getInt("emp_id");
                do{
                    try{
                            conn = db.db();
                            pst = conn.prepareStatement("Select * From payroll_schema.subsss_tbl");
                            rs = pst.executeQuery();
                            while(rs.next()){
                                if(givenValue >= rs.getDouble("sss_min") && givenValue <= rs.getDouble("sss_max")){
                                    System.out.println(rs.getString("ee"));
                               }
                            }
                     }
                        catch(Exception e){
                           System.out.println(e);
                       }
                }while(id <= 0);
            }
        }
        catch(Exception e){}
    }
    public static void main(String [] args){
        nearestValue nv = new nearestValue();
        nv.ifCondition();
    }
}
/*try{
                                    
                                    conn = db.db();
                                    pst = conn.prepareStatement("Select * From payroll_schema.subpagibig_tbl Where pagibig_id = "+b+";");
                                    rs = pst.executeQuery();
                                    while(pst.execute()){
                                        if(givenValue >= rs.getDouble("pagibig_min") && givenValue <= rs.getDouble("pagibig_max")){
                                            deduc1 = (givenValue * rs.getInt("ee_rate"))/100;
                                            JOptionPane.showMessageDialog(null, deduc1);
                                            
                                        }else if(!(givenValue >= rs.getDouble("pagibig_min") && givenValue <= rs.getDouble("pagibig_max")) && givenValue >= 5000.00){
                                            deduc1 = 100.00;
                                        }
                                    }
                                }
                                catch(Exception r){JOptionPane.showMessageDialog(null, r);}*/