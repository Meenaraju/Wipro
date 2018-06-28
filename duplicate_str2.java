package javaapplication5;
import java.util.*;
 public class JavaApplication5 {
  public static void main(String[] args) {            
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char[] ch = str.toCharArray();
       String s1="";
       for(int i=0;i<ch.length;i++){
          // System.out.println(s1.indexOf(ch[i])); 
           if(s1.indexOf(ch[i])==-1){
               s1+=ch[i];
           }
           
       }
      System.out.print(s1); 
    }
    
}
