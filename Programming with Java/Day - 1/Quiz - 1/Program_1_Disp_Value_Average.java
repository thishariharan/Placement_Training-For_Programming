package P_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program_1_Disp_Value_Average {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		disp d = new disp();
		d.dip(s);
		d.avg(s);
	}

}

class disp
{
	public void dip(Scanner s)
	{
		System.out.print("Enter the Integer Value : ");
		int n = s.nextInt();
		System.out.print("The Value you have entered is "+n);
	}
	public void avg(Scanner s)
	{
		System.out.print("\n\nEnter the Integer A : ");
		float a = s.nextFloat();
		System.out.print("Enter the Integer B : ");
		float b = s.nextFloat();
		float c = (a+b)/2;
		DecimalFormat df = new DecimalFormat("#.##");
		String avgr = df.format(c);
		System.out.print("The Average of "+a+" and "+b+" is "+avgr);		
		s.close();
	}
}




/*
The Output is

Enter the Integer Value : 26
The Value you have entered is 26

Enter the Integer A : 12.54
Enter the Integer B : 5.78
The Average of 12.54 and 5.78 is 9.16
*/

