package All_Programs;

import java.util.Scanner;

public class Program_3_Negative_Positive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		Sorter c = new Sorter(s,n);
		//Sorter c = new Sorter();
		c.disper(1);
		c.rearranger();
		s.close();
	}

}

class Sorter
{
	int[] ar = new int[50];
	int n,i;
	//int n=9,i;
	//int[] ar = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
	int[] ar2 = new int[50];
	public Sorter(Scanner s,int a)
	{	
		n=a;
		System.out.print("Enter Values\n");
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}	
	}
	public void disper(int a)
	{
		if(a==1)
		{
			disp(ar);
		}
		else if(a==2)
		{
			disp(ar2);
		}
	}
	public void disp(int a[])
	{
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]+" ");
		}
	}
	public void rearranger()
	{
		negarange();
		System.out.print("\n\nRearranged as Negative to Positve\n");
		disp(ar2);
	}
	public void negarange()
	{
		int t=0;
		for(i=0;i<n;i++)
		{
			if(ar[i]<0)
			{
				ar2[t] = ar[i];
				t++;
			}
		}
		posarange(t);
	}
	public void posarange(int t)
	{
		for(i=0;i<n;i++)
		{
			if(ar[i]>0)
			{
				ar2[t] = ar[i];
				t++;
			}
		}		
	}
}





/*
The Output is

Enter the Size of Array : 9
Enter Values
Value 1 : -12
Value 2 : 11
Value 3 : -13
Value 4 : -5
Value 5 : 6
Value 6 : -7
Value 7 : 5
Value 8 : -3
Value 9 : -6

The Array :  -12  11  -13  -5  6  -7  5  -3  -6 

Rearranged as Negative to Positve

The Array :  -12  -13  -5  -7  -3  -6  11  6  5 
*/
