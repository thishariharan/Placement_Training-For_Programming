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
		return basic;
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
		this.calculateSalary();
	}
	public double calculateSalary()
	{
	    salary = basic + ((basic/100) * bonus);
		return salary;		
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
		this.calculateSalary();
	}
	public double calculateSalary()
	{
	    if ("C".equals(pl) || "c++".equals(pl)) 
	    {
	        bonus = 15;
	    } 
	    else if ("Python".equals(pl)) 
	    {
	        bonus = 12;
	    } 
	    else if ("Java".equals(pl)) 
	    {
	        bonus = 16;
	    } 
	    else if ("Others".equals(pl)) 
	    {
	        bonus = 10;
	    }
	    salary = basic + ((basic/100) * bonus);
		return salary;		
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
