#include <stdio.h>
#include <math.h>
int main()
{
	int n,i;
	double x,r=0.0;
	printf("Enter the Degree of Polynomial : ");
	scanf("%d",&n);
	double cfs[n+1];
	for(i=0;i<=n;i++)
	{
		printf("\nEnter Coefficient %d : ",i+1);
		scanf("%lf",&cfs[i]);
	}
	printf("\nEnter the Value of X : ");
	scanf("%lf",&x);
	for(i=0;i<=n;i++)
	{
			r += cfs[i] * pow(x,i);
	}
	printf("\nP(%lf) = %lf",x,r);
	return 0;
}




/*
The Output is

Enter the Degree of Polynomial : 3

Enter Coefficient 1 : 2

Enter Coefficient 2 : -1

Enter Coefficient 3 : 3

Enter Coefficient 4 : 4

Enter the Value of X : 2

P(2.000000) = 44.000000
*/
