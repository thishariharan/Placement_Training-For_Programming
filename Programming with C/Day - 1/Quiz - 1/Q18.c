#include <stdio.h>
int main()
{
	int i=-2;
	i = i+i*i++;
	printf("%d",i);
	return 0;
}



/*
Output is  

1
*/
