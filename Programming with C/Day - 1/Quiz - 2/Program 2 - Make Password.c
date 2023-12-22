#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
	getp();	
	return 0;
}

int getp()
{
	char p[25];
	printf("\nPlease enter a Newer and Stronger Password : ");
	scanf("%s", p);
	checkp(p);
	return 0;
}

int checkp(char p[25])
{
	int n = strlen(p),i;
	int l=0,u=0,d=0,s=0;
	if(n>=8)
	{
		for(i=0;i<n;i++)
		{
			if(islower(p[i]))
			{
				l++;
			}
			if(isupper(p[i]))
			{
				u++;
			}
			if(isdigit(p[i]))
			{
				d++;
			}
			if(ispunct(p[i]))
			{
				s++;
			}
		}
		if(l>0 && d>0 && s>0 && u>0)
		{
			printf("\n\nThe Password is really Stronger than we expected.");
		}
		else
		{
			printf("\n\nThe Password must contain Minimum of one Lower Case, Upper Case, Number and Special Character.\nMake a New Password\n");
			getp();
		}
	}
	else
	{
		printf("\nThe Length of the Password must be atleast eight.\nMake a new Password\n");
		getp();
	}
	return 0;
}






/*
The Output is


Please enter a Newer and Stronger Password : 1234

The Length of the Password must be atleast eight.
Make a new Password

Please enter a Newer and Stronger Password : 12345678


The Password must contain Minimum of one Lower Case, Upper Case, Number and Special Character.
Make a New Password

Please enter a Newer and Stronger Password : 1234ab@cd


The Password must contain Minimum of one Lower Case, Upper Case, Number and Special Character.
Make a New Password

Please enter a Newer and Stronger Password : 1234@ABcd


The Password is really Stronger than we expected.
*/
