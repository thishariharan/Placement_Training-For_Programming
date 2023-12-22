#include<stdio.h>

int main()
{
	int n,i,j,o=1,e=2,t;
	printf("Enter the N value of Matrix : ");
	scanf("%d",&n);
	printf("\nThe Matrix is");
	t=n+1;
	for(i=1;i<=n;i++)
	{
		printf("\n\t");
		t--;
		for(j=1;j<=n;j++)
		{
			if(j>=t)
			{
				if(i%2 == 0)
				{
					printf(" %d ",e);
					e = e+2;					
				}
				else if(i%2 != 0)
				{
					printf(" %d ",o);
					o = o+2;					
				}
			}
			else if(j<t)
			{
				printf(" - ");
			}
		}
	}
	return 0;
}





/*
The Output is

Enter the N value of Matrix : 5

The Matrix is
         -  -  -  -  1
         -  -  -  2  4
         -  -  3  5  7
         -  6  8  10  12
         9  11  13  15  17
*/
