import java.util.Scanner;

public class bai4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Khai báo biến age
        int age = 0;

        // Sử dụng vòng lặp do...while
        do {
            System.out.print("Vui lòng nhập vào tuổi của bạn: ");
            // Kiểm tra xem người dùng có nhập số nguyên hay không
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                }
            } else {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                scanner.next(); // Xóa giá trị không hợp lệ ra khỏi bộ nhớ
            }
        } while (age <= 0); // Lặp lại nếu tuổi không hợp lệ

        // Hiển thị tuổi của người dùng
        System.out.printf("Tuổi của bạn là %d !%n", age);

        // Đóng scanner
        scanner.close();
    }
}