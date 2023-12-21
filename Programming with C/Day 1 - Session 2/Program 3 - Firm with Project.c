#include<stdio.h>

int main()
{
	int h,d,w;
	double trd,wrd,wrh,ovt=2.0,rem;
	//Work per day per worker - 8 and Overtime - 2 hrs
	printf("Enter the Number of Workers at the Firm : ");
	scanf("%d",&w);
	printf("\nEnter the Number of Days for the Project : ");
	scanf("%d",&d);
	printf("\nEnter the Number of Hours needed for the Work : ");
	scanf("%d",&h);
	trd = d/10;
	wrd = d - trd;
	wrh = wrd * 8 * w;
	if(wrh > h)
	{
		rem = wrh - h;
		printf("\nYes! %d hours left.\n",(int)rem);
	}
	else if(h > wrh)
	{
		double ext = w * wrd * 2;
		wrh = wrh + ext;
		if(wrh > h)
		{
			rem = wrh - h;
			printf("\nYes! %d hours left.\n",(int)rem);
		}
		else if(h > wrh)
		{
			rem = h - wrh;
			printf("Not enough time! %d hours needed.\n", (int)rem);
		}
	}
	return 0;
}





/*
The Output is

Enter the Number of Workers at the Firm : 5

Enter the Number of Days for the Project : 10

Enter the Number of Hours needed for the Work : 500
Not enough time! 50 hours needed.
*/
