package 项目1;
import java.util.Scanner;

interface Myltfc {
	double area(double u);

}
class My implements Myltfc
{
	public double area(double u)
	{
		return u*u*u;
	}
}
public class Prin
{
	public static void main(String[] args) {
		int i;
		My our=new My();
		System.out.println("请输入一个数");
		Scanner reader=new Scanner(System.in);
		i=reader.nextInt();
		reader.close();
		System.out.println(our.area(i));
		
	}
}
