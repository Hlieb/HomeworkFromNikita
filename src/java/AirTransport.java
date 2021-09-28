package java;


 public  abstract class AirTransport extends Transport {
    int wingSpan;
    int minLength;

     public AirTransport(int power, int maksSpeed, int weight, String carModel, int wingSpan,int minLength) {
         super(power, maksSpeed, weight, carModel);
         this.wingSpan=wingSpan;
         this.minLength=minLength;
     }

     @Override
    void Output() {
        super.Output();
        System.out.println("Wing span: " + wingSpan+"m");
        System.out.println("Minimum runway length for take-off: " + minLength+"m");
    }
}
