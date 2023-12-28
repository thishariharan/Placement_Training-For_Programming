package Programs;

import java.util.Scanner;

public class Program_3_PalPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		int i;
		System.out.print("Enter Values\n");
		int[] ar = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}
		//int i,n=5;
		//int[] ar = {1,34543,565,727,10099};
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		String str="";
		System.out.print("\n\nThe Result");
		for(i=0;i<n;i++)
		{
			new PalPrime(ar[i],str);			
		}
		s.close();
	}
}

class PalPrime
{
	int f=0;
	public PalPrime(int a, String s)
	{
		f=0;
		Pal(a);
		Prime(a);
		if(f==2)
		{
			s += "PalPrime";
		}
		else
		{
			s += "Not PalPrime";
		}
		System.out.print("\nValue : "+a+" - "+s);		
	}
	public void Pal(int a)
	{
		int i,r=0;		
		if(a>=1)
		{					
			for(i=a;i>0;i/=10)		
			{
				r*=10;
				r += i%10;			
			}
			if(r == a)
			{
				f++;
			}
		}		
	}
	public void Prime(int a)
	{
		int i,fl=0;
		if(a>1)
		{
			for(i=2;i<= Math.sqrt(a);i++)
			{
				if(a%i == 0)
				{
					fl++;
				}
			}			
		}
		else
		{
			fl++;
		}
		if(fl == 0)
		{
			f++;
		}
	}
}






/*
The Output is

Enter the Size of Array : 5
Enter Values
Value 1 : 1
Value 2 : 34543
Value 3 : 565
Value 4 : 727
Value 5 : 10099

The Array :  1  34543  565  727  10099 

The Result
Value : 1 - Not PalPrime
Value : 34543 - PalPrime
Value : 565 - Not PalPrime
Value : 727 - PalPrime
Value : 10099 - Not PalPrime
*/