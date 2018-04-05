import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

    public static void main(String[] args) {

        Vector<String> vc=new Vector<String>();

        vc.add("Two");
        vc.add("One");
        vc.add("Four");
        vc.add("Three");

        // Get Enumeration to get value
        Enumeration em=vc.elements();

        while(em.hasMoreElements())
        {
            String value = (String)em.nextElement();

            System.out.println("value :"+value);
        }
    }
}