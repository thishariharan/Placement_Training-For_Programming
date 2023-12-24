#include<stdio.h>

int main()
{
	int a,b;
	printf("Enter the Value of A : ");
	scanf("%d",&a);
	printf("Enter the Value of B : ");
	scanf("%d",&b);
	printf("\nCall by Value - Swapping\n");
	printf("Before Swap\nA = %d and B = %d",a,b);
	cbv(a,b);
	printf("\n\nCall by Reference - Swapping\n");
	printf("Before Swap\nA = %d and B = %d",a,b);
	cbr(&a,&b);
	printf("\nAfter Swap\nA = %d and B = %d",a,b);
	return 0;
}

int cbv(int a, int b)
{
	int t = a;
	a = b;
	b = t;
	printf("\nAfter Swap\nA = %d and B = %d",a,b);
}

int cbr(int *a, int *b)
{
	int t = *a;
	*a = *b;
	*b = t;
}




/*
The Output is 

Enter the Value of A : 3
Enter the Value of B : 9

Call by Value - Swapping
Before Swap
A = 3 and B = 9
After Swap
A = 9 and B = 3

Call by Reference - Swapping
Before Swap
A = 3 and B = 9
After Swap
A = 9 and B = 3
*/
