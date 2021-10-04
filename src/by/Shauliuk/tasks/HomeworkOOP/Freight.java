package by.Shauliuk.tasks.HomeworkOOP;


import java.util.Scanner;

public class Freight extends GroundTransport {


    protected int carryingCapacity;

    public Freight(int power, double maximumSpeed, int weight, String brand, int numberOfWheels,
                   double fuelConsumption, int carryingCapacity) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public String displayInfo2() {
        System.out.println(" 2) Freight car with the following characteristics: " + power + " in horse power " +
                +maximumSpeed + " km/hour maximum Speed " + weight + " kg weight " + brand +
                " brand " + "Number of wheels " + numberOfWheels + " Fuel consumption " + fuelConsumption);
        return null;
    }

    double calculateKilowatts() {
        double kilowatts = power * 0.74;
        return kilowatts;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int CarryingCapacity) {
        this.carryingCapacity = 80000;
    }

    public String carryingCapacity() {
        System.out.println("Carrying capacity " + carryingCapacity + "T");
        return null;
    }


    Scanner scan4 = new Scanner(System.in);

    public String cargoAmount() {

        System.out.println("Enter cargo: ");
        int cargo = scan4.nextInt();
        if (cargo > 200)
            System.out.println("You need a bigger truck");
        else {
            System.out.println("Truck is filled with cargo");
        }
        return null;
    }
}




