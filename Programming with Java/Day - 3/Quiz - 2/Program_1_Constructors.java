package All_Programs;

public class Program_1_Constructors {

	public static void main(String[] args) {
		//Constructors c1 = new Constructors();
		System.out.printf("From Default Constructor, the value of A is "+Constructors.a);
		Constructors c2 = new Constructors();
		System.out.printf("\nFrom No Argument Constructor, the value of A is "+c2.b);
		Constructors c3 = new Constructors("Laxman");
		System.out.printf("\nFrom One Parametered Constructor,\nThe Name is "+c3.s1);
		Constructors c4 = new Constructors("Ramana",28,'A');
		System.out.printf("\nFrom Multiple Parametered Constructor,\nAge of "+c4.s1+" living in Block "+c4.bl+" is "+c4.b);
	}
}

class Constructors
{
	static int a=12;
	int b;
	String s1;
	char bl;
	/*
	public Constructors()		// Default Constructor
	{
		System.out.print("\nThis is Called Default Constructor.");
	}
	*/
	public Constructors()		// No Argument Constructor
	{
		b = 24;
		System.out.print("\n\nThis is Called No Argument Constructor.");
	}
	public Constructors(String s)
	{
		s1 = s;
		System.out.print("\n\nThis is Called One Parameterized Constructor.");
	}
	public Constructors(String s,int age,char ap)
	{
		b = age;
		s1 = s;
		bl = ap;
		System.out.print("\n\nThis is Called Multiple Parameterized Constructor.");
	}
}





/*
The Output is

From Default Constructor, the value of A is 12

This is Called No Argument Constructor.
From No Argument Constructor, the value of A is 24

This is Called One Parameterized Constructor.
From One Parametered Constructor,
The Name is Laxman

This is Called Multiple Parameterized Constructor.
From Multiple Parametered Constructor,
Age of Ramana living in Block A is 28
*/