#include<stdio.h>
int main()
{
	int ds,year,week,days,y=365;
	printf("Enter the Total Number of Years : ");
	scanf("%d",&ds);
	year = ds/y;
	days = ds%y;
	week = days/7;
	days = days%7;
	printf("\nNumber of Years : %d",year);
	printf("\nNumber of Weeks : %d",week);
	printf("\nNumber of Days : %d",days);
	return 0;
}




/*
The Output is

Enter the Total Number of Years : 500

Number of Years : 1
Number of Weeks : 19
Number of Days : 2
*/
