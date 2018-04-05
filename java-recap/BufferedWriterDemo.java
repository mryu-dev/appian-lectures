import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter("temp.txt"));
		out.write("Welcome to MZOS");
		out.close();
	}
}
