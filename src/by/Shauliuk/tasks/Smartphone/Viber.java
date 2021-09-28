package by.Shauliuk.tasks.Smartphone;

public class Viber implements Application, Messenger {
    @Override
    public void turnOn() {
        System.out.println("Viber turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Viber turned off");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message by Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("Getting message from Viber");
    }
}
