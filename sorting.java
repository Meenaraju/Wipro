package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int a[] = new int[n];
        int temp = 0;
        for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
       
             }
        for(int i=0;i<a.length;i++){
          for(int j=1;j<a.length;j++){
              if(a[j-1]>a[j]){
                  temp=a[j-1];
                  a[j-1]=a[j];
                  a[j]=temp;
              }
          } 
        }
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
        }
    }
}
