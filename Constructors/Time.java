package Lab2;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void display(){
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
    public static void main(String [] args){
        Time t1 = new Time();
        t1.hours = 12;
        t1.minutes = 45;
        t1.seconds = 20;
        t1.display();
        Time t2 = new Time(15, 25, 30);
        t2.display();
    }
}
