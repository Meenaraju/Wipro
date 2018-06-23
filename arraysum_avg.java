package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[3];
        int c= 0;
        int d=0;
        for(int i=0;i<3;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            c=c+n[i];
            d=c/3;
            
        }
        System.out.println(c);
        System.out.println(d);
            }
    
}
