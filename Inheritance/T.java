// Demonstrates inheritance in Java with Shapes as the base class
// Triangle and Circle inherit from Shapes
// Also demonstrates method overloading (polymorphism)

//class Shapes{
//    String color;
//    public void print(){
//        System.out.println("Color: " + color);
//    }
//}
//class Triangle extends Shapes{
//
//}
//public class T {
//    public static void main(String[] args){
//        Triangle t1 = new Triangle();
//        t1.color = "red";
//        t1.print();
//    }
//}
class Shapes{
    public void Area(){
        int len;
        int h;
        System.out.println("Display area");
    }
}
class Triangle extends Shapes{
    public void Area(int len, int h){
        System.out.println("Area of triangle: " + 0.5 * len * h);
    }
}
class Circle extends Shapes{
    public void Area(int r){
        System.out.println("Area of circle : " + 3.14 * r * r);
    }
}
public class T{
    public static void main (String[] args){
        Circle circle = new Circle();
        circle.Area(2);
        Triangle triangle = new Triangle();
        triangle.Area(4, 5);
    }
}
