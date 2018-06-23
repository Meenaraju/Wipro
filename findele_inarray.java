package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a[] = new int[]{1,4,34,56,7};
        int b = sc.nextInt();
        int n=0;
        for(int i=0;i<5;i++){
        if(b==a[i]){
            System.out.println(i+1);
            break;
        }
        else{
            n++;
            continue;
        }
          
        }
        if(n==5){
            System.out.println("-1");
        }
             }
    
}
