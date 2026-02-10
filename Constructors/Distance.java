package Lab2;

public class Distance {
    int feet;
    int inches;

    public Distance(){
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }
    public void display(){
        System.out.println("Distance: " + feet + "'" + inches);
        System.out.println("Feet: " + feet + " inches: " + inches);
    }
    static void main(String [] args){
        Distance d1 = new Distance();
        d1.feet = 8;
        d1.inches = 12;
        d1.display();
        Distance d2 = new Distance(9, 7);
        d2.display();
    }
}
