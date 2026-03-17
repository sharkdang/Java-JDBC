import java.util.Scanner;

public class Bai3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        //Nhập chuỗi
        System.out.println("Nhập vào 1 chuỗi: ");
        String inputString = sc.nextLine();

        //Thay thế
        String replaceString = inputString.replaceAll("[0-9]","*");

        //In kq
        System.out.println("Chuỗi sau khi thay thế: "+replaceString);
    }
}

