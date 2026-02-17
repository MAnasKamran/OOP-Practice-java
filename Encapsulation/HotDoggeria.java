package Lab3;

class HotDogStand{
    private int standID;
    private int hotDogsSold;

    public HotDogStand(int standID, int hotDogsSold){
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
    }
    public void justSold(){
        hotDogsSold++;
    }
    public int getStandID(){
        return standID;
    }
    public int getHotDogsSold(){
        return hotDogsSold;
    }
}
public class HotDoggeria{
    public static void main(String [] args){
        HotDogStand stand1 = new HotDogStand(101, 0);
        HotDogStand stand2 = new HotDogStand(102, 0);
        HotDogStand stand3 = new HotDogStand(103, 0);
        HotDogStand stand4 = new HotDogStand(104, 0);

        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();

        for (int i = 0; i < 10; i++){
            stand2.justSold();
        }
        for(int i = 0; i < 18; i++){
            stand3.justSold();
        }
        for(int i = 0;i < 35; i++){
            stand4.justSold();
        }
        System.out.println("Stand ID: " + stand1.getStandID());
        System.out.println("Hot Dogs sold: " + stand1.getHotDogsSold());
        System.out.println("Stand ID: " + stand2.getStandID());
        System.out.println("Hot Dogs sold: " + stand2.getHotDogsSold());
        System.out.println("Stand ID: " + stand3.getStandID());
        System.out.println("Hot Dogs sold: " + stand3.getHotDogsSold());
        System.out.println("Stand ID: " + stand4.getStandID());
        System.out.println("Hot Dogs sold: " + stand4.getHotDogsSold());
    }
}
