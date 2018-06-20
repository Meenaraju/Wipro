package javaapplication1;
import java.util.*;
public class JavaApplication1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
        int n = Integer.parseInt(s);
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        }
        catch(NumberFormatException nef){
            System.out.println("invalid");
        }
}
    
}
