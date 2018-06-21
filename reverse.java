
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int b;
		while(n>0){
			b = n%10;
			sum=sum*10+b;
			n=n/10;
			System.out.print(b);
		}
	}
}
