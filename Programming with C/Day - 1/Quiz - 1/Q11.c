#include <stdio.h>
void main()
{
	int a,b=5,c;
	a=5*(b++);
	c = 5*(++b);
	printf("%d %d",a,c);
}



/*
Output is  

25 35
*/
