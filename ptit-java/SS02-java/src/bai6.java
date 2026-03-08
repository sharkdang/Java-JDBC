import java.util.Scanner;

public class bai6 {
    public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số nguyên ");
        int n = sc.nextInt();
        // Chuyển số âm thành số dương
        n = Math.abs(n);

        int sum = 0;
        // Tách từng chữ số
        while (n!=0){
            int digit = n% 10;
            sum += digit;
            n = n / 10;
        }
        //In kq
        System.out.println("Tổng các chữ số: "+ sum);
    }
}
