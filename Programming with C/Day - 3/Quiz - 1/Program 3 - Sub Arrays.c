#include<stdio.h>

int main()
{
	int n,arr[20],i;
	printf("Enter the N Value for the Array : ");
	scanf("%d",&n);
	printf("\nEnter the Values to the Array\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&arr[i]);
	}
	printf("\nThe Array : ");
	prta(n,arr);
	int max=arr[0],cur=arr[0],temp=0,st=0,en=0;
	for(i=1;i<n;i++)
	{
		if(arr[i] > arr[i] + cur)
		{
			cur = arr[i];
			temp = i;
		}
		else
		{
			cur += arr[i];
		}
		if(cur > max)
		{
			max = cur;
			st = temp;
			en = i;
		}
	}
	int sum=0;
	printf("\nThe Sub Array : ");
	for(i=st;i<=en;i++)
	{
		printf(" %d ",arr[i]);
		sum += arr[i];
	}
	printf("\nThe Largest Sum from the Sub Array is %d",sum);
	return 0;
}
int prta(int n,int a[20])
{
	int i;
	for(i=0;i<n;i++)
	{
		printf(" %d  ",a[i]);
	}
	return 0;
}




/*
The Output is

Enter the N Value for the Array : 9

Enter the Values to the Array
Value 1 : -2
Value 2 : 1
Value 3 : -3
Value 4 : 4
Value 5 : -1
Value 6 : 2
Value 7 : 1
Value 8 : -5
Value 9 : 4

The Array :  -2   1   -3   4   -1   2   1   -5   4
The Sub Array :  4  -1  2  1
The Largest Sum from the Sub Array is 6
*/
