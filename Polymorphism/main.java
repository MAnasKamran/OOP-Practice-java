//RUN-TIME POLYMORPHISM:
//METHOD OVERWRITING:
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    @Override //(optional) it would still override without writing this.
    public void sound(){
        System.out.println("Dog barks.");
    }
}
public class main {
    public static void main (String [] args){
        Animal dog = new Dog();
        dog.sound();
    }
}
