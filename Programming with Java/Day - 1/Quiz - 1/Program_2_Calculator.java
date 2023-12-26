package P_1;

import java.util.Scanner;

public class Program_2_Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculator c = new Calculator();
		int o = c.operator(s);
		int a = c.collect(s,"A",o);
		int b = c.collect(s,"B",o);
		c.disp(a, b,o);
		s.close();
	}

}

class Calculator
{
	public int operator(Scanner s)
	{
		System.out.print("Enter the Operator( + , * , - , / ) : ");
		char a = s.next().charAt(0);
		int o=0;
		if(a=='+')
		{
			o = 1;
		}
		else if(a=='-')
		{
			o = 2;
		}
		else if(a=='*')
		{
			o = 3;
		}
		else if(a=='/')
		{
			o = 4;
		}
		else
		{
			System.out.print("Such Operator cannot be used.\n\n");
			operator(s);
		}
		return o;
	}
	public int collect(Scanner s,String n,int o)
	{
		System.out.print("Enter the Value of "+n+" : ");
		int a = s.nextInt();
		if((o==4) && (a==0))
		{
			System.out.print("The Value cannot be 0.\n\n");
			return collect(s,n,o);
		}
		return a;
	}
	public void disp(int a,int b,int o)
	{
		System.out.print("\nA = "+a+"\nB = "+b+"\nThe Result of ");
		double c=0;
		if(o == 1)
		{
			System.out.print("Addition is ");
			c = a+b;
		}
		else if(o == 2)
		{
			System.out.print("Subtraction is ");
			c = a-b;
		}
		else if(o == 3)
		{
			System.out.print("Multiplication is ");
			c = a*b;
		}
		else if(o == 4)
		{
			System.out.print("Division is ");
			c = a/b;
		}
		System.out.print(c);
		
	}
}






/*
 The Output is
 
 Enter the Operator( + , * , - , / ) : *
Enter the Value of A : 5
Enter the Value of B : 6

A = 5
B = 6
The Result of Multiplication is 30
*/
