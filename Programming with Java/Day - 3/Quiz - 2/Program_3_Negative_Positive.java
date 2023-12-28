package All_Programs;

import java.util.Scanner;

public class Program_3_Negative_Positive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		Sorter c = new Sorter(s,n);
		//Sorter c = new Sorter();
		c.rearranger();
		s.close();
	}

}

class Sorter
{
	int[] ar = new int[50];
	int n,i,t=0;
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
		disp(ar);
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
		t=0;
		negarange();
		posarange();
		System.out.print("\n\nRearranged as Negative to Positive\n");
		disp(ar2);
	}
	public void negarange()
	{
		for(i=0;i<n;i++)
		{
			if(ar[i]<0)
			{
				ar2[t] = ar[i];
				t++;
			}
		}
		posarange();
	}
	public void posarange()
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

Rearranged as Negative to Positive

The Array :  -12  -13  -5  -7  -3  -6  11  6  5 
*/
