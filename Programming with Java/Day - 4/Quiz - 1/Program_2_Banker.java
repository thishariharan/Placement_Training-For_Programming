package Quiz_1;

import java.util.Scanner;

public class Program_2_Banker {

	public static void main(String[] args) {		
		SavingAccount a1 = new SavingAccount("123456789012","Ashokan",10300,5.7);
		LoanAccount a2 = new LoanAccount("123456789012","Ashokan",4232.65,8);
		CheckingAccount a3 = new CheckingAccount("123456789012","Ashokan",10300,50000);
		a1.Show("SavingAccount");
		a2.Show("LoanAccount");
		a3.Show("CheckingAccount");
	}
}

class Account
{
	String AccID;
	String AccHold;
	double Bal;
	public Account(String a,String n,double b)
	{
		this.AccHold = n;
		this.AccID = a;
		this.Bal = b;
	}
	public void deposit(double amt)
	{
		Bal += amt;
		System.out.print("\nAmount of Deposition : $"+amt);
		balance();		
	}
	public void withdraw(Scanner s)
	{
		System.out.print("\nEnter Amount to be Withdrawn : ");
		double amt = s.nextDouble();
		if(amt <= Bal)
		{
			Bal -= amt;
			System.out.print("\nAmount Withdrawn : $"+amt);
			balance();				
		}		
		else
		{
			System.out.print("\nInsufficient Funds available");	
			withdraw(s);
		}
	}
	public void balance()
	{
		System.out.print("\nBalance Available : $"+Bal);
	}
	public void Show(String s)
	{
		System.out.print("\n\n"+s+"\nAccount Number - "+AccID+"\nAccount Holder - "+AccHold+"\nBalance - $"+Bal);
	}
}

class SavingAccount extends Account
{
	double sinterest;
	public SavingAccount(String an,String ah,double ib,double i)
	{
		super(ah,an,ib);
		this.sinterest = i;
	}	
}

class LoanAccount extends Account
{
	double linterest;
	public LoanAccount(String an,String ah,double ib,double i)
	{
		super(ah,an,ib);
		this.linterest = i;
	}
}

class CheckingAccount extends Account
{	
	double limit;
	public CheckingAccount(String an,String ah,double ib,double l)
	{
		super(ah,an,ib);
		this.limit = l;
	}
}

/*
The Output is

SavingAccount
Account Number - Ashokan
Account Holder - 123456789012
Balance - $10300.0

LoanAccount
Account Number - Ashokan
Account Holder - 123456789012
Balance - $4232.65

CheckingAccount
Account Number - Ashokan
Account Holder - 123456789012
Balance - $10300.0
*/