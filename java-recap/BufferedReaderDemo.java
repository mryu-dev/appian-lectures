import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class BufferedReaderDemo {
	public static void main(String[] args) {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         String strLine = null;
         
         System.out.println("Reading line of characters from console");
         System.out.println("Enter exit to quit");
         
         try
         {
               
                while( (strLine = br.readLine()) != null)
                {
                   if(strLine.equals("exit"))
                                break;
                               
                   System.out.println("Line entered : "  + strLine);
                                                                                                                                                                                                                       
                }
               
                br.close();                                    
         }
         catch(Exception e)
         {
                System.out.println("Error while reading line from console : " + e);
         }
	}
}