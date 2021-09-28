package java;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport {
    int maksNumberOfPassengers;
    boolean businessClass;

    public CivilAirTransport(int power, int maksSpeed, int weight, String carModel, int wingSpan, int minLength,
                             int maksNumberOfPassengers, boolean businessClass) {
        super(power, maksSpeed, weight, carModel, wingSpan, minLength);
        this.maksNumberOfPassengers=maksNumberOfPassengers;
        this.businessClass=businessClass;
    }

    @Override
    void Output() {
        super.Output();
        System.out.println("Number of Passengers: " + maksNumberOfPassengers);
        System.out.println("Businees Class: " + businessClass);
    }
    void loading(){
        System.out.println("Enter the number of passengers: ");
        Scanner scanner = new Scanner(System.in);
        int passangers = scanner.nextInt();
        if(maksNumberOfPassengers >= passangers) {
            System.out.println("Everything is ok!");
        }
        else {
            System.out.println("You need the bigger plane!");
        }
    }
}
