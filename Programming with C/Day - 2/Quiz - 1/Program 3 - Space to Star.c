#include<stdio.h>
#include<string.h>
int main()
{
	char sen[50],mod[50];
	int len,l,n=0,c=0,i,j,f,fi;
	printf("Enter the Sentence to be Transformed : ");
	scanf("%[^\n]",sen);
	printf("Enter the Length it has to be : ");
	scanf("%d",&len);
	l = strlen(sen);
	for(i=0;i<l;i++)
	{
		if(sen[i]==' ')
		{
			c++;
		}
	}
	n=len-l+c;
	i=0;
	while(i<len)
	{
		for(j=0;j<l;j++)
		{
			if(sen[j]!=' ')
			{
				mod[i]=sen[j];
				i++;
			}
			else if(sen[j]==' ')
			{
				f=n/c;
				c--;
				n=n-f;
				for(fi=i;fi<i+f;fi++)
				{
					mod[fi]='*';
				}
				i=i+f;
			}
		}
	}
	if(strlen(mod)==len)
	{
		printf("\nAfter Transformation : %s",mod);
	}
	return 0;
}



/*
The Output is

Enter the Sentence to be Transformed : Welcome to Zoho Corporation
Enter the Length it has to be : 36

After Transformation : Welcome****to****Zoho****Corporation
*/
