#include<stdio.h>
int main()
{
	int a,b;
	printf("Enter the Values of A and B:\n");
	scanf("%d %d",&a,&b);
	printf("\nBefore Swap,\nA = %d\nB = %d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nAfter Swap,\nA = %d\nB = %d",a,b);
	return 0;
}




/*
The Output is

Enter the Values of A and B:
4
6

Before Swap,
A = 4
B = 6
After Swap,
A = 6
B = 4
*/
