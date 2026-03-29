package Bai2;

public class Car extends Vehicle{

    public Car(String name, int speed) {
        super(name, speed);
    }
    //Ghi đè


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Name: " + getName() + ", Speed: " + getSpeed() + " km/h");
    }
}
