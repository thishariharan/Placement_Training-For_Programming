package Programs;

import java.util.Scanner;

public class Program_2_Array_Partition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		System.out.print("Enter Values\n");
		int i,p,j;
		int[] ar = new int[n];
		int[][] arp = new int[n][n];
		for(i=0;i<n;i++)
		{
			System.out.print("Value "+(i+1)+" : ");
			ar[i] = s.nextInt();
		}
		//int i,n=5,p=2,j;
		//int[] ar = {1,2,3,4,5};
		//int[][] arp = new int[n][n];
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		System.out.print("\n\nEnter the Partition Size of Array : ");
		p = s.nextInt();
		i=0;
		int pos=1,k,f=0;
		//System.out.print("\n\n");
		while(f==0)
		{
			k=0;
			for(j=i;j<i+p;j++)
			{
				if(j>=n)
				{
					f++;
					break;
				}
				arp[pos][k] = ar[j];
				k++;
			}
			pos++;
			i += p;
		}
		pos--;
		System.out.print("Partitioning of Array is done\n");
		System.out.print("\nEnter the order of Partition : ");
		String str = s.next();
		char[] star = str.toCharArray();
		int l = star.length;
		int d;
		if(l<=pos)
		{
			System.out.print("The Result\n");
			for(i=0;i<l;i++)
			{
				d = Character.getNumericValue(star[i]);
				for(j=0;j<p;j++)
				{
					if(arp[d][j]>0)
					{
						System.out.print(" "+arp[d][j]+" ");						
					}
					else
					{
						continue;
					}
				}
			}			
		}
		s.close();
	}

}





/*
The Output is

Enter the Size of Array : 5
Enter Values
Value 1 : 1
Value 2 : 2
Value 3 : 3
Value 4 : 4
Value 5 : 5

The Array :  1  2  3  4  5 

Enter the Partition Size of Array : 2
Partitioning of Array is done

Enter the order of Partition : 321
The Result
 5  3  4  1  2 
 */
