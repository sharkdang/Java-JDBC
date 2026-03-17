import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main (String[]args){

        //Tạo đối tượng nhập dữ liệu
        Scanner scanner=new Scanner(System.in);
        //Nhập kích thước của mảng
        System.out.print("nhập số lượng phần tử ");
        int n=scanner.nextInt();

        int arr []=new int [n];
        //Nhập các ptu cho mảng
        for(int i=0;i<n;i++) {
            System.out.print("Nhập các ptu cho mảng: ");//4 3 6 8
            arr[i]=scanner.nextInt();
        }
        //Sắp xếp giảm dần
        for(int i=0;i<arr.length;i++) {//0
            //Nếu ptu đứng tr nhỏ hơn thì đổi chỗ
            for(int j=i+1;j<arr.length;j++) {//1 2
                if(arr[i]<arr[j]) {
                    int t=arr[i];//4
                    arr[i]=arr[j];//6
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        //In giá trị lớn nhất
    System.out.println("\nGiá trị lớn nhất: "+arr[0]);
    }

}

