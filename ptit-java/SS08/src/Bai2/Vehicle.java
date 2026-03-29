package Bai2;

public class Vehicle {
    private String name;
    private int speed;

    //Constructor

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    //Phương thúc trừu tượng
    public void displayInfo() {

    }

    //Phương thức thông thường
    public void start(){
        System.out.println("Vehicle is starting ...");

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


}
