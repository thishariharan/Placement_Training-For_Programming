package Programs;

import java.util.Scanner;

public class Program_3_String_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern p = new Pattern();
		p.get(s);
		s.close();
	}
}

class Pattern
{
	public int get(Scanner s)
	{
		System.out.print("Enter the String or Sentence with no Spaces : ");
		String str = s.nextLine();
		boolean b = str.contains(" ");
		if(b)
		{
			System.out.print("The String should not have any Spaces.\n\n");
			return get(s);
		}
		else
		{
			String star = str.toLowerCase();
			char[] ar = star.toCharArray();
			int n = ar.length;
			System.out.print("\nThe String is "+star+"\nThe Size of String is "+n+"\n\nThe Pattern is as\n\n");
			ptrn(n,ar);
		}
		return 0;
	}
	public void ptrn(int n,char[] ar)
	{
		int a = (n / 3)-1,i,j,k;
		int z = n - a - 1;
		int b = (z / 2)+1;
		for(i=0;i<b;i++)
		{
			System.out.print(" "+ar[i]);
		}
		j=b;
		i=a+b;
		while(j<i)
		{
			System.out.print("\n");
			for(k=0;k<=a;k++)
			{
				if(k == a)
				{
					System.out.print(" "+ar[j]);
					a--;
					j++;
					break;
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
		System.out.print("\n");
		for(i=j;i<n;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
}





/*
The Output is

Enter the String or Sentence with no Spaces : zohocorporationteam

The String is zohocorporationteam
The Size of String is 19

The Pattern is as

 z o h o c o r
           p
         o
       r
     a
   t
 i o n t e a m
*/