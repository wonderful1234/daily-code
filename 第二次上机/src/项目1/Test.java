package ��Ŀ1;

class Vehicle {
	public void run()
	{
		System.out.println("���ǽ�ͨ����run����");
	}
}
class Motor extends Vehicle
{
	public void run()
	{
		System.out.println("���ǽ�ͨ����Motor����");
	}
}
class Ship extends Vehicle
{
	public void run()
	{
		System.out.println("���ǽ�ͨ����Ship����");
	}
}
class Aeroplane extends Vehicle
{
	public void run()
	{
		System.out.println("���ǽ�ͨ����Aeroplane����");
	}
}
class Bus extends Motor
{
	public void run()
	{
		System.out.println("���ǽ�ͨ����Bus����");
	}
}
class Car extends Motor
{
	public void run()
	{
		System.out.println("���ǽ�ͨ����Car����");
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
