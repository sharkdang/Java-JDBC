import java.sql.SQLOutput;
import java.util.Scanner;

public class bai1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        //Nhập thông tin
        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();
        System.out.print("Nhập số lượng mua: ");
        int quantity = sc.nextInt();
        System.out.print("Khách hàng có phải thành viên: ");
        boolean isMember = sc.nextBoolean();
        //Tính toán
        double amount = price * quantity ;

        double discount = 0 ;
        if(isMember){
            discount =amount * 0.1;
        }
        double vat = amount * 0.08;

        double total_amount = amount - discount + vat;

        //In hóa đơn
        System.out.println("\n============= HÓA ĐƠN =============");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Giá: " + price + " VND");
        System.out.println("Số lượng: " + quantity);
        System.out.println("Thành tiền: " + amount + " VND");
        System.out.println("Giảm giá: " + discount + " VND");
        System.out.println("Tiền VAT: " + vat + " VND");
        System.out.println("Tổng thanh toán: " + total_amount + " VND");

    }
}
