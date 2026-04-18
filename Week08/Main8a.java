package Week08;
abstract class Figure{
    int x;
    int y;
    Figure(int x, int y){
        this.x=x;
        this.y=y;
    }
    Figure(int x){
        this.x=x;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(int x, int y){
        super(x,y);
    }
    public double area(){
        return (double) x*y;
    }
}
class Triangle extends Figure{
    Triangle(int x, int y){ super(x,y);}
    public double area() { return 0.5*x*y;}
}
class Square extends Figure{
    Square(int x){ super(x,x);}
    public double area(){return x*x;}
}
public class Main8a {
    public static void main(String[] args){
        Figure f1;
        f1=new Rectangle(12,4);
        System.out.println("Area of rectangle: "+ f1.area());
        f1=new Triangle(12,4);
        System.out.println("Area of Trianlge: "+ f1.area());
        f1=new Square(12);
        System.out.println("Area of Square: "+ f1.area());
    }
}
