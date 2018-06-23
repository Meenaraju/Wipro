package javaapplication9;
public class JavaApplication9 {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[1]);
    if(n>=1 && n<=120){
    if(args[0].equals("Female")){
        if(n>=1 && n<=58){
            System.out.println("Interest==8.2%");
        }
        else{
            System.out.println("Interest==7.6%");
        }
    }
    else if(args[0].equals("Male")){
        if(n>=1 && n<=60){
            System.out.println("Interest==9.2%");
        }
        else{
            System.out.println("Interest==8.3%");
        }
    }
    else{
        System.out.println("Invalid");
    }
    } 
    
             
       }
    
}
