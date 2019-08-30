package 项目2;
class MyThread implements Runnable
{
	private int sum=0;
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try
			{
				Thread.sleep((int)(1000*Math.random()));
			}
			catch(InterruptedException e)
			{}
			sum+=100;
			System.out.println(Thread.currentThread().getName()+"存钱了,"+"总额为"+sum);
		}		
	}
}
public class Save
{
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		Thread t1=new Thread(t,"第一个顾客");
		Thread t2=new Thread(t,"第二个顾客");
		t1.start();
		t2.start();	
	}
}
