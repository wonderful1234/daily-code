package ��Ŀ2;
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
			System.out.println(Thread.currentThread().getName()+"��Ǯ��,"+"�ܶ�Ϊ"+sum);
		}		
	}
}
public class Save
{
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		Thread t1=new Thread(t,"��һ���˿�");
		Thread t2=new Thread(t,"�ڶ����˿�");
		t1.start();
		t2.start();	
	}
}
