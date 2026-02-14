// Demonstrates non-parameterized and parameterized constructors
// with a method to calculate circumference

public class Circle {
    double radius;
    String color;
    public Circle(){
        this.color = color;
        this.radius = radius;
    }
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public double calculateCircumference(){
        double circumference;
        return circumference = 2 * Math.PI * radius;
    }
    public void Display(){
        System.out.println("                  ");
        System.out.println("Color: " + color);
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main (String [] args){
        Circle c1 = new Circle();
        c1.radius = 3.1;
        c1.color = "Red";
        c1.Display();
        Circle c2 = new Circle("Black", 6);
        c2.Display();
        Circle c3 = new Circle("Blue", 9.3);
        c3.Display();
    }
}



