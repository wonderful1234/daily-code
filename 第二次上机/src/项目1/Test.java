package 项目1;

class Vehicle {
	public void run()
	{
		System.out.println("这是交通工具run方法");
	}
}
class Motor extends Vehicle
{
	public void run()
	{
		System.out.println("这是交通工具Motor方法");
	}
}
class Ship extends Vehicle
{
	public void run()
	{
		System.out.println("这是交通工具Ship方法");
	}
}
class Aeroplane extends Vehicle
{
	public void run()
	{
		System.out.println("这是交通工具Aeroplane方法");
	}
}
class Bus extends Motor
{
	public void run()
	{
		System.out.println("这是交通工具Bus方法");
	}
}
class Car extends Motor
{
	public void run()
	{
		System.out.println("这是交通工具Car方法");
	}
}
public class Test
{
	public static void main(String []args)
	{
		Vehicle v=new Vehicle();
		v.run();
		Motor m=new Motor();
		m.run();
		Ship s=new Ship();
		s.run();
		Aeroplane a=new Aeroplane();
		a.run();
		Bus b=new Bus();
		b.run();
		Car c=new Car();
		c.run();	
	}
	
}
