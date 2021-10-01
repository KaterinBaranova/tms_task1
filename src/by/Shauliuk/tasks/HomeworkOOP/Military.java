package by.Shauliuk.tasks.HomeworkOOP;

import java.util.Scanner;

public class Military extends Air {

    private boolean BailoutSystem;
    private int NumberOfMissilesOnBoard;


    public Military(int power, double maximumSpeed, int weight, String brand,
                    int wingspan, int minimumRunwayLengthForTakeOff, boolean bailoutSystem, int numberOfMissilesOnBoard) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
    }

    public void Transport(int power, double maximumSpeed, int weight, String brand) {
        this.Power = 900;
        this.MaximumSpeed = 7000;
        this.Weight = 10000;
        this.Brand = "Scania";
        this.Wingspan = 756;
        this.MinimumRunwayLengthForTakeOff = 396;

        System.out.println("Passenger airplane with the following characteristics:" + power + "in horse power" +
                maximumSpeed + " km/hour maximum Speed" + weight + " kg weight " + brand + "brand" +
                Wingspan + "m Wingspan" + MinimumRunwayLengthForTakeOff + "Minimum runway length for take-off");

        double calculatePowerInKilowatts;

        double kilowatts = power * 0.74;
        System.out.println("Power in kilowatts " + kilowatts);
    }

    public boolean getBailoutSystem() {
        return BailoutSystem;
    }

    public void setBailoutSystem(boolean CarryingCapacity) {
        this.BailoutSystem = true;
        if (BailoutSystem == true) {
            System.out.println("The bailout was successful");
        } else {
            System.out.println("You don't have such a system");
        }
    }

    public int getNumberOfMissilesOnBoard() {
        return NumberOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(int CarryingCapacity) {
        this.NumberOfMissilesOnBoard = 70;
    }

    Scanner scan3 = new Scanner(System.in);

    {
        System.out.println("Enter rocket amount: ");
        int rocket = scan3.nextInt();
        if (rocket == 0)
            System.out.println("No Missiles On Board");
        else {
            System.out.println("Rocket gone");
        }
        {
            System.out.println("Number of missilesOnBoard " + NumberOfMissilesOnBoard + "There is an bailout System");
        }

    }
}