#include<stdio.h>

int main()
{
	int r,c,i,j;
	int array[20][20];
	printf("Enter the Row of the Matrix : ");
	scanf("%d",&r);
	printf("Enter the Column of the Matrix : ");
	scanf("%d",&c);
	printf("\nEnter the Values for the Matrix,\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("Value at Position ( %d , %d ) : ",i+1,j+1);
			scanf("%d",&array[i][j]);
		}
	}
	printf("\nThe Matrix is as,");
	for(i=0;i<r;i++)
	{
		printf("\n");
		for(j=0;j<c;j++)
		{
			printf(" %d ",array[i][j]);
		}
	}
	return 0;	
}




/*
The Output is

Enter the Row of the Matrix : 3
Enter the Column of the Matrix : 3

Enter the Values for the Matrix,
Value at Position ( 1 , 1 ) : 1
Value at Position ( 1 , 2 ) : 2
Value at Position ( 1 , 3 ) : 3
Value at Position ( 2 , 1 ) : 4
Value at Position ( 2 , 2 ) : 5
Value at Position ( 2 , 3 ) : 6
Value at Position ( 3 , 1 ) : 7
Value at Position ( 3 , 2 ) : 8
Value at Position ( 3 , 3 ) : 9

The Matrix is as,
 1  2  3
 4  5  6
 7  8  9
*/
