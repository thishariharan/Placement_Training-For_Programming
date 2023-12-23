#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
	char a[50],b[50],flag[10],sa[50],sb[50];
	strcpy(flag,"False");
	printf("Enter the String A : ");
	scanf("%s",a);
	printf("Enter the String B : ");
	scanf("%s",b);
	int i,j,l1,l2,c=0;
	l1 = strlen(a);
	l2 = strlen(b);
	strcpy(sa,a);
	strcpy(sb,b);
	sort(sa,l1);
	sort(sb,l2);
	if(l1 == l2)
	{
		strcpy(sa,a);
		strcpy(sb,b);
		sort(sa,l1);
		sort(sb,l2);
		for(i=0;i<l1;i++)
		{
				if(sa[i] == sb[i])
				{
					c++;
				}
		}
		if(c == l1)
		{
			strcpy(flag,"True");			
		}
	}
	printf("\nThe Given Strings '%s' and '%s' are Anagram : %s",a,b,flag);
	return 0;
}

int sort(char a[50], int n)
{
	int i,j;
	char t;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i] = tolower(a[i]);
			if(a[i] < a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	}
}




/*
The Output is

Enter the String A : Anagram
Enter the String B : Nagaram

The Given Strings 'Anagram' and 'Nagaram' are Anagram : True
*/

