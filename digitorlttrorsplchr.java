package javaapplication1;
import java.util.*;
public class JavaApplication1 {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isDigit(a)){
            System.out.println("Digit");
        }
        else if(Character.isLetter(a)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special Character");
        }
}
    
}
