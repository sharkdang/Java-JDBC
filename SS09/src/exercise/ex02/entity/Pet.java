package exercise.ex02.entity;

import java.util.Scanner;

public abstract class Pet {
    private String petId ;
    private String petName;
    private int age;

    //constructor

    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Phương thức inputData
    public void inputData(Scanner scanner){
        System.out.println("Nhập mã thú cưng: ");
        petId = scanner.nextLine();

        System.out.println("Nhập tên thú cưng: ");
        petName = scanner.nextLine();

        System.out.println("Nhập tuổi thú cưng: ");
        age = Integer.parseInt(scanner.nextLine());

    }
    //Phương thức displayData
    public void displayData(){
        System.out.println("Mã: " + petId);
        System.out.println("Tên: " + petName);
        System.out.println("Tuổi: " + age);
    }
    public abstract void speak();
}
