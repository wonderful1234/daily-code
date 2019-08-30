package ÏîÄ¿1;

 class Equa {
	final double pi=3.14;
	public int volume(int a)
	{
		return a*a*a;
	}
	public int volume(int a,int b,int c )
	{
		return a*b*c;
	}
 
	
	public double volume(double r,double h)
	{
		return pi*r*r*h;
	}

}
 public class Equal
 {
	 public static void main(String[] args) {
		Equa s=new Equa();
		System.out.println(s.volume(2));
		System.out.println(s.volume(2,3,4));
		System.out.println(s.volume(2,5));
	}
 }
