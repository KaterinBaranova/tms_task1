package by.Shauliuk.tasks.HomeworkOOP;


import java.util.Scanner;

public class Passenger extends GroundTransport {

    private String bodyType;
    private int numberOfPassengers;


    public Passenger(int power, double maximumSpeed, int weight, String brand, int numberOfWheels,
                     double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String displayInfo() {

        System.out.println(" 1) Passenger car with the following characteristics: " + power + " in horse power, " +
                +maximumSpeed + " km/hour maximum Speed, " + weight + " kg weight, " + brand +
                " brand " + " Number of wheels " + numberOfWheels + " ,Fuel consumption " + fuelConsumption);
        return null;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = "Hatchback";
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers() {
        this.numberOfPassengers = 5;
    }

    public String passengerCar() {
        System.out.println("Body type " + bodyType + " Number of passengers " + numberOfPassengers);
        return null;
    }


    public double calculateKilowatts() {
        double kilowatts = power * 0.74;
        return kilowatts;
    }


    Scanner scan1 = new Scanner(System.in);

    public double calculateConsumedFuel() {
        System.out.print("Enter gasoline (in litres): ");
        double gasoline = scan1.nextInt();
        double consumedFuel = (gasoline / fuelConsumption);
        return (int) consumedFuel;
    }

    Scanner scan = new Scanner(System.in);

    public int calculateAmountKmWithMaxSpeed() {
        System.out.print("Enter time (in hours): ");
        int time = scan.nextInt();
        return (int) (time * maximumSpeed);
    }
}







