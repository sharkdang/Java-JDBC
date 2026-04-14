package exercise.ex02.presentation;

import exercise.ex02.entity.Cat;
import exercise.ex02.entity.Dog;
import exercise.ex02.entity.Pet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PetManagement {
    public static List<Pet> pets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        do{
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************\n") ;
            System.out.println("1.Hiển thị danh sách thú cưng");
            System.out.println("2.Thêm thú cưng");
            System.out.println("3.Gọi tiếng kêu");
            System.out.println("4.Xóa thú cưng");
            System.out.println("5.Tìm thú cưng");
            System.out.println("6.Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    displayPet();
                    break;
                case 2:
                    addPet();
                    break;
                case 3:
                    speakPet();
                    break;
                case 4:
                    deletePet();
                    break;
                case 5:
                    searchPet();
                    break;
                case 6:
                    System.out.println("Thoát!");
                default:
                    System.out.println("Vui lòng chọn lại!");
            }
        }while(true);
    }
    //Xây dưng phương thức để hiển thị thú cưng
    public static void displayPet() {
        if(pets.isEmpty()){
            System.out.println("Danh sách thú cưng rỗng.");
        }else{
            for (Pet pet : pets){
                pet.displayData();
                System.out.println("-------------------");
            }
        }
    }
    //Xây dưng phương thức để thêm  thú cưng
    public static void addPet() {
        System.out.println("Chọn loại thú cưng: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int choice = Integer.parseInt(sc.nextLine());

        Pet pet;

        if (choice == 1) {
            pet = new Dog();
        } else {
            pet = new Cat();
        }

        // nhập dữ liệu
        pet.inputData(sc);

        // thêm vào list
        pets.add(pet);
        System.out.println("Thêm thú cưng thành công!");
    }
    // Phương thức gọi tiếng kêu
    public static void speakPet(){
        for (Pet pet : pets){
            pet.speak();
        }
    }
    //Xây dựng phương thức xóa thú cưng
    public static void deletePet(){
        System.out.println("Nhập ID thú cưng muốn Xóa:");
        String petId = sc.nextLine();
        int index = -1;
        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getPetId().equals(petId)){
                index = i;
                pets.remove(index);
                break;
            }
        }
        if(index == -1){
            System.err.println("Thú cưng không tồn tại!");
        }else{
            System.out.println("Xóa thú cưng thành công!");
        }
    }
    //Tìm thú cưng
    public static void searchPet(){
        System.out.println("Nhập ID thú cưng muốn tìm:");
        String petId = sc.nextLine();
        int index = -1;
        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getPetId().equals(petId)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.err.println("ID thú cưng không tồn tại!");
        }else{
            System.out.println("Thông tin thú cưng : ");
            pets.get(index).displayData();
        }
    }
}
