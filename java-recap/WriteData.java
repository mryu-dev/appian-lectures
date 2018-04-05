import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteData {

	public static void main(String[] args) throws IOException {
		Employee e = Employee.getData();
		try {     
	            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("newfile"));     
	            os.writeObject(e);     
	            os.close();  
	            System.out.println("Object written in file"+Employee.sal);
	        } catch (IOException e1) {     
	            // TODO ABCuto-generated catch block     
	            e1.printStackTrace();     
	        }     
	    }     
}
