package ¿∂«≈¡∑œ∞;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		int n,i,j,m;
		j=-2;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		m=reader.nextInt();
		for(i=0;i<a.length;i++)
			if(m==a[i])
			{
				j=i;
				break;
			}
		System.out.print(j+1);	
		reader.close();
	}

}
