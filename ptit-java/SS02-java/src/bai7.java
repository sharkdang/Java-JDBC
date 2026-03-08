import java.util.Scanner;

public class bai7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();
        // Kiểm tra có phải tam giác không
        if(a+b<=c ||a+c<=b ||b+c<=a){
            System.out.println("3 cạnh không tạo thành tam giác.");
        }else{
            //Phân loại tam giác
            if(a == b && b==c){
                System.out.println("Đây là tam giác đều.");
            }else if(a==b ||a==c||b==c){
                System.out.println("Đây là tam giác cân.");
            }else if(a*a + b*b == c*c ||
            a*a +c*c == b*b ||
            b*b + c*c == a*a){
                System.out.println("Đây là tam giác vuông.");
            }else{
                System.out.println("Đây là tam giác thường.");
            }
            //
            scanner.close();
        }
    }
}
