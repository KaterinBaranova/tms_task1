package by.Shauliuk.tasks.HomeworkOOP;

public class Transport {

    public int Power;
    public double MaximumSpeed;
    public int Weight;
    public String Brand;

    public Transport(int power, double maximumSpeed, int weight, String brand) {
        this.Power = power;
        this.MaximumSpeed = maximumSpeed;
        this.Weight = weight;
        this.Brand = brand;
    }

    public int getPower() {
        return Power;
    }

    public double getMaximumSpeed() {
        return MaximumSpeed;
    }

    public int getWeight() {
        return Weight;
    }

    public String getBrand() {
        return Brand;
    }
}
