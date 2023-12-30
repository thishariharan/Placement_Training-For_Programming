package Quiz_1;

public class Program_3_PalPrime_Thread {

	public static void main(String[] args) {
		Primer prime = new Primer(0,10);
		prime.start();
		Palindromer pal = new Palindromer(10,50);
		try
		{
			prime.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		pal.start();
	}
}

class Primer extends Thread
{
	int s,e;
	public void run()
	{
		System.out.print("\nThe Prime Numbers between "+s+" and "+e+" are\n");
		int f,i;
		for(i=s;i<=e;i++)
		{
			if(i>1)
			{
				f = checker(i);
				if(f == 1)
				{		
					System.out.print(" "+i+" ");			
				}				
			}
		}
	}
	public int checker(int a)
	{
		int i,t=0;
		for(i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i == 0)
			{
				t++;
			}
		}
		if(t==0)
		{
			return 1;
		}
		else
		{
			return 24;
		}
	}
	public Primer(int a,int b)
	{
		this.s = a;
		this.e = b;
	}
}

class Palindromer extends Thread
{
	int s,e,i;
	public void run()
	{
		System.out.print("\n\nThe Palindrome Numbers between "+s+" and "+e+" are\n");
		int f;
		for(i=s;i<=e;i++)
		{
			f = checker(i);
			if(f == 1)
			{
				System.out.print(" "+i+" ");				
			}
			
		}
	}
	public int  checker(int a)
	{
		int r=0,t=a;
		while(t > 0)
		{
			r *= 10;
			r += (t%10);
			t /= 10;
		}
		if(r == a)
		{
			return 1;
		}
		else
		{
			return 25;
		}
	}
	public Palindromer(int a,int b)
	{
		this.s = a;
		this.e = b;
	}
}




/*
The Output is

The Prime Numbers between 0 and 10 are
 2  3  5  7 

The Palindrome Numbers between 10 and 50 are
 11  22  33  44 
*/