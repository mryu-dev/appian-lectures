import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	
	int id;
	String name;
	static float sal = 5;
	transient Date dob;
	
	public Employee() {
		sal++;
	}
	
	static Employee getData() throws  IOException {
		
		Employee e  = new Employee();
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		e.id = Integer.parseInt(dis.readLine());
		e.name = dis.readLine();
		Date d = new Date();
		e.dob =d;
		
		return e;
	}
}





