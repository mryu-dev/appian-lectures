
public class Demo {
	public static void main(String args[]) {

        String str = "Hello";
        String str1 = "Hello"; 
        System.out.println(str==str1);
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));
        
        char c[] = {'c','h','a','i','r','s'};
        String s = new String(c);
        System.out.println(s);

        String s1 = new String(c,2,3);
        System.out.println(s1);

        float floatVar = 10.20f;
        int intVar = 10;
        String stringVar = "Bye!!!";
        String fs;
        fs = String.format("The value of the float variable is " +
                           "%f, while the value of the integer " +
                           "variable is %d, and the string " +
                           "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);
        
        System.out.println(fs.length());
        
        System.out.println(fs.toUpperCase());
        System.out.println(fs.toLowerCase());
        
        String sentence = "Hello, this is a book on Java";
        String arr[];
        arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);
    }
} 