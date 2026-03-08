import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        //Khai báo
        int n ;
        //Nhập sô nguyên
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        n = sc.nextInt();
        if(n==0){
            System.out.println("Số nguyên không phải chẵn cũng không phải lẻ ");
        }else if(n % 2 == 0){
            System.out.printf("Số %d là số chẵn. %n",n);
        }else {
            System.out.printf("Số %d là số lẻ. %n",n);
        }
    }
}
