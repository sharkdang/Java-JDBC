import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Nhập chuỗi
        System.out.println("Nhập chuỗi ");
        String text = sc.nextLine().trim();

        //Nhập từ cần tìm
        System.out.println("Nhập từ cần tìm: ");
        String wordToFind = sc.nextLine().trim();

        //Tìm vị trí của từ trong chuỗi
        int index = text.indexOf(wordToFind);

        //Kiểm tra và thồn báo kq
        if(index !=-1){
            System.out.println("Từ \""+wordToFind+"\"xuất hiện tại vị trí:"+index);
        }else {
            System.out.println("Từ \""+wordToFind+"\" không xuất hiện trong chuỗi.");
        }

    }
}
