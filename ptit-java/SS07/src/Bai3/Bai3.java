package Bai3;

import java.util.Scanner;

public class Bai3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tạo đối tượng 1
        person person1 = new person();
        System.out.print("Nhập tên người thứ nhất: ");
        person1.setName(sc.nextLine());
        System.out.print("Nhập tuổi người thứ nhất: ");
        person1.setAge(sc.nextInt());
        sc.nextLine();
        //Tạo đối tượng 2
        person person2 = new person();
        System.out.print("Nhập tên người thứ hai: ");
        person2.setName(sc.nextLine());
        System.out.print("Nhập tuổi người thứ hai: ");
        person2.setAge(sc.nextInt());

        //So sánh tuổi
        if(person1.getAge() > person2.getAge()){
            System.out.println(person1.getName() + " lớn tuổi hơn "+person2.getName());
        }else if(person1.getAge() < person2.getAge()){
            System.out.println(person1.getName() + " nhỏ tuổi hơn "+person2.getName());
        }else{
            System.out.println("Cả 2 bằng tuổi.");
        }
    }
}
