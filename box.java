package box;

public class Box {
            double w,h,d;
Box(double width,double height,double depth){
    w = width;
    h = height;
    d  = depth;
}
public void volume(){
    System.out.println(w*h*d);
}

        
    public static void main(String[] args) {
        Box b= new Box(2,3,10);
        b.volume();
    }
    
}
