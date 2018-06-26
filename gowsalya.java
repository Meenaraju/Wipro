  package javaapplication1;
import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
       String s = "gowsalya123@45$saro45";
       String s1="";
       String s2="";
       String s3="";
       String s4 ="";
       for(int i=0;i<s.length();i++){
           if(Character.isLetter(s.charAt(i))){
               s1+=s.charAt(i);
           }
           else if(Character.isDigit(s.charAt(i))){
               s2+=s.charAt(i);
           }
       }
     for(int i=s1.length()-1;i>=0;--i){
         s3+=s1.charAt(i);
     }
     for(int i=s2.length()-1;i>=0;--i){
         s4+=s2.charAt(i);
     }
     String s5 = s3+s4;
      System.out.print(s5.substring(0,8));
      System.out.print(s5.substring(12,15)+"@");
      System.out.print(s5.substring(15,17)+"$");
      System.out.print(s5.substring(8,12));
      System.out.print(s5.substring(17,19));
    }
}

