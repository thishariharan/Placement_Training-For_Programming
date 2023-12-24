#include<stdio.h>

int main()
{	
	int i,n,x,ar[20],v1,v2,f=0;
	printf("Enter the N value of Array : ");
	scanf("%d",&n);
	printf("Enter Values\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&ar[i]);
	}
	printf("Enter the value to be Found : ");
	scanf("%d",&x);
	printf("\nThe Array : ");
	f = occ(ar,n,&v1,&v2,x);
	if(f == 2)
	{
		printf("\n\nThe First Occurance of %d is at Index %d\nThe Last Occurance of %d is at Index %d",ar[v1],v1,ar[v2],v2);
	}
	else
	{
		printf("\n\nThere is no occurance of X - %d is present in the array",x);
	}
	return 0;
}

int occ(int a[20],int n,int *v1,int *v2,int x)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		printf(" %d ",a[i]);
	}
	for(i=0;i<n;i++)
	{
		if(a[i] == x)
		{
			*v1 = i;
			for(j=i;j<n;j++)
			{
				if(a[j+1] != x)
				{
					*v2 = j;
					return 2;
					break;
				}
			}
		}
	}
}






/*
The Output is 

Enter the N value of Array : 9
Enter Values
Value 1 : 1
Value 2 : 3
Value 3 : 5
Value 4 : 5
Value 5 : 5
Value 6 : 5
Value 7 : 67
Value 8 : 123
Value 9 : 125
Enter the value to be Found : 5

The Array :  1  3  5  5  5  5  67  123  125

The First Occurance of 5 is at Index 2
The Last Occurance of 5 is at Index 5
*/
