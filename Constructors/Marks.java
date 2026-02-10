package Lab2;

public class Marks {
    double A1;
    double B2;
    double C3;

public Marks(){
    double A1 = 0;
    double B2 = 0;
    double C3 = 0;
}
public Marks(double A1, double B2, double C3){
    this.A1 = A1;
    this.B2 = B2;
    this.C3 = C3;
}
public double calculateSum(){
    return (A1 + B2 + C3);
}
public static void main(String [] args){
    Marks m1 = new Marks();
    m1.A1 = 80;
    m1.B2 = 85;
    m1.C3 = 90;
    System.out.println("Sum: " + m1.calculateSum());
    Marks m2 = new Marks(90, 93.5, 95.9);
    System.out.println("Sum of m2: " + m2.calculateSum());
}
}
