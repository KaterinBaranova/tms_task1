package by.Shauliuk.tasks.HomeworkOOP;

public class GroundTransport extends Transport {

    public int NumberOfWheels;
    double FuelConsumption;


    public GroundTransport(int power, double maximumSpeed, int weight, String brand, int numberOfWheels,
                           double fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
    }

}
