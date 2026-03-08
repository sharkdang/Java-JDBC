import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        //Khai báo
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập tử số phân số 1: ");
    int a = scanner.nextInt();
    System.out.print("Nhập mẫu số phân số 1: ");
    int b = scanner.nextInt();
    System.out.print("Nhập tử số  phân số 2: ");
    int c = scanner.nextInt();
    System.out.print("Nhập mẫu số phân số 2: ");
    int d = scanner.nextInt();
    if(b ==0 || d==0){
        System.out.println("Mẫu số phải khác 0 ");
    }
    //Tính tổng
    int tu = a*d+b*c;
    int mau = b*d;
    System.out.println("Kết quả : "+ tu +"/"+mau);
    scanner.close();
    }
}
