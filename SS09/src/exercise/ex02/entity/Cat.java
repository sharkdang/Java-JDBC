package exercise.ex02.entity;

public class Cat extends Pet{
    //Constructor
    public Cat() {
    }

    public Cat(String petId, String petName, int age) {
        super(petId, petName, age);
    }

    @Override
    public void speak() {
        System.out.println("Meo meo");
    }
}
