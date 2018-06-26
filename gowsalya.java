package javaapplication1;
//import java.util.*;

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
     String s6="";
     String s7="";
     String s8="";
     String s9="";
     String s10="";
     for(int i=0;i<8;i++){
         s6+=s5.charAt(i);
         }
     for(int i=8;i<12;i++){
         s7+=s5.charAt(i);
     }
     for(int i=12;i<15;i++){
         s8+=s5.charAt(i);
     }
     for(int i=15;i<17;i++){
         s9+=s5.charAt(i);
     }
     for(int i=17;i<s5.length();i++){
         s10+=s5.charAt(i);
     }
     System.out.print(s6+s8+"@"+s9+"$"+s7+s10);
    }
}
