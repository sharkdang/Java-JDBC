import java.util.Scanner;

public class bai8 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập số ");
    int n = sc.nextInt();

    if(n < 100 || n > 999 ){
        System.out.println("Số nhập vào không hợp lệ.");
        return;
    }
    int hundreds = n / 100 ;
    int tens =( n % 100 ) / 10 ;
    int units = n % 10 ;

    String result = "";
    switch (hundreds){
        case 1:
            result += "Một trăm ";
            break;
        case 2:
            result += "Hai trăm ";
            break;
        case 3:
            result += "Ba trăm ";
            break;
        case 4:
            result += "Bốn trăm ";
            break;
        case 5:
            result += "Năm trăm ";
            break;
        case 6:
            result += "Sáu trăm ";
            break;
        case 7:
            result += "Bảy trăm ";
            break;
        case 8:
            result += "Tám trăm ";
            break;
        case 9:
            result += "Chín trăm ";
            break;
        }
        switch (tens){
            case 1:
                result += "Mười ";
                break;
            case 2:
                result += "Hai mươi ";
                break;
            case 3:
                result += "Ba mươi ";
                break;
            case 4:
                result += "Bốn mươi ";
                break;
            case 5:
                result += "Năm mươi ";
                break;
            case 6:
                result += "Sáu mươi ";
                break;
            case 7:
                result += "Bảy mươi ";
                break;
            case 8:
                result += "Tám mươi ";
                break;
            case 9:
                result += "Chín mươi ";
                break;
        }
        if (tens == 0 && units != 0) {
            result += "lẻ ";
        }
        switch (units){
            case 1:
                result += "Mốt ";
                break;
            case 2:
                result += "Hai ";
                break;
            case 3:
                result += "Ba ";
                break;
            case 4:
                result += "Bốn ";
                break;
            case 5:
                result += "Lăm ";
                break;
            case 6:
                result += "Sáu ";
                break;
            case 7:
                result += "Bảy ";
                break;
            case 8:
                result += "Tám ";
                break;
            case 9:
                result += "Chín ";
                break;
        }
        System.out.println(result.trim());

    }
}
