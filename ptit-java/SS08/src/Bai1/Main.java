package Bai1;

public class Main {
    static void main(String[] args) {
        Animals[] animalsArr = new Animals[2];

        //Tạo 2 đối tượng
        Dog dog1 = new Dog("Buddy",3,"Golden Retriever");
        Cat cat1 = new Cat("Whiskers", 2,"Ghi");

        //Thêm vào mảng
        animalsArr[0]=dog1;
        animalsArr[1]=cat1;

        //Hiển thị
        for (Animals animals : animalsArr){
            animals.displayInfo();
            System.out.println("Âm thanh: "+animals.makeSound());
        }
    }
}
