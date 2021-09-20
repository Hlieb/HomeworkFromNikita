package java;

public abstract class Transport {
    int power;
    int maksSpeed;
    int weight;
    String carModel;

    public Transport(int power, int maksSpeed, int weight, String carModel) {
        this.power = power;
        this.maksSpeed=maksSpeed;
        this.weight=weight;
        this.carModel=carModel;
    }

    void Output() {
        System.out.println("Car model: " + carModel);
        System.out.println("Power: " + power + "hp");
        System.out.println("MaksSpeed: " + maksSpeed + "km/h");
        System.out.println("Weight: " + weight + "" + "kg");
    }


        double Power(){
            double powerKilowat = (double) power * 0.7;//Метод расчета мощности в киловаттах
            return powerKilowat;

        }

}
