package Bai1;

public class Cat extends Animals{
    private String furColor;

    //COntrustor

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    //Ghi đè


    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: "+furColor);
    }
}
