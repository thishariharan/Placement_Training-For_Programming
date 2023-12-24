#include<stdio.h>

int main()
{
	int n,ar[20],i;
	printf("Enter the N value of Array : ");
	scanf("%d",&n);
	printf("Enter Values\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&ar[i]);
	}
	printf("\nThe Array : ");
	int sm;
	sm = fmk(ar,n,2);
	printf("\nThe Second Largest value of the Array : %d",sm);
	return 0;
}

int fmk(int a[20],int n,int s)
{
	int m,i,j;
	for(i=0;i<n;i++)
	{
		printf(" %d ",a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(a[i] < a[j])
			{
				m = a[i];
				a[i] = a[j];
				a[j] = m;
			}
		}
	}
	return a[n-s];
}




/*
The Output is

Enter the N value of Array : 6
Enter Values
Value 1 : 12
Value 2 : 35
Value 3 : 1
Value 4 : 10
Value 5 : 34
Value 6 : 1

The Array :  12  35  1  10  34  1
The Second Largest value of the Array : 34
*/
