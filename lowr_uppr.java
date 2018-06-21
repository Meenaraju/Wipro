import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a>='A' && a<='Z'){
		System.out.println(a+"->"+Character.toLowerCase(a));
		}
		else{
			System.out.println(a+"->"+Character.toUpperCase(a));
		}
	}
}
