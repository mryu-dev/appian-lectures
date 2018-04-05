public class VarArgs {
  public static void main(String... args) {
    vaMethod(10);
    vaMethod(10,"a");
    vaMethod(10, "a", "b", "c", "d");
  }

  //printf(const char *__format, ...)
  
  public static void vaMethod(int j, String... str) {
    System.out.println("You gave me " + str.length + " args!  Yay.");
    if (str.length == 1) 
    	System.out.println(str[0]);
  }
}