package �������ϻ�;
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
		System.out.println("����������");
		Scanner reader=new Scanner(System.in);
		double num1=reader.nextDouble();
		dui.putmoney(num1);
		System.out.println("������ȡ����");
		double num2=reader.nextDouble();
		if(dui.getyu()>=num2)
		{
			dui.getmoney(num2);
			System.out.println("ȡ��ɹ�");
		}
		else
			System.out.println("��ǰ���"+dui.getyu()+"����ȡ��");
	}
}
	
		
	
	
		
	
	
	


