package pl.javastart.task;

public class Televisor {
    private boolean isTurnOn;

    public Televisor() {
        this.isTurnOn = false;
    }

    public void turnOn() {
        System.out.println("Turning on the TV");
        this.isTurnOn = true;
    }

    public void turnOff() {
        System.out.println("Turning off the TV");
        this.isTurnOn = false;
    }

    public void showStatus() {
        System.out.println(getStatus());
    }

    private String getStatus() {
        return isTurnOn ? "Tv is on" : "Tv is turned off";
    }
}
