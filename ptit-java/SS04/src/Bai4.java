import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    //Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Mảng rỗng ");
            return;
        }
        int [] arr = new int [n];
        //Nhập ptu mảng
        for(int i = 0 ; i<n ; i++){
            System.out.print("Nhập ptu thứ "+(i+1)+" ");
            arr[i] = sc.nextInt();


        }
        //In mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //Đảo ngược mảng
        for(int i= 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n - i -1];
            arr[n - i -1] = temp;
        }
        //In
        System.out.print("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
