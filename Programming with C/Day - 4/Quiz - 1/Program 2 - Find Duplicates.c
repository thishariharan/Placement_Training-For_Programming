#include<stdio.h>

int fdup(int *c,int a[20], int d[20],int n);
int sort(int d[20],int c);

int main()
{
	int n,i;
	int arr[20],dup[20];
	int c = -1;
	printf("Enter the N value of the Array : ");
	scanf("%d",&n);
	printf("\nEnter Values\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&arr[i]);
	}
	printf("\nThe Array : ");
	fdup(&c,arr,dup,n);
	if(c == -1)
	{
		printf("\n\n-1, There is no Duplicates.");
	}
	else if(c > -1)
	{
		sort(dup,c);
		printf("\n\nThere are %d Duplicates : ",c+1);
		for(i=0;i<=c;i++)
		{
			printf(" %d ",dup[i]);
		}
	}
	return 0;
}

int fdup(int *c,int a[20], int d[20],int n)
{
	int i,j,x,k;
	for(i=0;i<n;i++)
	{
		printf(" %d ",a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i] == a[j])
			{
				(*c)++;
				for(k=0;k<=*c;k++)
				{
					if(d[k] == a[i])
					{
						(*c)--;
						break;
					}
					else if((k==*c) && (d[k]!=a[i]))
					{
						d[*c] = a[i];
					}
				}				
			}
		}
	}
	return 0;
}

int sort(int d[20],int c)
{
	int i,j,t;
	for(i=0;i<=c;i++)
	{
		for(j=0;j<=c;j++)
		{
			if(d[i] < d[j])
			{
				t = d[i];
				d[i] = d[j];
				d[j] = t;
			}
		}
	}
}


/*
The Output is

Enter the N value of the Array : 10

Enter Values
Value 1 : 2
Value 2 : 4
Value 3 : 3
Value 4 : 2
Value 5 : 5
Value 6 : 4
Value 7 : 7
Value 8 : 7
Value 9 : 9
Value 10 : 3

The Array :  2  4  3  2  5  4  7  7  9  3

There are 4 Duplicates :  2  3  4  7
*/

