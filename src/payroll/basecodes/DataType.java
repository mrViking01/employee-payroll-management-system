/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.basecodes;

/**
 *
 * @author PLATA
 */
public class DataType<T,Class> 
{
    T data; 
    Class dataType;

    public void setDataType(Class dataType) { this.dataType = dataType; }

    public Class getDataType() { return dataType; }
    
    public void setData(T data) { this.data = data; }

    public T getData() { return data; }
    
    public DataType(T data, Class dataType) { this.data = data; this.dataType = dataType; }
    
    
}
