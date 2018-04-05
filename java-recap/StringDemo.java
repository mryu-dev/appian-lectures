
public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = "Hello";
		
		System.out.println(str.hashCode());
		
		String test = "ABCD";
	    for (int i = 0; i < test.length(); ++i) {
	      char c = test.charAt(i);
	      System.out.println((int) c);
	    }
	    
	    int    ints[] = new int[3];
	    Object objs[] = new Object[7];

	    String stra = "Hello World";
	    String strb = new String();

	    // Length of any array - use its length attribute
	    System.out.println("Length of ints is " + ints.length);
	    System.out.println("Length of objs is " + objs.length);
	    
	    // Length of any string - call its length() method.
	    System.out.println("Length of stra is " + stra.length());
	    System.out.println("Length of strb is " + strb.length());
	  		  
	    //Convert string to char array	
	    String literal = "Examples";

	    char[] temp = literal.toCharArray();

	    for (int i = 0; i < temp.length; i++) {
	      System.out.println(temp[i]);
	    }
	}
}
