package by.Shauliuk.tasks.HomeworkOOP;

public abstract class Air extends Transport {

    int wingspan;
    int minimumRunwayLengthForTakeOff;


    public Air(int power, double maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff) {
        super(power, maximumSpeed, weight, brand);
    }
}
