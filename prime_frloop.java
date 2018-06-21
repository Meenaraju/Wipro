package javaapplication1;
import java.util.*;
public class JavaApplication1 {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int c=0;
    int n = sc.nextInt();
    for(int i=2;i<n;i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==0){
        System.out.println("prime");
    }
    else{
        System.out.println("not a prime");
    }
        }
    
}


