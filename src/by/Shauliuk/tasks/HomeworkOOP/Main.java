package by.Shauliuk.tasks.HomeworkOOP;

public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger(15, 120, 300, "Opel", 4,
                10.6, "Hatchback", 5);

        passenger.power = 15;
        passenger.maximumSpeed = 120;
        passenger.weight = 300;
        passenger.brand = "Opel";
        passenger.numberOfWheels = 4;
        passenger.fuelConsumption = 1.6;
        String characteristic = passenger.displayInfo();
        String passengerCar = passenger.passengerCar();
        double kilowatts1 = passenger.calculateKilowatts();
        System.out.println("Power in kilowatts " + kilowatts1);
        int AmountKmWithMaxSpeed = passenger.calculateAmountKmWithMaxSpeed();
        double ConsumedFuel = passenger.calculateConsumedFuel();
        System.out.println("Passenger car " + passenger.brand + " driving at maximum speed " +
                passenger.maximumSpeed + " km / h " + " will reach " + passenger.calculateAmountKmWithMaxSpeed() +
                " km and use " + ConsumedFuel + " liters of fuel.");


        Freight freight = new Freight(40, 220, 1500, "MAZ", 8,
                15.2, 80000);
        freight.power = 40;
        freight.maximumSpeed = 220;
        freight.weight = 1500;
        freight.brand = "MAZ";
        freight.numberOfWheels = 8;
        freight.fuelConsumption = 15.2;
        String characteristic2 = freight.displayInfo2();
        double kilowatts2 = freight.calculateKilowatts();
        System.out.println("Power in kilowatts " + kilowatts2);
        String carryingCapacity = freight.carryingCapacity();
        String cargoAmount = freight.cargoAmount();


        Civil civil = new Civil(700, 3000, 5000, "Boing", 900, 642,
                250, true);
        civil.power = 700;
        civil.maximumSpeed = 3000;
        civil.weight = 5000;
        civil.brand = "Boing";
        civil.wingspan = 900;
        civil.minimumRunwayLengthForTakeOff = 642;
        String characteristic3 = civil.displayInfo3();
        double kilowatts3 = civil.calculateKilowatts();
        System.out.println("Power in kilowatts " + kilowatts3);
        String numberOfPassengers2 = civil.numberOfPassengers2();
        int passengersPlane = civil.passengersPlane();
        boolean businessClassAvailability = civil.businessClassAvailability;
        String BusinessClass = civil.BusinessClass();

        Military military = new Military(900, 7000, 10000, "Scania",
                756, 396, true, 70);
        military.power = 900;
        military.maximumSpeed = 7000;
        military.weight = 10000;
        military.brand = "Scania";
        military.wingspan = 756;
        military.minimumRunwayLengthForTakeOff = 396;
        String characteristic4 = military.displayInfo4();
        double kilowatts4 = military.calculateKilowatts();
        System.out.println("Power in kilowatts " + kilowatts4);
        String MissilesOnBoard = military.MissilesOnBoard();
        int rocketAmount = military.rocketAmount();
        boolean bailoutSystem = military.bailoutSystem();

    }
}
