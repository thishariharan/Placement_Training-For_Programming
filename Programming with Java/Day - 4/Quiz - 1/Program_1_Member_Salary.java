package Quiz_1;

public class Program_1_Member_Salary {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ajuna",28,"8764971276","Melam Masi Streets",35000,"Fixing Bugs");
		Employee e2 = new Employee("Dhurai",31,"9734571245","Therku Masi Streets",37500,"Super-Visor");
		Manager m = new Manager("Danny",41,"8764545973","Champakulam Streets",43900,"Accounts");
		System.out.print("\u001B[1mEmployee Details - 1\u001B[0m\n");
		e1.show();
		System.out.print("\n\n\u001B[1mEmployee Details - 2\u001B[0m\n");
		e2.show();
		System.out.print("\n\n\u001B[1mManager Details\u001B[0m\n");
		m.show();
	}
}

class Members
{
	String name;
	int age;
	String phone;
	String address;
	double salary;
	public void creater(String n,int a,String p,String ad,double s)
	{
		this.name = n;
		this.age = a;
		this.phone = p;
		this.address = ad;
		this.salary = s;
	}
	public void printSalary()
	{
		System.out.print("\nSalary of "+name+" is "+salary);
	}
}

class Employee extends Members
{
	String special;
	public Employee(String n,int a,String p,String ad,double s,String sp)
	{
		this.special = sp;
		creater(n,a,p,ad,s);
	}
	public void show()
	{
		System.out.print("Name - "+name+"\nAge - "+age+"\nPhone - "+phone+"\nAddress - "+address+"\nSpecialization - "+special);
		printSalary();
	}
}

class Manager extends Members
{
	String dept;	
	public Manager(String n,int a,String p,String ad,double s,String d)
	{
		this.dept = d;
		creater(n,a,p,ad,s);
	}
	public void show()
	{
		System.out.print("Name - "+name+"\nAge - "+age+"\nPhone - "+phone+"\nAddress - "+address+"\nSpecialization - "+dept);
		printSalary();
	}
}





/*
The Output is

Employee Details - 1
Name - Ajuna
Age - 28
Phone - 8764971276
Address - Melam Masi Streets
Specialization - Fixing Bugs
Salary of Ajuna is 35000.0

Employee Details - 2
Name - Dhurai
Age - 31
Phone - 9734571245
Address - Therku Masi Streets
Specialization - Super-Visor
Salary of Dhurai is 37500.0

Manager Details
Name - Danny
Age - 41
Phone - 8764545973
Address - Champakulam Streets
Specialization - Accounts
Salary of Danny is 43900.0
*/
