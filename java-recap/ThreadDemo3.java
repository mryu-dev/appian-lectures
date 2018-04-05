//single thread executing multiple task(methods)

class ThreadDemo3 extends Thread {
	
	public void run() {
		
		task1();
		task2();
		task3();
	}

	public void task1() {
		
		System.out.println("In task1 method");
	}
	public void task2() {
		
		System.out.println("In task2 method");
	}

	public void task3() {
		
		System.out.println("In task3 method");
	}
	
	public static void main(String a[]) {
		
		ThreadDemo3 obj = new ThreadDemo3();
		obj.start();
		System.out.println("In main method");
	}
}








