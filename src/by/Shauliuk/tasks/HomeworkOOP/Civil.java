package by.Shauliuk.tasks.HomeworkOOP;

import java.util.Scanner;

public class Civil extends Air {

    protected int numberOfPassengers2;
    protected boolean businessClassAvailability;


    public Civil(int power, double maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff
            , int numberOfPassengers2, boolean businessClassAvailability) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
        this.numberOfPassengers2 = numberOfPassengers2;
        this.businessClassAvailability = businessClassAvailability;
    }

    public String displayInfo3() {
        System.out.println(" 3) Passenger airplane with the following characteristics: " + power + " in horse power, " +
                maximumSpeed + " km/hour maximum Speed, " + weight + " kg weight, " + brand + " brand, "
                + wingspan + " m Wingspan " + minimumRunwayLengthForTakeOff + " Minimum runway length for take-off ");
        return null;
    }


    double calculateKilowatts() {
        double kilowatts = power * 0.74;
        return kilowatts;
    }

    public int getNumberOfPassengers2() {
        return numberOfPassengers2;
    }

    public void setNumberOfPassengers2(int numberOfPassengers2) {
        this.numberOfPassengers2 = 250;
    }

    public String numberOfPassengers2() {
        System.out.println("Number of passengers " + numberOfPassengers2);
        return null;
    }

    Scanner scan2 = new Scanner(System.in);

    public int passengersPlane() {
        System.out.println("Enter passengers amount: ");
        int passengers = scan2.nextInt();
        if (passengers > numberOfPassengers2)
            System.out.println("You need a bigger plane");
        else {
            System.out.println("Plane is filled with people");
        }

        return passengers;
    }

    public boolean getBusinessClassAvailability() {
        return businessClassAvailability;
    }

    public void setBusinessClassAvailability(boolean BusinessClassAvailability) {
        this.businessClassAvailability = true;
    }

    public String BusinessClass() {
        if (businessClassAvailability == true)
            System.out.println("There is a business class availability");
        else {
            System.out.println("There is no a business class availability");
        }
        return null;
    }
}


