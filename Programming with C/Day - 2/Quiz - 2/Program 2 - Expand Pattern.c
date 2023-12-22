#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
	char st[50],mod[100],t;
	int i=0,j,l,n,f=0;
	printf("Enter the Patter to be Expanded : ");
	scanf("%s",&st);
	l = strlen(st);
		for(j=0;j<l;j++)
		{
			if(isalpha(st[j]))
			{
				t = st[j];
				n = 0;
			}
			else if(isdigit(st[j]))
			{
				n = n*10;
				n = n + (st[j]-'0');
				if(!isdigit(st[j+1]))
				{
					f = i+n;
					for(i;i<f;i++)
					{
						mod[i] = t;
					}
				}
			}
	}
	printf("\nThe Expanded Form : ");
	for(i=0;i<f;i++)
	{
		printf("%c",mod[i]);
	}
	return 0;
}



/*
The Output is

Enter the Patter to be Expanded : b3c6d15

The Expanded Form : bbbccccccddddddddddddddd
*/
