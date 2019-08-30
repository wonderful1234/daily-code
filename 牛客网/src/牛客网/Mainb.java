package Å£¿ÍÍø;

import java.util.*;

public class Mainb {

	public static void main(String[] args) {
		int n,i=0,j=0,d=0,e;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		i=1;
		while(i!=a.length)
		{
			int[]b=Arrays.copyOfRange(a,0,i);
			int[]c=Arrays.copyOfRange(a,i,a.length);
			Arrays.sort(b);
			Arrays.sort(c);
			e=Math.abs(b[b.length-1]-c[c.length-1]);
			d=Math.max(d,e);
			i++;
		}
		System.out.print(d);
	}

}
