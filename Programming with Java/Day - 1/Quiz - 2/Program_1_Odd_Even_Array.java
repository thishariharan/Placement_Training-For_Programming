package Programs;

import java.util.Scanner;

public class Program_1_Odd_Even_Array {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the N Value of the Array : ");
		int n = a.nextInt();
		int i,o=0,e=0;
		int[] ar = new int[n];
		int[] odd = new int[n];
		int[] even = new int[n];
		System.out.print("Enter Values\n");
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = a.nextInt();
		}
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			if(ar[i] % 2 == 0)
			{
				even[e] = ar[i];
				e++;
			}
			else
			{
				odd[o] = ar[i];
				o++;
				
			}
		}
		System.out.print("\n\nThe Odd : ");
		for(i=0;i<o;i++)
		{
			System.out.print(" "+odd[i]+" ");
		}
		System.out.print("\nThe Even : ");
		for(i=0;i<e;i++)
		{
			System.out.print(" "+even[i]+" ");
		}
		a.close();
	}
}





/*
The Output is

Enter the N Value of the Array : 6
Enter Values
Value 1 : 10
Value 2 : 3
Value 3 : 5
Value 4 : 12
Value 5 : 17
Value 6 : 22

The Array :  10  3  5  12  17  22 

The Odd :  3  5  17 
The Even :  10  12  22 
*/

