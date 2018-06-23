package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
       
             }
        Arrays.sort(a);
        System.out.println("The smallest 2 num is " +a[0]+" "+a[1]);
        System.out.println("The largest 2 number is " +a[n-1]+" "+a[n-2]);
    }
}
