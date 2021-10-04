package by.Shauliuk.tasks.HomeworkOOP;

public abstract class Transport {

    protected int power;
    protected double maximumSpeed;
    protected int weight;
    protected String brand;

    public Transport(int power, double maximumSpeed, int weight, String brand) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }
}
