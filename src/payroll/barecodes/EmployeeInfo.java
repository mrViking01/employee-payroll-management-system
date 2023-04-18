/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.main;

/**
 *
 * @author ASUS
 */
public class EmployeeInfo {

    public EmployeeInfo(String employee_id, String employee_first_name, String employee_middle_name, String employee_last_name) {
        _employee_id = employee_id;
        _employee_first_name = employee_first_name;
        _employee_middle_name = employee_middle_name;
        _employee_last_name = employee_last_name;
    }

    private String _employee_id;
    private String _employee_first_name;
    private String _employee_middle_name;
    private String _employee_last_name;

    
    public String getEmployee_id() {
        return _employee_id;
    }

    public String getEmployee_first_name() {
        return _employee_first_name;
    }

    public String getEmployee_middle_name() {
        return _employee_middle_name;
    }

    public String getEmployee_last_name() {
        return _employee_last_name;
    }

    public void setEmployee_id(String _employee_id) {
        this._employee_id = _employee_id;
    }

    public void setEmployee_first_name(String _employee_first_name) {
        this._employee_first_name = _employee_first_name;
    }

    public void setEmployee_middle_name(String _employee_middle_name) {
        this._employee_middle_name = _employee_middle_name;
    }

    public void setEmployee_last_name(String _employee_last_name) {
        this._employee_last_name = _employee_last_name;
    }
    
    
    
}
