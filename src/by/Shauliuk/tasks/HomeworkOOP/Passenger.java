package by.Shauliuk.tasks.HomeworkOOP;


import java.util.Scanner;

public class Passenger extends GroundTransport {

    private String BodyType;
    private int NumberOfPassengers;


    public Passenger(int power, double maximumSpeed, int weight, String brand,
                     int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
    }

    public void GroundTransport(int power, double maximumSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        this.Power = 15;
        this.MaximumSpeed = 120;
        this.Weight = 300;
        this.Brand = "Opel";
        this.NumberOfWheels = 4;
        this.FuelConsumption = 10.6;

        System.out.println("Passenger car with the following characteristics:" + power + "in horse power" +
                +maximumSpeed + " km/hour maximum Speed" + weight + " kg weight " + brand +
                "brand" + "Number of wheels" + NumberOfWheels + "Fuel consumption" + FuelConsumption);

        double calculatePowerInKilowatts;

        double kilowatts = power * 0.74;
        System.out.println("Power in kilowatts " + kilowatts);

    }

    public String getBodyType() {
        return BodyType;
    }

    public int getNumberOfPassengers() {
        return NumberOfPassengers;
    }

    public void setBodyType(String BodyType) {
        this.BodyType = "Hatchback";
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.NumberOfPassengers = 5;
    }

    public void passengerCar() {
        System.out.println("Body type " + BodyType + "Number of passengers " + NumberOfPassengers);
    }

    Scanner scan = new Scanner(System.in);

    {
        System.out.print("Enter time (in hours): ");
        double time = scan.nextInt();
        double amountKm = (time * MaximumSpeed);


        Scanner scan1 = new Scanner(System.in);


        System.out.print("Enter gasoline (in litres): ");
        double gasoline = scan1.nextInt();
        double ConsumedFuel = (gasoline / FuelConsumption);
        System.out.println("За время" + time + "ч." + "Двигаясь с максимальной скоростью" + MaximumSpeed + "км/ч" +
                "проедет" + amountKm + "км и израсходует" + ConsumedFuel + "литров топлива.");
    }
}






