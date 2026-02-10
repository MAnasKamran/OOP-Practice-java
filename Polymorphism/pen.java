package Polymorphism;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }
    public void printColor(){
        System.out.println("Color: " + this.color);
    }
    public void printType(){
        System.out.println("Type: " + this.type);
    }
}
public class pen {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gelpen";
        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen1.write();
        pen1.printColor();
        pen1.printType();

        pen2.write();
        pen2.printColor();
        pen2.printType();
    }
}
