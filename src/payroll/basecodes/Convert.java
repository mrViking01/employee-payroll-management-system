/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.basecodes;

/**
 *
 * @author PLATA
 */
public class Convert {
    public static <T> T ConvertInstanceOfObject(Object object, Class<T> typeClass) {
        try {
            return typeClass.cast(object);
        } catch(ClassCastException e) {
            return null;
        }
    }
}
