package ¿∂«≈¡∑œ∞;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		int i,j,n;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[][]a=new int[n][];
		for(i=0;i<a.length;i++)
			a[i]=new int[i+1];
		a[0][0]=1;
		for(i=1;i<a.length;i++)
		{
			a[i][0]=1;
			for(j=1;j<a[i].length-1;j++)
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			a[i][a[i].length-1]=1;
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
