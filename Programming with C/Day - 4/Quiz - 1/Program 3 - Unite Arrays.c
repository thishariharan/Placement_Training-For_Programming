#include<stdio.h>

int main()
{
	int n,m,a[20],b[20],i,u[40],l=-1;	
	printf("Enter the N value of the Array A : ");
	scanf("%d",&n);
	printf("Enter Values\n");
	for(i=0;i<n;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&a[i]);
	}
	printf("\nEnter the M value of the Array B : ");
	scanf("%d",&m);
	printf("\nEnter Values\n");
	for(i=0;i<m;i++)
	{
		printf("Value %d : ",i+1);
		scanf("%d",&b[i]);
	}
	sort(a,n);
	printf("\nSorted Array A : ");
	disp(a,n);
	sort(b,m);
	printf("\nSorted Array B : ");
	disp(b,m);
	unin(a,n,u,&l);
	unin(b,m,u,&l);
	sort(u,l+1);
	printf("\n\nUnion Array : ");
	disp(u,l+1);
	return 0;
}

int sort(int d[20],int c)
{
	int i,j,t;
	for(i=0;i<c;i++)
	{
		for(j=0;j<c;j++)
		{
			if(d[i] < d[j])
			{
				t = d[i];
				d[i] = d[j];
				d[j] = t;
			}
		}
	}
}

int disp(int d[20],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf(" %d ",d[i]);
	}
}

int unin(int a[20], int n, int u[20], int *l)
{
    int i, j, k;
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j <= n; j++)
        {
            if (a[i] == a[j])
            {
            	int f = 0;
                for (k = 0; k <= *l; k++)
                {
                    if (u[k] == a[i])
                    {
                        f++;
                        break;
                    }
                }
	            if (f == 0)
	            {
	            	(*l)++;
	                u[*l] = a[j];
	            }
            }
            else if(a[i] != a[j])
            {
            	int f = 0;
                for (k = 0; k <= *l; k++)
                {
                    if (u[k] == a[i])
                    {
                        f++;
                        break;
                    }
                }
	            if (f == 0)
	            {
	            	(*l)++;
	                u[*l] = a[i];
	            }
			}
        }
    }
}




/*
The Output is

Enter the N value of the Array A : 5
Enter Values
Value 1 : 2
Value 2 : 2
Value 3 : 3
Value 4 : 4
Value 5 : 5

Enter the M value of the Array B : 5

Enter Values
Value 1 : 1
Value 2 : 1
Value 3 : 2
Value 4 : 3
Value 5 : 4

Sorted Array A :  2  2  3  4  5
Sorted Array B :  1  1  2  3  4

Union Array :  1  2  3  4  5
*/
