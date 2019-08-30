package ¿∂«≈¡∑œ∞;
import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		Integer i,j,temp,n,k;
		i=1;
		j=0;
		temp=0;k=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		while(k<n)
		{
			if(i>10007)
				i=i%10007;
			i=i+j;
			temp=i%10007;
			k=k+1;
			if(k==n)
				break;
			if(j>10007)
				j=j%10007;
			j=i+j;
			temp=j%10007;
			k=k+1;
		}
		System.out.print(temp);
	}
	
}
