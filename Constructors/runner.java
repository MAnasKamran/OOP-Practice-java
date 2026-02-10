package Lab2;
// Demonstrates constructor overloading using
// non-parameterized and parameterized constructors:

// Non-parameterized constructor:
//class Rectangle{
//    int length, width;
//    public int calculateArea(){
//        return (length * width);
//    }
//}
//public class runner{
//    public static void main(String [] args){
//        Rectangle rect = new Rectangle();
//        rect.length = 5;
//        rect.width = 8;
//        System.out.println(rect.calculateArea());
//        Rectangle rect2 = new Rectangle();
//        rect2.length = 9;
//        rect2.width = 10;
//        System.out.println(rect2.calculateArea());
//        Rectangle rect3 = new Rectangle();
//        rect3.length = 11;
//        rect3.width = 9;
//        System.out.println(rect3.calculateArea());
//    }
//}

//Parameterized constructor:
class Rectangle {
    public int length, width;
    public Rectangle() {
        length = 5;
        width = 2;
    }
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public int Calculatearea() {
        return (length * width);
    }
}
public class runner {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.Calculatearea());
        Rectangle rect1 = new Rectangle(10, 20);
        System.out.println(rect1.Calculatearea());
        Rectangle rect2 = new Rectangle(20, 20);
        System.out.println(rect2.Calculatearea());

    }
}
