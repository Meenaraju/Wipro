package javaapplication1;
public class JavaApplication1 {
    public static void main(String[] args) {
        int i=1,n=0;
        while(n<5){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i);
                n++;
            }
            i++;
            
        }
    }
    
}
