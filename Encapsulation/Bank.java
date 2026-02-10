// Demonstrates encapsulation using private fields with public getter and setter methods
// Also shows different access modifiers (public, protected, private)

package bank;
class Account{
public String name;
protected String email;
private String password;

public String getPassword(){
    return this.password;
}
public void setPassword(String pass){
    this.password = pass;
}
}
public class Bank{
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Meow meow";
        account1.email = "meow@gmail.com";
        account1.setPassword("abcd");
        String retrievedPassword = account1.getPassword();
        System.out.println("Email: " + account1.email);
        System.out.println("Retireved password : " + retrievedPassword);
//        System.out.println(account1.getPassword());

    }
}


