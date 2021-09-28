package java;

import java.util.Scanner;

public class FreightLandTransport extends LandTransport {
    double carryingCapacity;

    public FreightLandTransport(int power, double fuelConsumption, double carryingCapacity, int maksSpeed,int weight,String carModel, int numberOfWheels) {
        super(power,fuelConsumption,maksSpeed,weight,carModel,numberOfWheels);
        this.carryingCapacity=carryingCapacity;
    }


    @Override
    void Output() {
        super.Output();
        System.out.println("Carrying capacity: " + carryingCapacity);
    }
    void loading(){
        System.out.println("Enter the weight of the cargo: ");
        Scanner scanner = new Scanner(System.in);
        int cargoWeight = scanner.nextInt();
        if(carryingCapacity >= cargoWeight) {
            System.out.println("Cargo was loaded");
        }
        else {
            System.out.println("You need the bigger truck!");
        }
    }


}
