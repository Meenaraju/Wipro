package javaapplication1;
public class JavaApplication1 {
public static void main(String[] args) {
        int n = args.length;
        if(n==0){
            System.out.println("No values");
        }
        else{
            for(int i=0;i<n;i++){
                System.out.print(args[i]);
               if(i<n-1){
                    System.out.print(",");
                }
            }
        }
}
    
}

