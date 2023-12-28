package All_Programs;

import java.util.Scanner;

public class Program_2_Find_Unique {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		Finder f = new Finder();
		f.creater(s,n);
		f.sort();
		f.unique();
		s.close();
	}
}

class Finder
{
	int[] ar = new int[50];
	int[] ar2 = new int[50];
	int i,n,j,c;
	//int[] ar = {22,88,77,89,22, 89,77};
	//int i,j,n=7,c;
	public void creater(Scanner s,int a)
	{
		n = a;
		System.out.print("Enter Values\n");
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}	
		disp(ar,n);
	}
	public void disp(int a[],int s)
	{
		System.out.print("\nThe Array : ");
		for(i=0;i<s;i++)
		{
			System.out.print(" "+a[i]+" ");
		}
	}
	public void sort()
	{
		int t;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(ar[i] > ar[j])
				{
					t = ar[j];
					ar[j] = ar[i];
					ar[i] = t;
				}
			}
		}
		System.out.print("\n\nAfter Sorting,");
		disp(ar,n);
	}
	public void unique()
	{
		i=0;
		c=0;
		while(i<n)
		{
			int t=0;
			for(j=i;j<n;j++)
			{
				if(ar[i] == ar[j])
				{
					t++;
				}
				else if(ar[i] != ar[j+1])
				{
					break;
				}
			}
			ar2[c] = ar[i];
			i += t;
			c++;
		}
		System.out.print("\n\nThere are "+c+" Unique values in the Array");
		disp(ar2,c);
	}
}






/*
The Output is

Enter the Size of Array : 7
Enter Values
Value 1 : 88
Value 2 : 77
Value 3 : 22
Value 4 : 89
Value 5 : 77
Value 6 : 22
Value 7 : 89

The Array :  88  77  22  89  77  22  89 

After Sorting,
The Array :  22  22  77  77  88  89  89 

There are 4 Unique values in the Array
The Array :  22  77  88  89 
*/