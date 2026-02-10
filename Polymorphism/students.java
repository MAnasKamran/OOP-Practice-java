//class Student{
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//    }
//    Student(){
//        System.out.println("Constructor called");
//    }
//}
//public class students {
//    public static void main(String[] args){
//        Student s1 = new Student();
//        s1.name = "Ali";
//        s1.age = 21;
//        s1.printInfo();
//        Student s2 = new Student();
//        s2.name = "Ahmad";
//        s2.age = 22;
//        s2.printInfo();
//    }
//}
// new --> allocates space where the whole object is stored
// Student() --> (special kind of function) Constructor  | The name of the constructor is same as the class.
//Non-parameteryzed Constructor
//Constructors do not return anything. Only construct/build the objects.
// for one object only, constructor is only called once when an object is created.
// default constructor. but when defined. then that constructor is used.
//Non-parameteryzed constructor is used and shown here.

// the usage of copy constructors is shown here.

//class Student{
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//    }
//    Student(Student s2){
//        this.name = s2.name;
//        this.age = s2.age;
//    }
//    Student(){
//
//    }
//}
//public class students {
//    public static void main(String[] args){
//        Student s1 = new Student();
//        s1.name = "Ali";
//        s1.age = 21;
//        Student s2 = new Student(s1);
//        s2.printInfo();
//    }
//}


//POLYMORPHISM
//Function overloading:
package Polymorphism;
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