import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng : ");
        int n = sc.nextInt();

        int[] arr = new int [n];
        //Nhập các phần tử
        System.out.print("Nhập các phần tử cho mảng: ");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Sắp xếp giảm dần
        for(int i = 0 ; i < n-1 ;i++){
            int maxIndex = i ;
            for(int j = i + 1 ; j < n ;j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp ;
        }
        //In mảng
        System.out.print("Mảng sau khi săp xếp: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i< n -1)
                System.out.print(",");
        }
        System.out.print("]");
        //Nhập số cần tìm
        System.out.println("\nNhập số cần tìm: ");
        int x = sc.nextInt();

        //Tìm kiếm tuyến tính
        int linearIndex = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                linearIndex =i;
                break;

            }
        }
        if(linearIndex != -1)
            System.out.println("Tìm kiếm tuyến tính: Phần tử "+ x + " tìm thấy tại chỉ số "+ linearIndex);
        else
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy ");
        //Tìm kiếm nhị phân
        int left = 0, right = n - 1;
        int binaryIndex = -1 ;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == x){
                binaryIndex = mid;
                break;
            }else if(arr[mid] < x){
                right = mid -1 ;
            }else {
                left = mid + 1;
            }
        }
        if (binaryIndex != -1)
            System.out.println("Tìm kiếm nhị phân: Phần tử " + x + " tìm thấy tại chỉ số: " + binaryIndex);
        else
            System.out.println("Tìm kiếm nhị phân: Không tìm thấy");

    }
}
