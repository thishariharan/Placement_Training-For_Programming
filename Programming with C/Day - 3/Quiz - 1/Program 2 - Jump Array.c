#include<stdio.h>

int main()
{
	int n,ar[20],i,t;
	char flag[10];
	printf("Enter the N Value for the Array : ");
	scanf("%d",&n);
	printf("\nEnter the Values to the Array\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&ar[i]);
	}
	printf("\nThe Actual Array : ");
	prta(n,ar);
	i=0;
	while(i<n)
	{
		t = ar[i];
		i = i + t;
		//printf(" (%d) (%d) ",t,i);
		if(i == n-1)
		{
			strcpy(flag,"True");
			break;
		}
		if(ar[i] == 0)
		{
			break;
		}
	}
	if(i != n-1)
	{		
		strcpy(flag,"False");
	}
	printf("\nUsing the Array values could we reach Last Index ( True / False ) : %s",flag);
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

Enter the N Value for the Array : 5

Enter the Values to the Array
Value 1 : 3
Value 2 : 2
Value 3 : 1
Value 4 : 0
Value 5 : 4

The Actual Array :  3   2   1   0   4
Using the Array values could we reach Last Index ( True / False ) : False
*/
