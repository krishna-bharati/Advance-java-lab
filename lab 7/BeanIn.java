package lab.pkg7;




import java.beans.*;

public class BeanIn {
    public static void main(String[] args) {
        try {
            // Introspect MyButton Bean
            BeanInfo info = Introspector.getBeanInfo(MyButton.class);

            System.out.println("Properties of MyButton:");
            PropertyDescriptor[] pds = info.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                System.out.println("- " + pd.getName());
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}