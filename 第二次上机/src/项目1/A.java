package ÏîÄ¿1;

class B {
		private int data;
		public void setData(int data)
		{
			this.data=data;
			
		}
		 public void getData()
		 {
			 System.out.println(data);
		 }
	}
public class A
{
	public static void main(String[] args) {
		B ob=new B();
		ob.setData(89);
		ob.getData();	
	}
}
