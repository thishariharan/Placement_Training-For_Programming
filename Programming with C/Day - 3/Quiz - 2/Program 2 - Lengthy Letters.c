#include<stdio.h>

int main()
{
	int n,i,j,c,l=0;
	char strs[20][20],temp[20];
	printf("Enter the N values of String Array : ");
	scanf("%d",&n);
	printf("\nEnter the Strings\n");
	for(i=0;i<n;i++)
	{
		printf("String %d : ",i+1);
		scanf("%s",strs[i]);
	}
	printf("\nStrings in the Array\n");
	for(i=0;i<n;i++)
	{
		printf("  %s  ",strs[i]);
	}
	int l1,k;
		i = 0;
		l1 = strlen(strs[i]);
		for(j=0;j<l1;j++)
		{
			c = 1;	
			for(k=1;k<n;k++)
			{
				if(strs[i][j] == strs[k][j])
				{
					c++;
				}
			}
			if(c == n)
			{
				temp[l] = strs[i][j];
				l++;					
			}
		}
	printf("\n\nThe Longest Common prefix : '");
	for(i=0;i<l;i++)
	{
		printf("%c",temp[i]);
	}
	printf("'");
	return 0;
}



/*
The Output is

Enter the N values of String Array : 3

Enter the Strings
String 1 : dog
String 2 : car
String 3 : bark

Strings in the Array
  dog    car    bark

The Longest Common prefix : ''
*/
