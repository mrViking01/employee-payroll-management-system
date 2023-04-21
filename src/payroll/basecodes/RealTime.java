/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.basecodes;

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author PLATA
 */
public class RealTime 
{
    
    static String TimeLogIn;
    public static void setTimeLogIn(String TimeLogIn) { RealTime.TimeLogIn = TimeLogIn; }
    public static String getTimeLogIn() { return TimeLogIn; }
     
    static String DateLogIn;
    public static String getDateLogIn() { return DateLogIn; }
    public static void setDateLogIn(String DateLogIn) { RealTime.DateLogIn = DateLogIn; }
    
    static Date currDate;
    static SimpleDateFormat dateFormat;
    
    public static String GetCurrentDate(boolean isSave)
    {
        String date = GetCurrentDate();
        if(isSave) DateLogIn = date;
        
        return date;
    }
    
    public static String GetCurrentTime(boolean isSave)
    {
        String time = GetCurrentTime();
        if(isSave) TimeLogIn = time;
        
        return time;
    }
    
    public static String GetCurrentDate()
    {
        currDate = GregorianCalendar.getInstance().getTime();
        
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(currDate);
    }
    
    public static String GetCurrentTime()
    {
        currDate = new Date();
        
        dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(currDate);
    }
    
    public static void CurrentTime(JLabel label) {
        // <editor-fold defaultstate="collapsed" desc="For Time">
        int run = 0;
        new Thread() {
            public void run() {
                while (run == 0) {
                    Calendar cal = new GregorianCalendar();
                    int second, minute, hour, am_pm;
                    second = cal.get(Calendar.SECOND);
                    minute = cal.get(Calendar.MINUTE);
                    hour = cal.get(Calendar.HOUR);
                    am_pm = cal.get(Calendar.AM_PM);

                    String AM_PM = "";

                    if (am_pm == 1) {
                        AM_PM = "PM";
                    } else {
                        AM_PM = "AM";
                    }
                    label.setText(hour + ":" + minute + ":" + second + " " + AM_PM);
                }
            }
        }.start();
    }
}
