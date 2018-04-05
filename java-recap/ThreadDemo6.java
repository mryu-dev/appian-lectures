class ThreadDemo6 extends Thread
{
	ThreadDemo6(String name)
	{
		this.setName(name);
	}

	public void run()
	{
			for(int i=1;i<=10;i++)
			{
					try
					{
						sleep(2000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("Name="+getName());
					System.out.println("Priority="+getPriority());
			}
		}

	public void check()
	{
		if(isAlive())
		{
			System.out.println("Thread "+getName()+" is Alive ");
		}
		else
		{
			System.out.println("Thread "+getName()+" is Dead");
		}
	}

	public static void main(String args[])
	{
		ThreadDemo6 t1=new ThreadDemo6("t1");
		ThreadDemo6 t2=new ThreadDemo6("t2");
		ThreadDemo6 t3=new ThreadDemo6("t3");

		System.out.println("Thread is started........");
		t1.start();
		t2.start();
		t3.start();

		System.out.println("Thread is suspended.......");
		t1.suspend();
		t2.suspend();
		t3.suspend();

		System.out.println("Checking the Thread After Suspend.......");
		t1.check();
		t2.check();
		t3.check();

		System.out.println("Resume the Thread.........");
		t1.resume();
		t2.resume();
		t3.resume();

		try
		{
			t1.join();
			//t2.join();
			//t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("Checking the Thread.......");
				t1.check();
				t2.check();
				t3.check();
	}
}