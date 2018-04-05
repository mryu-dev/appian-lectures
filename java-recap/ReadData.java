import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("newfile");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.sal);
		System.out.println(e.dob);
		
	}

}
