package ¿∂«≈¡∑œ∞;

import java.math.BigInteger;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		int n,i;
		String m=new String();
		BigInteger sum=new BigInteger("1");
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(i=1;i<=n;i++)
		{
			m=String.valueOf(i);
			sum=(new BigInteger(m)).multiply(sum);
		}
		System.out.print(sum);
	}

}
