import java.io.*;

class FileRead {
	public static void main (String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Desert.jpg");
		FileOutputStream fos = new FileOutputStream("op.jpg");
		int data=0;
		while((data = fis.read())!= -1){
			fos.write(data);
		}
		fis.close();
		fos.close();
	}
}