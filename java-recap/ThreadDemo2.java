import java.io.*;
class ThreadDemo2 implements Runnable{
	
	boolean flag = false;
	public void run() {
		
		for(int i=1; i<2;i++) {
			System.out.println(Thread.currentThread());
			if(flag == true)
			 return;
			System.out.println("i: "+i);
		}
	}

	public static void main(String a[]) throws IOException{
		
		System.out.println(Thread.currentThread());
		ThreadDemo2 obj = new ThreadDemo2();
		Thread t = new Thread(obj);
		t.start();
		System.in.read();
		obj.flag = true;
		
	}
}
