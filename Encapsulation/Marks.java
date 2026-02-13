public class Marks {
    private double A1;
    private  double B2;
    private  double C3;

    public Marks(){
        double A1 = 0;
        double B2 = 0;
        double C3 = 0;
    }
    public Marks(double a1, double b2, double c3){
        A1 = a1;
        B2 = b2;
        C3 = c3;
    }
    public void setA1(double a1){
        A1 = a1;
    }

    public void setB2(double b2) {
        B2 = b2;
    }

    public void setC3(double c3) {
        C3 = c3;
    }
    public double getA1(){
        return A1;
    }

    public double getB2() {
        return B2;
    }

    public double getC3() {
        return C3;
    }

    public double calculateSum(){
        return (A1 + B2 + C3);
    }
    public double calculateAverage(){
        return (A1 + B2 + C3) / 3;
    }
    public static void main(String [] args){
        Marks m1 = new Marks();
        m1.setA1(90.5);
        m1.setB2(92.4);
        m1.setC3(95.2);
        System.out.println("A1 = " + m1.getA1());
        System.out.println("B2 = " + m1.getB2());
        System.out.println("C3 = " + m1.getC3());
        System.out.println("Sum = " + m1.calculateSum());
        System.out.println("Average = " + m1.calculateAverage());
    }
}