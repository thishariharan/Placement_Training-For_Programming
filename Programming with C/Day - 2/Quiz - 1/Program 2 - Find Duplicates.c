#include<stdio.h>
int main()
{
	int n,array[50],i;
	printf("Enter the Size of the Array : ");
	scanf("%d",&n);
	printf("\nEnter the values in the Array,\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&array[i]);
	}
	sort(array,n);
	return 0;
}

int sort(int a[50],int n)
{
	int i,j,t;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
	}
	printf("\nAfter Sort : ");
	for(i=0;i<n;i++)
	{
		printf(" %d",a[i]);
	}
	check(a,n);
	return 0;
}

int check(int a[50],int n)
{
	int i,t,j;
	printf("\n\nThe Duplicate Values are \n");
	for(i=0;i<n;i++)
	{
		t=0;
		for(j=i;j<=n;j++)
		{
			if(a[i]==a[j])
			{
				t++;
			}
			else if(t>1)
			{
					printf("%d - > %d\n",a[i],t);
					j=n;
					i=i+t-1;
			}
		}
	}
	return 0;
}




/*
The Output is

Enter the Size of the Array : 12

Enter the values in the Array,
Value 1 : 2
Value 2 : 5
Value 3 : 9
Value 4 : 1
Value 5 : 9
Value 6 : 4
Value 7 : 1
Value 8 : 4
Value 9 : 1
Value 10 : 4
Value 11 : 6
Value 12 : 4

After Sort :  1 1 1 2 4 4 4 4 5 6 9 9

The Duplicate Values are
1 - > 3
4 - > 4
9 - > 2

*/
