package models;

public abstract class ABCar {

    //phương thức bình thường - non abstract method
    public void startEngine() {
        System.out.println("Start Engine");
    }

    //abstract method
    public abstract void stopEngine();
}
