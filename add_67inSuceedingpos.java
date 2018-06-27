package javaapplication5;
import java.util.*;
 public class JavaApplication5 {
  public static void main(String[] args) {            
       Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();
       int[] a= new int[n];
       int in=0,in1=0,sum=0;
       for(int i=0;i<n;i++){
           a[i] = sc.nextInt();
       }
       for(int i=0;i<n;i++){
           if(a[i]==6){
                in = i;
           }
           else if(a[i]==7){
                in1 = i;
           }
       }
       for(int i=0;i<n;i++){
           if(in<in1 || in==0 || in1==0){
               sum=sum+a[i];
               
           }
           else{
               a[in]=0;
               a[in1]=0;
               sum=sum+a[i];
           }
       }
       System.out.println(sum);
           }
    
}
