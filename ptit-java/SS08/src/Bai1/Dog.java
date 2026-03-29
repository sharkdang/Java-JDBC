package Bai1;

public class Dog extends Animals{
    private String breed;

    //Constructor
    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
    }
    //Ghi đè phương thức

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó "+ breed);
    }
}
