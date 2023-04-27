/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.basecodes;

import interfaces.IRetrieveDetails;
import javax.swing.JTable;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PLATA
 */
public class RetrieveData implements IRetrieveDetails {

    private Timer timer;
    private final int Retrieving_Interval = 3000;
    private final String query;
    private ResultSet result;
    private JTable table;

    public RetrieveData(String query, JTable table) {
        this.query = query;
        this.table = table;
    }

    @Override
    public void RetrieveDetails() {
        timer = new Timer();
        timer.scheduleAtFixedRate(
                new TimerTask() {
            @Override
            public void run() {
                result = Database.SendQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(result));
            }
        }, 0, Retrieving_Interval);
    }
}
