package lab.pkg7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */


import java.beans.*;

public class BeanIntrospection {
    public static void main(String[] args) {
        try {
            
            BeanInfo info = Introspector.getBeanInfo(Student.class);
            
            System.out.println("Properties of JavaBean:");
            PropertyDescriptor[] pds = info.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                System.out.println("- " + pd.getName());
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
