import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Bài tập mảng 2 chiều
        //Nhập dữ liệu ng dùng
        Scanner sc = new Scanner(System.in);
        // Nhập số hàng và số cột
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        //Nhập các ptu của mảng
        System.out.print("Nhập các ptu cho mảng (theo từng mảng) : ");
        for(int i = 0 ; i < rows; i++){
            System.out.print("Hàng " + (i + 1) + ": ");
            for(int j = 0 ; j < cols ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sumEven = 0 ;
        int sumOdd = 0 ;
        // Duyệt mảng
        for(int i = 0 ;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(arr[i][j]%2 == 0){
                    sumEven +=arr[i][j];
                }else{
                    sumOdd +=arr[i][j];
                }
            }
        }
        //In kq
        System.out.println("Tổng các số chẵn là: " + sumEven);
        System.out.println("Tổng các số lẻ là: " + sumOdd);


    }
}
