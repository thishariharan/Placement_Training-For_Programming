package Programs;

import java.util.Scanner;

public class Program_2_String_Compression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String for Compression : ");
		String str = s.next();
		str = str.toUpperCase();
		System.out.print("\nThe String before Compression : "+str);
		char[] ar = str.toCharArray();
		int n = ar.length,i=0,j,c;
		String star = "";
		while(i<n)
		{
			star += ar[i];
			c = 1;
			for(j=i+1;j<n;j++)
			{
				if(ar[i] == ar[j])
				{
					c++;
				}
				if(ar[i] != ar[j])
				{
					break;					
				}
				if(j>=n)
				{
					break;
				}
			}
			if(c>1)
			{
				star += c;
			}
			i += c;
		}
		System.out.print("\nThe String after Compression : "+star);
		s.close();
	}

}




/*
The Output is

Enter the String for Compression : AAABBCCCDE

The String before Compression : AAABBCCCDE
The String after Compression : A3B2C3DE
*/