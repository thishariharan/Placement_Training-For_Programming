package Quiz_1;

import java.util.*;

public class Program_3_Enrollment {

	public static void main(String[] args) {
		Professor p1 = new Professor("Kumaraguru",47,"P12064","Mathematics");
		Professor p2 = new Professor("Polandhu Vasan",35,"P18013","Machine Learning");
		Course cs = new Course("C23CS06","Computer Science",500,155);
		Course cv = new Course("C23CV08","Civil Works",485,140);
		Course ec = new Course("C23EL21","Electronical Studies",500,147);
		Student s1 = new Student("Naveen",18,"S23056",540.72,171.5);
		Student s2 = new Student("Kumaravel",19,"S23057",539.12,160.1);
		Student s3 = new Student("Sadagopan",18,"S23058",500,145.8);
		cs.enroll(s1);
		cs.enroll(s2);
		ec.enroll(s3);
		cs.enrolled();
	}
}

class Person
{
	String name;
	int age;
	public Person(String n,int a)
	{
		this.name = n;
		this.age = a;
	}	
}	

class Student extends Person
{
	String sid;
	double total,cutoff;
	public Student(String n,int a,String i,double t,double c)
	{
		super(n,a);
		this.sid = i;
		this.total = t;
		this.cutoff = c;
	}
}

class Professor extends Person
{
	String pid;
	String subject;
	public Professor(String n,int a,String i,String s)
	{
		super(n,a);
		this.pid = i;
		this.subject = s;
	}
}

class Course
{
	String cid;
	String cname;
	double pretot,precut;
	List<Student> enrolled;
	public Course(String i,String n,double pt,double pc)
	{
		this.cid = i;
		this.cname = n;
		this.enrolled = new ArrayList<>();
		this.pretot = pt;
		this.precut = pc;
	}
	public void enroll(Student s)
	{
		int f = completePrerequests(s);
		if(f==1)
		{
			enrolled.add(s);
			System.out.print("\nStudent "+s.name+" has been Enrolled in Course "+cname+"("+cid+")"+" with Student ID "+s.sid+".\n");
		}
		else
		{
			System.out.print("\nDue to missing Prerequisite "+s.name+" cannot be Enrolled in Course "+cname+"("+cid+").\n");			
		}
	}
	public int completePrerequests(Student s)
	{
		if((s.cutoff >= precut) && (s.total >= pretot))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public void enrolled()
	{
		int i=1;
		System.out.print("\n\nCourse : "+cname+" - "+cid+"\n");
		for(Student s : enrolled)
		{
			System.out.print("\nStudent "+i+"\nName - "+s.name+"\nID - "+s.sid+"\nStatus - Enrolled\n");
			i++;
		}
	}
}





/*
The Output is

Student Naveen has been Enrolled in Course Computer Science(C23CS06) with Student ID S23056.

Student Kumaravel has been Enrolled in Course Computer Science(C23CS06) with Student ID S23057.

Due to missing Prerequisite Sadagopan cannot be Enrolled in Course Electronical Studies(C23EL21).


Course : Computer Science - C23CS06

Student 1
Name - Naveen
ID - S23056
Status - Enrolled

Student 2
Name - Kumaravel
ID - S23057
Status - Enrolled
*/