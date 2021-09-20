package java;

import java.util.Scanner;

public class LightVehicle extends LandTransport {
    String typeOfBody;
    int numberOfSeats;
    private int traveledRoute;
    private double fuelConsumption;
    private int time;
    public LightVehicle(int power, int maksSpeed, int weight, String carModel,String typeOfBody,int numberOfSeats,
                        int traveledRoute, double fuelConsumption, int time, int numberOfWheels){
        super(power,fuelConsumption,maksSpeed,weight,carModel,numberOfWheels);
        this.typeOfBody=typeOfBody;
        this.numberOfSeats=numberOfSeats;
        this.traveledRoute=traveledRoute;
        this.fuelConsumption=fuelConsumption;
        this.time=time;

    }


    @Override
    void Output() {
        super.Output();
        System.out.println("Type of body: " + typeOfBody);
        System.out.println("Number of seats: " + numberOfSeats);
    }
    private double fuelConsumption(){
        fuelConsumption = traveledRoute/fuelConsumption;
        return fuelConsumption;
    }
    void Movement(){
        System.out.println("Enter travel time: ");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        traveledRoute = time*maksSpeed;
        fuelConsumption();
        System.out.println("During the time " + time + " h, the car " + carModel + " moving with the maximum speed " +
                maksSpeed + " km/h " + "will ride " + traveledRoute + " km and consume " + fuelConsumption +
                " liters of fuel" );
    }
}
