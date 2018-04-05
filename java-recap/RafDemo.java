import java.io.*;

class RafDemo {
	public static void main (String[] s) throws Exception {
		RandomAccessFile r  =new RandomAccessFile(new File("FileRead.java"),"rw");
		
		r.seek(20);
		int count = 0;
		int data = r.read();

		while(data != -1){
			char c = (char)data;
			System.out.print (c);
			data = r.read();
		}
		r.close();
	}
}