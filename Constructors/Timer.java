public class Timer {
    int hours;
    int minutes;
    int seconds;

    public Timer(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void display(){
        System.out.printf("%02d : %02d : %02d%n", hours, minutes, seconds);
    }
    public void startCountdown(){
        while (hours > 0 || minutes > 0 || seconds > 0) {
            display();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
            if (seconds > 0) {
                seconds--;
            } else {
                seconds = 59;

                if (minutes > 0) {
                    minutes--;
                } else {
                    minutes = 59;
                    hours--;
                }
            }
        }
            display();
            System.out.println("⏰ Time's up!!");
    }
    public static void main(String [] args){
        Timer t = new Timer(0 ,0 , 6);
        t.startCountdown();
    }
}
