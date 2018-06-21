import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	/*	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b=1;
		int c=0;*/
		for(int i=10;i<99;i++){
			int c=0;
		for(int j=2;j<i;j++){
			if(i%j==0)
			c++;
		}
		
		if(c==0){
			System.out.print(i+" ");
			}
		}
		
	}
}
