//multiple thread performing individual task
class ThreadDemo4 extends Thread{

	String name;
	
	ThreadDemo4(String s) {
		name = s;
	}
	
	public void run() {
			
		for(int i=1; i<=10;i++) {

			System.out.println(name+" : "+i);
			try{
				Thread.sleep(1500);
			}catch(InterruptedException e) { }
	
		}
	}

		
		ThreadDemo4 obj1 = new ThreadDemo4("cut the ticket");
		Thread t1 = new Thread(obj1);
		t1.start();

		ThreadDemo4 obj2 = new ThreadDemo4("show the seat");
		Thread t2 = new Thread(obj2);
		t2.start();
	}
}






















