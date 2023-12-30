package Quiz_1;

public class Program_1_Threads {

	public static void main(String[] args) {
		Threader t = new Threader();
		Thread t1 = new Thread(t);
		t1.setName("THE ONE");
		Thread t2 = new Thread(t);
		t2.setName("THE TWO");
		t1.start();
		t2.start();
	}
}

class Threader implements Runnable
{
	public void run()
	{
		System.out.print("The Name of this Thread is "+Thread.currentThread().getName()+"\n\n");
	}
}




/*
The Output is

The Name of this Thread is THE ONE

The Name of this Thread is THE TWO
*/
