package P_1;

import java.util.HashSet;
import java.util.Scanner;

public class Program_3_Happiness {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number N to check if it is Happy or Not : ");
		int n = s.nextInt();
		Happy h = new Happy();
		int b = h.check(n);
		System.out.print("\nThe Number "+n+" is Happy : ");
		if(b==0)
		{
			System.out.print("True");
		}
		else if(b==1)
		{
			System.out.print("False");
		}
		s.close();
	}

}

class Happy
{
	public int check(int n)
	{
		int b=1;
		HashSet<Integer> set = new HashSet<>();
		while((n!=1) && (!set.contains(n)))
		{
			set.add(n);
			n = get(n);
		}
		if(n==1)
		{
			b=0;
		}
		return b;
	}
	public int get(int n)
	{
		int s = 0,d;
		while(n>0)
		{
			d = n%10;
			s += d * d;
			n /= 10;
		}
		return s;
	}
}




/*
The Output is

Enter the Number N to check if it is Happy or Not : 19

The Number 19 is Happy : True
*/
