package 第三次上机;
import java.util.*;
class Money {
	private double you=0;
	public void putmoney(double money)
	{
		you+=money;
	}
	public void getmoney(double money)
	{
		you-=money;
	}
	public double getyu()
	{
		return you;
	}
}
public class Teec
{
	public static void main(String[] args) {
		Money dui=new Money();
		System.out.println("请输入存款金额");
		Scanner reader=new Scanner(System.in);
		double num1=reader.nextDouble();
		dui.putmoney(num1);
		System.out.println("请输入取款金额");
		double num2=reader.nextDouble();
		if(dui.getyu()>=num2)
		{
			dui.getmoney(num2);
			System.out.println("取款成功");
		}
		else
			System.out.println("当前余额"+dui.getyu()+"不能取款");
	}
}
	
		
	
	
		
	
	
	


