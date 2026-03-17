import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Viết chương trình mảng gồm n phần tử sắp xếp các phần tử giảm dần
        //Tạo đối tượng nhập dữ liệu
        Scanner scanner=new Scanner(System.in);
        //Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n=scanner.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");//4 3 6 8
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++) {//0

            for(int j=i+1;j<arr.length;j++) {//1 2
                if(arr[i]<arr[j]) {
                    int t=arr[i];//4
                    arr[i]=arr[j];//6
                    arr[j]=t;
                }
            }
        }
        //In kết quả
        System.out.print("Mảng sau khi sắp xếp : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
