#include <stdio.h>
void main()
{
	int p,q,r,s;
	p=1;
	q=2;
	r=p,q;
	s=(p,q);
	printf("p=%d q=%d",p,q);
}



/*
Output is  

p=1 q=2
*/
