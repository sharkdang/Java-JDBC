import java.util.Scanner;

public class bai4 {
   public static void main(String[] args) {
       //Khai báo và khởi tạo
       int a = 10;
       int b = 5;
       int sum = a + b;          // Tính tổng
       int difference = a - b;   // Tính hiệu
       int product = a * b;      // Tính tích
       int quotient = a / b;     // Tính thương
       int remainder = a % b;    // Tính phần dư

       //In kq
       System.out.printf("Giá trị a: %d%n", a);
       System.out.printf("Giá trị b: %d%n", b);
       System.out.printf("Tổng của a và b: %d%n", sum);
       System.out.printf("Hiệu của a và b: %d%n", difference);
       System.out.printf("Tích của a và b: %d%n", product);
       System.out.printf("Thương của a chia cho b: %d%n", quotient);
       System.out.printf("Phần dư khi chia a cho b: %d%n", remainder);
    }
}
