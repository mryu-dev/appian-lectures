
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try{
			int i = 10;
			int result ;
	        result = i / Integer.parseInt(args[0]);
	        System.out.println("The answer is " + result);
	        
	        int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	     
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
		finally{
		System.out.println("finally block");	
		}
		
	}
}
