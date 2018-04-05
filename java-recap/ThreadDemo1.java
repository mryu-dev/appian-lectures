class ThreadDemo1 {
	
	public static void main(String args[]) {
	
		Thread  t = Thread.currentThread();
		System.out.println("current thread is: "+t);
		System.out.println("Thread Name:" +t.getName());	

		System.out.println("Thread Priority:" +t.getPriority());	
		
//		t.setPriority(8);
		t.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Thread Priority:" +t.getPriority());	
		
	}
}