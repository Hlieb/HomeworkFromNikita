package java;

public abstract class LandTransport extends Transport {
    int numberOfWheels;
    double fuelConsumption;

    public LandTransport(int power, double fuelConsumption,int maksSpeed,int weight,String carModel, int numberOfWheels) {
        super(power,maksSpeed,weight,carModel);
        this.fuelConsumption = fuelConsumption;
        this.numberOfWheels=numberOfWheels;

    }
    @Override
    void Output() {
        super.Output();
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Fuel consumption: " + fuelConsumption);
    }
}
