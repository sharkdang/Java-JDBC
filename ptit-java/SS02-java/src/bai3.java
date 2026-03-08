import java.util.Scanner;

public class bai3 {
    public static void main (String [] args){
        // người dùng nhập số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n ");

        int n =scanner.nextInt();
        //Khai báo tổng ban đầu = 0
        int sum =0;
        if(n<=0){
            System.out.println("Số nhập vào không hợp lệ");
        }else{
            for(int i=0;i<=n;i++){
                sum += i;
            }
            System.out.printf("Tổng các số từ [1-%d] là %d%n ",n,sum);
        }


    }
}
