import java.util.Scanner;

public class Bai4 {
    public static void main(String[]args){
        //Tạo đối tượng
        Scanner sc = new Scanner(System.in);

        //Nhập chuỗi
        System.out.println("Nhập địa chỉ email: ");
        String email = sc.nextLine().trim();

        //Biểu thức chính quy
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$";
        //Kiểm tra định dạng
        if (email.matches(emailRegex)) {
            System.out.println("Email hợp lệ");
        }else {
            System.out.println("Email không hợp lệ");
        }
    }
}
