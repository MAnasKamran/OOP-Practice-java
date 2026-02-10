// Demonstrates non-parameterized and parameterized constructors
// with a method to calculate circumference

public class Circle {
    double radius;
    double pi;
    public Circle(){
        this.pi = 3.1415;
        this.radius = radius;
    }
    public Circle(double pi, double radius){
        this.pi = pi;
        this.radius = radius;
    }
    public double calculateCircumference(){
        double circumference;
        return circumference = 2 * pi * radius;
    }
    public static void main (String [] args){
        Circle c1 = new Circle();
        c1.radius = 3.1;
        System.out.println(c1.calculateCircumference());
        Circle c2 = new Circle(3.1415, 6);
        System.out.println(c2.calculateCircumference());
        Circle c3 = new Circle(3.1415, 9.3);
        System.out.println(c3.calculateCircumference());
    }
}

