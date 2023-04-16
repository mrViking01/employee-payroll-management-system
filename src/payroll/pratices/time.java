/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.pratices;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author ASUS
 */
public class time {
        public static int year,month,day;
    public static void main(String [] args){
        /*java.util.Date cd1 = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat mf1 = new SimpleDateFormat("MM/dd/yyyy");
        String dt = mf1.format(cd1);*/
        String dt = "12/28/2018";
        String mnth = dt.substring(0, 2);
        String dy = dt.substring(3, 5);
        String yr = dt.substring(6, 10);
        Integer m = Integer.parseInt(mnth);
        Integer d = Integer.parseInt(dy);
        Integer y = Integer.parseInt(yr);
        System.out.println(m);
        System.out.println(d);
        System.out.println(y);
        if ( m != 12){
            month = m +1;
            year = y;
        }else{
            month = 1;
            year = y + 1;
        }
        day = 28;
        System.out.println(month+"/"+day+"/"+year);
        
        
        
        
    }
}
