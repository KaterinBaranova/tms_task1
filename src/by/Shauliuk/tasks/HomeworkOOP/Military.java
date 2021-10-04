package by.Shauliuk.tasks.HomeworkOOP;

import java.util.Scanner;

public class Military extends Air {

    private boolean bailoutSystem;
    private int numberOfMissilesOnBoard;


    public Military(int power, double maximumSpeed, int weight, String brand, int wingspan,
                    int minimumRunwayLengthForTakeOff, boolean bailoutSystem, int numberOfMissilesOnBoard) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
        this.bailoutSystem = bailoutSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }


    public String displayInfo4() {
        System.out.println(" 4) Military airplane with the following characteristics: " + power + "in horse power, " +
                maximumSpeed + " km/hour maximum Speed, " + weight + " kg weight " + brand + " brand, "
                + wingspan + " m Wingspan " + minimumRunwayLengthForTakeOff + " Minimum runway length for take-off ");
        return null;
    }


    double calculateKilowatts() {
        double kilowatts = power * 0.74;
        return kilowatts;
    }

    public boolean getBailoutSystem() {
        return bailoutSystem;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = true;
    }

    public int getNumberOfMissilesOnBoard() {
        return numberOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = 70;
    }

    public String MissilesOnBoard() {
        System.out.println("Number of missiles on board " + numberOfMissilesOnBoard);
        return null;
    }

    Scanner scan3 = new Scanner(System.in);

    public int rocketAmount() {
        System.out.println("Enter rocket amount: ");
        int rocket = scan3.nextInt();
        if (rocket == 0)
            System.out.println("No Missiles On Board");
        else {
            System.out.println("Rocket gone");
        }


        return rocket;
    }

    public boolean bailoutSystem() {
        if (bailoutSystem == true)
            System.out.println("The bailout was successful");
        else {
            System.out.println("You don't have such a system");
        }
        return false;
    }
}