package by.Shauliuk.tasks.HomeworkOOP;

import java.util.Scanner;

public class Civil extends Air {

    private int NumberOfPassengers2;
    private boolean BusinessClassAvailability;


    public Civil(int power, double maximumSpeed, int weight, String brand,
                 int wingspan, int minimumRunwayLengthForTakeOff, int numberOfPassengers2, boolean businessClassAvailability) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
    }

    public void Transport(int power, double maximumSpeed, int weight, String brand) {
        this.Power = 700;
        this.MaximumSpeed = 3000;
        this.Weight = 5000;
        this.Brand = "Boing";
        this.Wingspan = 900;
        this.MinimumRunwayLengthForTakeOff = 642;

        System.out.println("Passenger airplane with the following characteristics:" + power + "in horse power" +
                maximumSpeed + " km/hour maximum Speed" + weight + " kg weight " + brand + "brand"
                + Wingspan + "m Wingspan" + MinimumRunwayLengthForTakeOff + "Minimum runway length for take-off");

        double calculatePowerInKilowatts;

        double kilowatts = power * 0.74;
        System.out.println("Power in kilowatts " + kilowatts);
    }

    public int getNumberOfPassengers2() {
        return NumberOfPassengers2;
    }

    public void setNumberOfPassengers2(int CarryingCapacity) {
        this.NumberOfPassengers2 = 250;
    }

    Scanner scan2 = new Scanner(System.in);

    {
        System.out.println("Enter passengers amount: ");
        int passengers = scan2.nextInt();
        if (passengers > NumberOfPassengers2)
            System.out.println("You need a bigger plane");
        else {
            System.out.println("Plane is filled with people");
        }

    }

    public boolean getBusinessClassAvailability() {
        return BusinessClassAvailability;
    }

    public void setBusinessClassAvailability(boolean BusinessClassAvailability) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Business class availability" + BusinessClassAvailability);
        }

        System.out.println("Number of passengers " + NumberOfPassengers2);
    }

}
