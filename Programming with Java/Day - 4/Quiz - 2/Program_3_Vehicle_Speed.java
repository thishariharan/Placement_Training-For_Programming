package Quiz_2;

public class Program_3_Vehicle_Speed {

	public static void main(String[] args) {
		Car c1 = new Car(63,4);
		Motorcycle m1 = new Motorcycle(128,2);
		System.out.print("The Speed of Car is "+c1.calculateSpeed()+"\nThe Speed of Motorcycle is "+m1.calculateSpeed());
		Vehicle v = determine(c1,m1);
		System.out.print("\n\nThe Highly efficient Vehicle here is "+v.getClass().getSimpleName());
	}	
	public static Vehicle determine(Vehicle v1,Vehicle v2)
	{
		if(v1.calculateSpeed() > v2.calculateSpeed())
		{
			return v1;
		}
		else
		{
			return v2;
		}
	}	
}

class Vehicle
{
	double actual_speed;
	int count;
	double speed;
	public Vehicle(double s,int c)
	{
		this.actual_speed = s;
		this.count = c;
	}
	public double calculateSpeed()
	{
		return speed;
	}
}

class Motorcycle extends Vehicle
{
	int wheels;
	public Motorcycle(double s,int w)
	{
		super(s,w);
		this.wheels = w;
		this.calculateSpeed();
	}
	public double calculateSpeed()
	{
		speed = actual_speed * wheels;
		return speed;
	}
}

class Car extends Vehicle
{
	int passengers;
	public Car(double s,int p)
	{
		super(s,p);
		this.passengers = p;
		this.calculateSpeed();
	}
	public double calculateSpeed()
	{
		speed = actual_speed * passengers;
		return speed;
	}
}





/*
The Output is

The Speed of Car is 252.0
The Speed of Motorcycle is 256.0

The Highly efficient Vehicle here is Motorcycle
*/