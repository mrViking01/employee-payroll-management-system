/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.basecodes;

/**
 *
 * @author PLATA
 */
public class ProcessLog{
    
    static DataType[] values;

    public static void LogIn(String ID) {
        values = new DataType[4];
        values[0] = new DataType(ID, String.class);
        values[1] = new DataType(RealTime.GetCurrentTime(true), String.class);
        values[2] = new DataType(RealTime.GetCurrentDate(true), String.class);
        values[3] = new DataType("Logged In", String.class);

        Database.SendQuery("Insert into " + Database.logTable + " (employee_id, time_in, date_in, status) values (?,?,?,?);", values, true);
        
        System.out.println("Logged In!!!");
    }

    public static void LogOut(String ID) {
        
        values = new DataType[6];
        values[0] = new DataType(RealTime.GetCurrentTime(), String.class);
        values[1] = new DataType(RealTime.GetCurrentDate(), String.class);
        values[2] = new DataType("Logged Out", String.class);
        values[3] = new DataType(ID, String.class);
        values[4] = new DataType(RealTime.TimeLogIn, String.class);
        values[5] = new DataType(RealTime.DateLogIn, String.class);
       
        Database.SendQuery("UPDATE " + Database.logTable +  " SET time_out = ?, date_out = ?, status = ? WHERE employee_id = ? AND time_in = ? AND date_in = ?;", values, true);
        
        System.out.println("Logged Out!!!");
    }
    
}
