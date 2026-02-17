package Lab3;

class Student{
    private String name;
    private int [] resultArray;

    public Student(String name, int[] resultArray){
        this.name = name;
        this.resultArray = resultArray;
    }
    public String getName(){
        return name;
    }

    public double average(){
        int sum = 0;
        for (int i = 0; i < resultArray.length;i++){
            sum += resultArray[i];
        }
        return (double) sum / resultArray.length;
    }
    public int[] getResultArray() {
        return resultArray;
    }
}
public class RunnerStd {
    public static void main(String [] args){
        int [] marks1 = {92, 90, 85, 83, 89};
        int [] marks2 = {94, 87, 84, 90, 88};
        Student s1 = new Student("Ahmad", marks1);
        Student s2 = new Student("Ali", marks2);
        double avg1 = s1.average();
        double avg2 = s2.average();
        System.out.println("Average of " + s1.getName() + " is " + avg1);
        System.out.println("Average of " + s2.getName() + " is " + avg2);

        System.out.print("Comparing");
        for(int i = 0; i < 4; i++ ){
            try{
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
            System.out.print(".");
        }
        System.out.println("             ");
        System.out.println("             ");
        if(avg1 > avg2){
            System.out.println(s1.getName() + " has got higher average than " + s2.getName());
            System.out.println("             ");
        } else if(avg2 > avg1){
            System.out.println(s2.getName() + " has got higher average than " + s1.getName());
            System.out.println("             ");
        } else {
            System.out.println("Both " + s1.getName() + " and " + s2.getName() + " have got an equal average.");
            System.out.println("             ");
        }
        Student s3 = new Student(s1.getName(), s2.getResultArray());
        System.out.println("The name of the third student is: " + s3.getName());
        System.out.println("The average of the third student is: " + s3.average());
    }
}
