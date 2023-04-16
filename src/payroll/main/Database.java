/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.main;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class Database 
{
    
    
    public static Connection Connect(){
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_payroll?autoReconnect=true&useSSL=false","root","root");
            return conn;
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static ResultSet SendQuery(String query, String[] values)
    {
        PreparedStatement statement;
        Connection connect;
        
        connect = Connect();
        try
        {
            statement = connect.prepareStatement(query);
            for(int i = 0; i < values.length; i++)
            {
                statement.setString(i+1, values[i]);
            }

            return statement.executeQuery();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
