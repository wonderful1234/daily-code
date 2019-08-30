package ¿∂«≈¡∑œ∞;

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		int n,i;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		Arrays.sort(a) ;
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
