
class Reserve implements Runnable {

	//available berth are 1
	int available = 1;
	int wanted;
	
	public Reserve(int w) {
		this.wanted = w;
	}
	
	@Override
	synchronized public void run() {
			System.out.println("Available berth = "+available);
			if (available >= wanted) {
				//get the name of passenger
				String name = Thread.currentThread().getName();
				System.out.println(wanted + " Berths reserved for "+name);
				try{
					Thread.sleep(1500);
					available -= wanted;
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("sorry no berths");
			}
			
		}
}

public class ThreadDemo5 {

	public static void main(String[] args) {
	
	Reserve obj = new Reserve(1);
	
	Thread t1 = new Thread(obj, "First Person");
	Thread t2 = new Thread(obj, "Second Person");
	
	t1.start();
	t2.start();
	}
}





















