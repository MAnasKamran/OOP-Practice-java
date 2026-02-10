import java.util.*;
class X{
    protected int a, b;
    void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
    }
    void add(){
        System.out.println("Sum: " + (a+b));
    }
    void sub(){
        System.out.println("Difference: " + (a-b));
    }
}
class Y extends X{
    @Override
    void getInput(){
        super.getInput();
    }
    void product(){
        System.out.println("Product: " + (a * b));
    }
}
class Z extends Y{
    @Override
    void getInput(){
        super.getInput();
    }
    void Div(){
        System.out.println("Result after division: " + (a/b));
    }
}
class calculator {
    public static void main(String [] args){
        Z r = new Z();
        r.getInput();
        r.add();
        r.sub();
        r.product();
        r.Div();
    }
}
