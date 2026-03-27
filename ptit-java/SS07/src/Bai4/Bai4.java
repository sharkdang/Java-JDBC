package Bai4;

import java.util.Scanner;

public class Bai4 {
    static void main(String[] args) {
        //Tạo danh sách sv
        Student [] studentArr = new Student[5];
        studentArr[0] = new Student("Alice", 20, "A1", 8.5);
        studentArr[1] = new Student("Bob", 21, "A1", 7.0);
        studentArr[2] = new Student("Charlie", 19, "A2", 9.0);
        studentArr[3] = new Student("David", 22, "A2", 6.5);
        studentArr[4] = new Student("Eve", 20, "A1", 8.0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm min: ");
        double min = sc.nextDouble();
        System.out.println("Nhập điểm max: ");
        double max = sc.nextDouble();

        //Hiển thị danh sách sv
        System.out.println("Danh sách sinh viên có điểm trung bình từ "+ min +" đến "+ max);
        for (Student student : studentArr){
            if(student.getAvgScore() >= min && student.getAvgScore() <= max){
                System.out.println(student);
            }
        }
    }
}
