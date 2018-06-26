

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int b=0,count=0;
		int large =0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
			if(a[i]==a[j]){
				count = count+1;
			}
			}
			if(count>large){
				large = count;
				 b = (int)a[i];
			}
		}
	System.out.println(b);	
	}
}
