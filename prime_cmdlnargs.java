package javaapplication1;
public class JavaApplication1 {
public static void main(String[] args) {
    if(args.length==0){
        System.out.println("Please enter an integer number");
    }
    int c=0;
    int n = Integer.parseInt(args[0]);
    if(n==1){
        System.out.println("1 is neither prime nor composite");
    }
    else if(n==0){
        System.out.println("0 is neither prime nor composite");
    }
    else{
    for(int i=2;i<n;i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==0){
        System.out.println(n+" is a prime");
    }
    else{
        System.out.println(n+" is not a prime");
    }
    }
        }
    
}
