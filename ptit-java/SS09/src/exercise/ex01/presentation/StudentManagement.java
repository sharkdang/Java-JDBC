package exercise.ex01.presentation;

import exercise.ex01.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {

        do{
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************\n") ;
            System.out.println("1.Hiển thị danh sách sinh viên");
            System.out.println("2.Thêm sinh viên");
            System.out.println("3.Cập nhật thông tin sinh viên theo mã sinh viên");
            System.out.println("4.Xóa sinh viên theo mã sinh viên");
            System.out.println("5.Tìm sinh viên theo tên sinh viên");
            System.out.println("6.Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Thoát!");
                default:
                    System.out.println("Vui lòng chọn lại!");
            }
        }while(true);
    }

    //Phương thức xây dựng sinh viên để hiển thị
   public static void displayStudent() {
        if(students.isEmpty()){
            System.out.println("Danh sách sinh viên rỗng.");
        }else{
            for (Student student : students){
                student.displayData();
            }
        }
    }
    //Xây dựng phương thức thêm mới sinh viên
   public static void addStudent() {
       System.out.println("Nhập vào số lượng sinh viên muốn thêm: ");
       int n = Integer.parseInt(sc.nextLine());
       for (int i = 0; i < n; i++) {
           System.out.println("Nhập vào thông tin thứ: " +(i+1));
           //Khởi tạo sv muốn thêm
           Student student = new Student();
           //Gọi đến phương thức inputData để nhập thông tin
           student.inputData(sc);
           //Đẩy vào danh sách
           students.add(student);
       }
       System.out.println("Thêm sinh viên thành công!");
    }
    //Xây dựng phương thức cập nhật thông tin
    public static void updateStudent(){
        System.out.println("Nhập ID sinh viên muốn cập nhật:");
        String studentId = sc.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId().equals(studentId)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.err.println("ID sinh viên không tồn tại!");
        }else{
            System.out.println("Nhập vào thông tin mới ");
            Student studentUpdate = new Student();
            studentUpdate.inputData(sc);
            students.set(index,studentUpdate);
            System.out.println("Cập nhật thành công!");
        }
    }
    //Xây dựng phương thức xóa sinh viên
    public static void deleteStudent(){
        System.out.println("Nhập ID sinh viên muốn Xóa:");
        String studentId = sc.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId().equals(studentId)){
                index = i;
                students.remove(index);
                break;
            }
        }
        if(index == -1){
            System.err.println("ID sinh viên không tồn tại!");
        }else{

            System.out.println("Xóa sinh viên thành công!");

        }
    }
    //Xây dựng phương thức tìm sinh viên
    public static void searchStudent(){
        System.out.println("Nhập ID sinh viên muốn tìm:");
        String studentId = sc.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId().equals(studentId)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.err.println("ID sinh viên không tồn tại!");
        }else{
            System.out.println("Thông tin sinh viên: ");
            students.get(index).displayData();
        }
    }
}
