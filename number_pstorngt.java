package javaapplication1;
import java.util.*;
public class JavaApplication1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
        double n = Double.parseDouble(s);
        if(n<0){
        System.out.println("Negative");
    }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("zero");
        }
        }
        catch(NumberFormatException nef){
            System.out.println("invalid");
        }
}
    
}
