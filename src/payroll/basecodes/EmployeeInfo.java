/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.basecodes;
/**
 *
 * @author ASUS
 */
public class EmployeeInfo {

    public EmployeeInfo(String employee_id, String employee_full_name) {
        _employee_id = employee_id;
        _employee_full_name = employee_full_name;
    }

    private static String _employee_id;
    private static String _employee_full_name;

    public static String getEmployee_id() {
        return _employee_id;
    }

    public static void setEmployee_id(String _employee_id) {
        EmployeeInfo._employee_id = _employee_id;
    }

    public static String getEmployee_full_name() {
        return _employee_full_name;
    }

    public static void setEmployee_full_name(String _employee_full_name) {
        EmployeeInfo._employee_full_name = _employee_full_name;
    }

    
    
}
