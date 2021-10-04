package by.Shauliuk.tasks.HomeworkOOP;

public abstract class GroundTransport extends Transport {

    public int numberOfWheels;
    double fuelConsumption;


    public GroundTransport(int power, double maximumSpeed, int weight, String brand, int numberOfWheels,
                           double fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
    }

}
