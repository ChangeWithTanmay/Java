import java.util.Scanner;

class Vahicle {
    public String vehicleName;
    public float distanceTravelled;
    public float fuelUsed;

    public Vahicle(String vehicleName) {
        this.vehicleName = vehicleName;
        this.distanceTravelled = 0;
        this.fuelUsed = 0;
    }

    public void travel(float distanceTravelled, float fuelUsed) {
        this.distanceTravelled += distanceTravelled;
        this.fuelUsed += fuelUsed;
    }

    public void dashboard() {
        System.out.println("Vehicle Name: " + vehicleName + "  Total Distance: " + distanceTravelled
                + "  Used Total Fuel: " + fuelUsed + " l");
    }
}



public class vahicleFuelTracker {
    Scanner scanner = new Scanner(System.in);

    public void addVahicle(){
        String number = scanner.nextLine();
        for(int i = 0; i<number; i++){

        }
    }
    public static void main(String[] args) {
        Vahicle v1 = new Vahicle("Bike 1");
        v1.travel(10.2f, 0.8f);
        v1.travel(10.2f, 0.8f);
        v1.travel(10.2f, 0.8f);
        v1.travel(10.2f, 0.8f);
        
        v1.dashboard();
        
    }
}
