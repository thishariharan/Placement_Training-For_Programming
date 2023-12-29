package Quiz_2;

public class Program_1_Multiply {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.print("Integer Multiplication of 25 and 35 is "+c.multiply(25, 35));
		System.out.print("\n\nDouble Multiplication of 20,30 and 40 is "+c.multiply(20,30,40));
	}
}

class Calculator
{
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public double multiply(double a,double b,double c)
	{
		return a*b*c;
	}
}




/*
The Output is

Integer Multiplication of 25 and 35 is 875

Double Multiplication of 20,30 and 40 is 24000.0
*/
