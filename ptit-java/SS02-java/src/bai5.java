import java.util.Scanner;

public class bai5 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên ");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Có 31 ngày ");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày ");
                break;
            case 3:
                System.out.println("Có 31 ngày ");
                break;
            case 4:
                System.out.println("Có 30 ngày ");
                break;
            case 5:
                System.out.println("Có 31 ngày ");
                break;
            case 6:
                System.out.println("Có 30 ngày ");
                break;
            case 7:
                System.out.println("Có 31 ngày ");
                break;
            case 8:
                System.out.println("Có 31 ngày ");
                break;
            case 9:
                System.out.println("Có 30 ngày ");
                break;
            case 10:
                System.out.println("Có 31 ngày ");
                break;
            case 11:
                System.out.println("Có 30 ngày ");
                break;
            case 12:
                System.out.println("Có 31 ngày ");
                break;
            default:
                System.out.println("Tháng không hợp lệ ");
                break;
        }
    }
}
