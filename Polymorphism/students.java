// Demonstrates compile-time polymorphism using method overloading
// The printInfo() method behaves differently based on parameters

//POLYMORPHISM
//Function overloading:

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public void printInfo(int age){
        System.out.println("Age: " + age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name: " + name + "  Age: " + age);
    }
}
public class students{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Yahya";
        s1.age = 25;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
        Student s2 = new Student();
        s2.name = "John";
        s2.age = 30;
        s2.printInfo(s2.name);
        s2.printInfo(s2.age);
        s2.printInfo(s2.name, s2.age);
    }

}
