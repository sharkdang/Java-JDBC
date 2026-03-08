import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        //Khai báo biến
        double radius;
        double area;
        //Tạo đối tượng scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính");
        radius = scanner.nextDouble();
        //Tính diện tích hình tròn
        area = Math.PI * radius* radius;

        System.out.printf("Diện tích hình tròn là: %.2f", area);
        //Đóng scanner
        scanner.close();
    }
}
