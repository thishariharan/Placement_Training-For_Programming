package Quiz_2;

public class Program_2_Employee_Salary {

	public static void main(String[] args) {
		Manager m1 = new Manager("Daniel","M00E08",24);
		Developer d1 = new Developer("Kannan","D30E02","Others");
		Developer d2 = new Developer("Aryan","D00E12","C");
		Developer d3 = new Developer("Suryan","D10E43","Java");
		m1.printDetails();
		d1.printDetails();
		d2.printDetails();
		d3.printDetails();
	}
}

class Employees
{
	String name;
	String id;
	double basic = 50000;
	String role;
	double salary;
	public Employees(String i,String n,String r)
	{
		this.name = n;
		this.id = i;
		this.role = r;
	}
	public void Salary(double bonus)
	{		
		this.salary = basic + ((basic/100)*bonus);
	}
	public double calculateSalary()
	{		
		return salary;
	}
	public void printDetails()
	{
		System.out.print("\n\nName - "+name+"\nID - "+id+"\nRole - "+role+"\nSalary - $"+salary);
	}
}

class Manager extends Employees
{
	double bonus;
	public Manager(String n,String i,double b)
	{
		super(i,n,"Manager");
		this.bonus = b;
		Salary(bonus);
	}
}

class Developer extends Employees
{
	String pl;
	double bonus;
	public Developer(String n,String i,String p)
	{
		super(i,n,"Developer");
		this.pl = p;
		if((pl == "C") || (pl == "c++"))
		{
			bonus = 15;
		}
		else if(pl == "Python")
		{
			bonus = 12;
		}
		else if(pl == "Java")
		{
			bonus = 16;
		}
		else if(pl == "Others")
		{
			bonus = 10;
		}
		Salary(bonus);
	}
}



/*
The Output is

Name - Daniel
ID - M00E08
Role - Manager
Salary - $62000.0

Name - Kannan
ID - D30E02
Role - Developer
Salary - $55000.0

Name - Aryan
ID - D00E12
Role - Developer
Salary - $57500.0

Name - Suryan
ID - D10E43
Role - Developer
Salary - $58000.0
*/