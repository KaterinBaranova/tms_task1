package by.Shauliuk.tasks.HomeworkOOP;


import java.util.Scanner;

public class Freight extends GroundTransport {


    private int CarryingCapacity;


    public Freight(int power, double maximumSpeed, int weight, String brand,
                   int numberOfWheels, double fuelConsumption, int carryingCapacity) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
    }

    public void Transport(int power, double maximumSpeed, int weight, String brand) {
        this.Power = 40;
        this.MaximumSpeed = 220;
        this.Weight = 1500;
        this.Brand = "MAZ";
        this.NumberOfWheels = 8;
        this.FuelConsumption = 15.2;

        System.out.println("Passenger car with the following characteristics:" + power + "in horse power" +
                maximumSpeed + " km/hour maximum Speed" + weight + " kg weight " + brand + "brand" +
                "Number of wheels" + NumberOfWheels + "Fuel consumption" + FuelConsumption);

        double calculatePowerInKilowatts;

        double kilowatts = power * 0.74;
        System.out.println("Power in kilowatts " + kilowatts);
    }

    public int getCarryingCapacity() {
        return CarryingCapacity;
    }

    public void setCarryingCapacity(int CarryingCapacity) {
        this.CarryingCapacity = 80000;
    }

    public void passengerCar() {
        System.out.println("Carrying capacity " + CarryingCapacity + "T");
    }

    Scanner scan4 = new Scanner(System.in);

    {
        System.out.println("Enter cargo: ");
        int cargo = scan4.nextInt();
        if (cargo > 200)
            System.out.println("You need a bigger truck");
        else {
            System.out.println("Truck is filled with cargo");
        }
    }
}




