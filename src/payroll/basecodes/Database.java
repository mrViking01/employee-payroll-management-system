/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.basecodes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Database {

    public final static String employeeTable = "employee_tbl";    
    public final static String accountTable = "employee_tbl";
    public final static String logTable = "log_tbl";
    
    public final static String accountView = "accountdetails";
    public final static String timeLogView = "timelogdetails";

    
    public static Connection Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_database?autoReconnect=true&useSSL=false", "root", "");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            AppWindow.ShowNotification(e);
            return null;
        }
    }
    
    public static ResultSet SendQuery(String query) {
        PreparedStatement statement;
        Connection connect;

        connect = Connect();
        try {
            statement = connect.prepareStatement(query);
            
            return statement.executeQuery();
        } catch (SQLException e) {
            AppWindow.ShowNotification(e);
            return null;
        }
    }

    public static ResultSet SendQuery(String query, DataType[] values, Boolean... isExecuteOnly) {
        PreparedStatement statement;
        Connection connect;

        connect = Connect();
        try {
            statement = connect.prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                Class type = (Class) values[i].getDataType();
//                statement.setString(i+1, values[i]);
                if (type == String.class) {
                    String stringValue = (String) Convert.ConvertInstanceOfObject(values[i].data, (Class) values[i].dataType);
                    statement.setString(i + 1, stringValue);
                } else if (type == Integer.class) {
                    int intValue = (int) Convert.ConvertInstanceOfObject(values[i].data, (Class) values[i].dataType);
                    statement.setInt(i + 1, intValue);
                } else if (type == Double.class) {
                    double doubleValue = (double) Convert.ConvertInstanceOfObject(values[i].data, (Class) values[i].dataType);
                    statement.setDouble(i + 1, doubleValue);
                }
            }
            Boolean value = isExecuteOnly.length >= 1 ? isExecuteOnly[0]: false;
            
            if(value)
            {
                statement.execute();
                return null;
            }
            else
            {
                return statement.executeQuery();
            }
        } catch (SQLException e) {
            AppWindow.ShowNotification(e);
            return null;
        }
    }

}
