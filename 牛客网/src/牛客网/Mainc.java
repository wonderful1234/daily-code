package Å£¿ÍÍø;
import java.math.BigInteger;
import java.util.Scanner;;

public class Mainc {

	public static void main(String[] args) {
		BigInteger n,a;
		BigInteger m=new BigInteger("10");
		BigInteger k=new BigInteger("0");
		BigInteger c=new BigInteger("1");
		Scanner reader=new Scanner(System.in);
		n=reader.nextBigInteger();
		while(n.compareTo(m)>0)
		{
		    while(n.compareTo(k)>0)
			{
				a=n.remainder(m);
				n=n.divide(m);
				if(a.compareTo(k)>0)
					c=c.multiply(a);
			}
			n=c;
		}
		System.out.print(n);
	}

}
