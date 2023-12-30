package Quiz_1;

import java.util.Scanner;

public class Program_2_Natural_Thread {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Value of N : ");
		int n = s.nextInt();
		ThreadPrinter O = new ThreadPrinter(n);
		ThreadPrinter E = new ThreadPrinter(n);
		Thread t1 = new Thread(O);
		Thread t2 = new Thread(E);
		System.out.print("\nThe "+n+" Natural Numbers are\n");
		t1.start();
		t2.start();
		s.close();
	}
}

class ThreadPrinter implements Runnable
{
	int n;
	static int v=1;
	private static final Object lock = new Object();
	public void run()
	{
		synchronized(lock)
		{
			while(v <= n)
			{
				System.out.print(" "+v+" ");
				v++;
				lock.notify();
				try
				{
					if(v <= n)
					{
						lock.wait();
					}				
				}
				catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
			}
		}
	}
	public ThreadPrinter(int a)
	{
		this.n = a;
	}
}





/*
The Output is

Enter the Value of N : 18

The 18 Natural Numbers are
 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18 
*/