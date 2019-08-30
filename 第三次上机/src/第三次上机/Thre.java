package 第三次上机;

class Mythread extends Thread{
	private String who;
	public Mythread(String str)
	{
		who=str;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println(who+"正在运作");
		}
	}
}
class Mythreads extends Thread{
	private String who;
	public Mythreads(String str)
	{
		who=str;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				sleep(3000);
			}
			catch(InterruptedException e) {}
			System.out.println(who+"正在运作");
		}
	}
}
public class Thre
{
	public static void main(String[] args) {
		Mythread you=new Mythread("1号");
		Mythreads she=new Mythreads("2号");
		you.start();
		she.start();
	}
}
