package javaapplication5;
import java.util.*;
 public class JavaApplication5 {
  public static void main(String[] args) {            
       Scanner sc = new Scanner(System.in);
        char ch;
       do{
           System.out.println("1.Add\n2.Sub");
       System.out.println("Enter ur option");
       int n = sc.nextInt();
           System.out.println("Enter uur number");
           int a= sc.nextInt();
           int b = sc.nextInt();
           if(n==1){
               System.out.println(a+b);
           }
           else{
               System.out.println(a-b);
           }
           System.out.println("Do u want to continue?");
          ch = sc.next().charAt(0);
       }while(ch=='y'||ch=='Y');
    }
    
}
