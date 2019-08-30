package 第三次上机;

class MulThread implements Runnable  {
	private String who;
	public MulThread(String str)
	{
		who=str;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(who+"正在运行");
			try
			{
				Thread.sleep((int)(1000*Math.random()));
			}
			catch(InterruptedException e)
			{
				System.out.println(e.toString());
			}	
		}
		System.out.println("finished"+who);
	}
}
public class Runs
{
	public static void main(String[] args) {
		MulThread t1=new MulThread("t1");
		MulThread t2=new MulThread("t2");
		MulThread t3=new MulThread("t3");
		Thread you=new Thread(t1);
		Thread she=new Thread(t2);
		Thread he=new Thread(t3);
		you.start();
		she.start();
		he.start();
	}
}
