#include<stdio.h>
int main()
{
	int x,y,z;
	printf("Enter the Values of X,Y,Z\n");
	scanf("%d %d %d",&x,&y,&z);
	if(x!=y && x!=z && y!=z)
	{
		int midv = mid(x,y,z);
		printf("\nThe Middle Value is %d",midv);
	}
	else
	{		
		printf("All the 3 Values must be Different from one another!");
	}
	return 0;
}

int mid(int x,int y,int z)
{
	if((x>y && x<z) || (x>z && x<y))
	{
		return 1;
	}
	else if((y>x && y<z) || (y>z && y<x))
	{
		return 2;
	}
	else if((z>x && z<y) || (z>y && z<x))
	{
		return 3;
	}
}





/*
The Output is

Enter the Values of X,Y,Z
5
2
7

The Middle Value is 1
*/
