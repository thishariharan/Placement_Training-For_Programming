package All_Programs;

import java.util.Scanner;

public class Program_1_Easy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the N value of Array : ");
		int n = s.nextInt();
		System.out.print("Enter Values\n");
		int i,j,c;
		int[] ar = new int[n];
		int[] ans = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			c=1;
			for(j=0;j<n;j++)
			{
				if(i != j)
				{
					c *= ar[j];
				}
			}
			ans[i] = c;
		}
		System.out.print("\n\nThe Resultant Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ans[i]+" ");
		}
		s.close();
	}

}





/*
The Output is

Enter the N value of Array : 4
Enter Values
Value 1 : 1
Value 2 : 2
Value 3 : 3
Value 4 : 4

The Array :  1  2  3  4 

The Resultant Array :  24  12  8  6 
*/