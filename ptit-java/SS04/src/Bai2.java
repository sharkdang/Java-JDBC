import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        //Tạo đối tượng nhập dữ liệu
    Scanner scanner=new Scanner(System.in);
    //Nhập kích thước của mảng
    System.out.print("Nhập kích thước của mảng: ");
    int n=scanner.nextInt();
        int arr []=new int [n];
        //Nhập các ptu cho mảng
        for(int i=0;i<n;i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");//4 3 6 8
            arr[i]=scanner.nextInt();
        }
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum +=arr[i];
        }
        // In kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
