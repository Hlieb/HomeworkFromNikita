package java;

public class MilitaryAirTransport extends AirTransport {
    boolean ejectionSystems;
    int numberOfMissiles;

    public MilitaryAirTransport(int power, int maksSpeed, int weight, String carModel, int wingSpan, int minLength,
                                boolean ejectionSystems,int numberOfMissiles) {
        super(power, maksSpeed, weight, carModel, wingSpan, minLength);
        this.ejectionSystems=ejectionSystems;
        this.numberOfMissiles=numberOfMissiles;
    }

    @Override
    void Output() {
        super.Output();
        if (ejectionSystems){
        System.out.println("Ejection Systems: yes ");
        }
        System.out.println("Number of Missiles: " + numberOfMissiles);
    }
    void shot() {
        if (numberOfMissiles != 0) {
            System.out.println("Missile fired!");}
        else{
            System.out.println("No ammunition!");
        }
    }
    void ejection(){
        if (ejectionSystems){
            System.out.println("Bailout Successful");
        }
        else {
            System.out.println("You don't have this system");
        }
    }
}
