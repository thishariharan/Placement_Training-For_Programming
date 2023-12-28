package All_Programs;

import java.util.Scanner;

public class Program_3_Hard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the N value of Array : ");
		int n = s.nextInt();
		int i;
		System.out.print("Enter Strings\n");
		String[] ar = new String[n];
		for(i=0;i<n;i++)
		{
			System.out.print("String "+(i+1)+" : ");
			ar[i] = s.next();
		}
		//int i,n=8;
		//String[] ar = {"mat","mate","matbellmates","bell","bellmatesbell","butterribbon","butter","ribbon"};
		System.out.print("\nThe Array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+ar[i]+" ");
		}
		//Clubbing c = new Clubbing();
		String[] club = new String[n];
		int j,k=0,c=0;
		//int[] unclub = new int[n];
		//System.out.print("\n\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((i!=j) && (ar[j].contains(ar[i])))
				{
					for(k=0;k<=c;k++)
					{
						if(club[k] == ar[j])
						{
							break;							
						}
						else if(k==c)
						{
							club[c] = ar[j];
							c++;
							break;
						}
					}
				}
			}
		}
		System.out.print("\n\nClubbed Elements : ");
		for(i=0;i<c;i++)
		{
			System.out.print(" "+club[i]+" ");			
		}
		s.close();
	}
}





/*
The Output is

Enter the N value of Array : 8
Enter Strings
String 1 : mat
String 2 : mate
String 3 : matbellmates
String 4 : bell
String 5 : bellmatesbell
String 6 : butterribbon
String 7 : butter
String 8 : ribbon

The Array :  mat  mate  matbellmates  bell  bellmatesbell  butterribbon  butter  ribbon 

Clubbed Elements :  mate  matbellmates  bellmatesbell  butterribbon 
*/