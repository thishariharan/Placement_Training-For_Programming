#include<stdio.h>

int det(int a[20],int n,int *v1,int *v2,int x);

int main()
{
	int i,n,x,ar[20],v1,v2,f=0;
	printf("Enter the N value of Array : ");
	scanf("%d",&n);
	printf("Enter Values\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&ar[i]);
	}
	printf("Enter the Sum value X : ");
	scanf("%d",&x);
	printf("\nThe Array : ");
	f = det(ar,n,&v1,&v2,x);
	if(f == 1)
	{
		printf("\n\nValue at Index %d is %d\nValue at Index %d is %d\nThe Sum of %d and %d is %d",v1,ar[v1],v2,ar[v2],ar[v1],ar[v2],ar[v1]+ar[v2]);
	}
	else
	{
		printf("\n\nValue X - %d cannot be matched with the sum of any of the two values from the array.",x);
	}
	return 0;
}

int det(int a[20],int n,int *v1,int *v2,int x)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		printf(" %d ",a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(x == (a[i]+a[j]))
			{
				*v1 = i;
				*v2 = j;
				return 1;
				break;
			}
		}
	}
}





/*
The Output is

Enter the N value of Array : 6
Enter Values
Value 1 : 1
Value 2 : 4
Value 3 : 45
Value 4 : 6
Value 5 : 10
Value 6 : 8
Enter the Sum value X : 16

The Array :  1  4  45  6  10  8

Value at Index 3 is 6
Value at Index 4 is 10
The Sum of 6 and 10 is 16
*/
