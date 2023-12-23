#include<stdio.h>

int main()
{
	int n,v[20],i,tot=0,nv[20],l,t;
	printf("Enter the N value for the INT Array : ");
	scanf("%d",&n);
	printf("\nEnter the Values\n");
	for(i=0;i<n;i++)
	{
		tot = tot*10;
		printf("Value %d : ",i+1);
		scanf("%d",&v[i]);
		tot = tot + v[i];
	}
	tot++;
	l=0;
	t = tot;
	while(t != 0)
	{
		l++;
		t /= 10;
	}
	printf("\nBefore Increment\n");
	prta(n,v);
	for(i=l-1;i>=0;i--)
	{
		nv[i] = tot % 10;
		tot = tot / 10;		
	}
	printf("\nAfter Increment\n");
	prta(l,nv);
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

Enter the N value for the INT Array : 3

Enter the Values
Value 1 : 9
Value 2 : 9
Value 3 : 9

Before Increment
 9   9   9
After Increment
 1   0   0   0
 */
