package All_Programs;

import java.util.Scanner;

public class Program_2_Medium {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the N value of Array : ");
		int n = s.nextInt();
		System.out.print("Enter Values\n");
		int i,j,c,k,p=1;
		int[] ar = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}
		//int n=3,i,j,k,c,p=1;
		for(i=n;i>=1;i--)
		{
			p *= i;
		}
		//int[] ar = {1,4,3};
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		int[][] ans = new int[p][n];
		k=n-1;
		for(i=0;i<p;i++)
		{
			for(j=0;j<n;j++)
			{
				ans[i][j] = ar[j];
			}
			while(k>0)
			{
				c = ar[k];
				ar[k] = ar[k-1];
				ar[k-1] = c;
				k--;
				if(k==0)
				{
					k = n-1;
				}
				break;
			}
		}
		System.out.print("\n\nThe Resultant Array : ");
		for(i=0;i<p;i++)
		{
			if(i%5 == 0)
			{
				System.out.print("\n");				
			}
			System.out.print(" [");
			for(j=0;j<n;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.print("] ");
		}
		s.close();
	}

}




/*
 The Output is
 
Enter the N value of Array : 3
Enter Values
Value 1 : 1
Value 2 : 4
Value 3 : 3

The Array :  1  4  3 

The Resultant Array : 
 [1 4 3 ]  [1 3 4 ]  [3 1 4 ]  [3 4 1 ]  [4 3 1 ] 
 [4 1 3 ] 
 */
