package Extra;
class TwoDShape{
    double width;
    double height;
    TwoDShape(double w, double h){
        width=w;
        height=h;
    }
    void show(){
        System.out.println("Width: "+width+" Height: "+height);
    }
}
class Triangle extends TwoDShape{
    String style;
    Triangle(double w, double h, String s){
    super(w,h);
    style=s;
    }
    double area() {return height*width/2;}
    @Override
    void show(){
        super.show();
        System.out.println("Style: "+style);
    }

}
public class Main1 {
    public static void main(String[] args){
        Triangle t1=new Triangle(8.0,12.0,"Outlined");
        Triangle t2=new Triangle(4.0,4.0,"filled");
        System.out.println("Details of first triangle T1: ");
        t1.show();
        System.out.println("Area: "+t1.area());
        System.out.println("Detaisl of second triangle T2");
        t2.show();
        System.out.println("Area: "+t2.area());
    }
}
