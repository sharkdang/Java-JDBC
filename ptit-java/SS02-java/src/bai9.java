import java.util.Scanner;

public class bai9 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int N ;
    do{
        System.out.print("Nhập số : ");
        N = sc.nextInt();
        if(N < 0){
            System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại:");
        }
    }while(N<0);
        System.out.println("Các số Arms trong từ 0 đến "+N+ "là: ");
        for(int i=0;i<=N;i++){
            int temp =i;
            int digits = 0;
            //Đếm số chữ số
            int t = temp;
            if(t==0) digits =1;
            while (t !=0){
                digits ++;
                t /=10;
            }
            int sum = 0;
            t = temp ;
            while (t !=0){
                int digit = t % 10 ;
                sum += Math.pow(digit,digits);
                t /=10;
            }
            // Trường hợp số 0
            if (temp ==0) sum =0;
            if(sum == i){
                System.out.print(i+" ");
            }
        }

    }
}
