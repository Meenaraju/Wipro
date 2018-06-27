import java.util.*;
 public class JavaApplication5 {
  public static void main(String[] args) {            
      // Scanner sc = new Scanner(System.in);
       String s = "malayalam";
       char[] c=s.toCharArray();
       Arrays.sort(c);
       System.out.println(c);
       char ch = c[0];
       System.out.println(ch);
       for(int i=1;i<s.length();i++){
       if(ch==c[i])
           continue;
       else
           System.out.println(c[i]);
           ch = c[i];
       }
                         }
    
}
