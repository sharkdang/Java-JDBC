import java.util.Scanner;

public class Bai7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        if(n <=0){
            System.out.println("Mảng không hợp lệ");
            return;
        }
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i]=sc.nextInt();
        }
        boolean foundUnique = false ;

        for (int i = 0; i < n; i++) {
            int count = 0 ;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==1){
                if(!foundUnique) {
                    System.out.println("Các phần tử xuất hiện đúng 1 lần: ");
                }
                System.out.print(arr[i]+" ");
                foundUnique = true;
            }
        }
        if(!foundUnique){
            System.out.print("Không có phần tử nào duy nhất trong mảng");
        }
    }
}
