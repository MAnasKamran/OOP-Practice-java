// Demonstrates parameterized constructor and copy constructor
// Shows how to create a new object with the same data as an existing object

class A{
    int a;
    String b;
    A(int a, String b){
        this.a = a;
        this.b = b;
    }
    A(A r2){
        this.a = r2.a;
        this.b = r2.b;
    }
    public void display(){
        System.out.println(a + " " + b);
    }
}
class B{
    public static void main(String[] args){
        A r = new A(100, "coding");
        A r2 = new A(r);

        r.display();
        r2.display();
    }
}
