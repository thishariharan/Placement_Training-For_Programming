#include<stdio.h>
#include<ctype.h>
#include<math.h>
#include<string.h>
int main()
{
	char s,shape[10];
	float size,area;
	printf("Calculate Area of Square or Circle\n\nEnter the Size of the Shape : ");
	scanf("%f",&size);
	printf("\nEnter S for Square or C for Circle : ");
	scanf(" %c",&s);
	//char n = tolower(s);
	if(s=='s' || s=='S')
	{
		strcpy(shape,"Square");
		area = size * size;
	}
	else if(s=='c' || s=='C')
	{
		strcpy(shape,"Circle");
		area = 3.14 * pow(size,2);
	}
	printf("\nThe Area of the %s is %f.",shape,area);
	return 0;
}



/*
The Output is

Calculate Area of Square or Circle

Enter the Size of the Shape : 4

Enter S for Square or C for Circle : c

The Area of the Circle is 50.240002.
*/
