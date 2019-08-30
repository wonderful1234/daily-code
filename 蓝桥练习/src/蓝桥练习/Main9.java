package ¿∂«≈¡∑œ∞;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		double i;
		int c;
		double n,m;
		Scanner reader=new Scanner(System.in);
		n=reader.nextDouble();
		for(i=n; ;i--)
		{
			m=Math.sqrt(i);
			c=(int)Math.sqrt(i);
			if(m%c==0)
				break;	
		}
		System.out.print((int)i);
		
	}

}
