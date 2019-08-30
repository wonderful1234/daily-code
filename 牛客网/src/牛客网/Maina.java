package Å£¿ÍÍø;

import java.util.*;

public class Maina {
	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<a.length;i++)
			sum+=Math.pow(a[i],i+1);
		System.out.print(sum%10000019);
			
		
		
		
	}

}
