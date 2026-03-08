import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
    //Khai báo
        float width;
        float height;
        float area;
        float circumference;
        //Nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng : ");
        width = scanner.nextFloat();

        System.out.print("Nhập chiều dài : ");
        height = scanner.nextFloat();

        //Tính
        area = width*height;
        circumference =(width+height)*2;
        //In kq
        System.out.printf("Diện tích: %.2f%n",area);
        System.out.printf("Chu vi: %.2f%n",circumference);
        scanner.close();
        
    }
}
