package by.Shauliuk.tasks;

public class Telegram implements Application, Messenger {


    @Override
    public void turnOn() {
        System.out.println("Telegram turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Telegram turned off");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message by Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Getting message from Telegram");
    }
}
