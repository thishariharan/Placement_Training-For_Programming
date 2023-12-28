package Programs;

import java.util.Scanner;

public class Program_1_Account_Receipt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Accounts A = new Accounts();
		Accounts B = new Accounts();
		A.getdets(s,'A');
		System.out.print("\n");
		B.getdets(s,'B');
		System.out.print("\n");
		double t;
		System.out.print("Transaction from Account A to Account B");
		t = A.transaction(s);
		A.withdraw(t);
		B.transfer(t);
		A.recipt('A');
		B.recipt('B');
		System.out.print("\n\nTransaction from Account B to Account A");
		t = B.transaction(s);
		B.withdraw(t);
		A.transfer(t);
		B.recipt('B');
		A.recipt('A');
		s.close();
	}
}


class Accounts
{
	int AccID;
	String AccHold;
	double AccBal;
	 public void getdets(Scanner s,char a)
	 {
		 System.out.print("Enter details of Account "+a+"\nAccount Number : ");
		 AccID = s.nextInt();
		 s.nextLine();
		 System.out.print("Account Holder Name : ");
		 AccHold = s.nextLine();
		 System.out.print("Intial Balance : ");
		 AccBal = s.nextDouble();
	 }
	 public double transaction(Scanner s)
	 {
		 System.out.print("\nEnter Amount : ");
		 double t = s.nextDouble();
		 if(t <= AccBal)
		 {
			 return t;			 
		 }
		 else
		 {
			 return transaction(s);
		 }
	 }
	 public void transfer(double t)
	 {
		 AccBal += t;		 
	 }
	 public void withdraw(double t)
	 {
		 AccBal -= t;
	 }
	 public void recipt(char a)
	 {
		 System.out.print("\n\nReceipt of Account "+a+"\nAccount Number - "+AccID+"\nAccount Holder - "+AccHold+"\nAccount Balance - "+AccBal);
	 }
}






/*
The Output is

Enter details of Account A
Account Number : 123456789
Account Holder Name : Ramana
Intial Balance : 5000

Enter details of Account B
Account Number : 345678912
Account Holder Name : Thavasi
Intial Balance : 2500

Transaction from Account A to Account B
Enter Amount : 1500


Receipt of Account A
Account Number - 123456789
Account Holder - Ramana
Account Balance - 3500.0

Receipt of Account B
Account Number - 345678912
Account Holder - Thavasi
Account Balance - 4000.0

Transaction from Account B to Account A
Enter Amount : 3000


Receipt of Account B
Account Number - 345678912
Account Holder - Thavasi
Account Balance - 1000.0

Receipt of Account A
Account Number - 123456789
Account Holder - Ramana
Account Balance - 6500.0
*/
