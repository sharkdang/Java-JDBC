package Bai5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    private static List<Product> productList = new ArrayList<>();
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Thêm mới sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm ");
            System.out.println("5. Thoát ");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    //Thêm mới sản phẩm
                    System.out.println("Nhập ID sản phẩm ");
                    String id = sc.nextLine();
                    System.out.println("Nhập tên sản phẩm ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm ");
                    double price = sc.nextDouble();

                    //Thêm vào danh sách
                    productList.add(new Product(id, name, price));
                    System.out.println("Sản phẩm đã được thêm.");
                    break;
                case 2:
                    //Hiển thị danh sách
                    if(productList.isEmpty()){
                        System.err.println("Danh sách sản phẩm trống!");
                        break;
                    }
                    System.out.println("Danh sách sản phẩm: ");
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + ", Tên: " + product.getName() + ", Giá: " + product.getPrice());
                    }
                    break;
                case 3:
                    //Cập nhật sản phẩm
                    System.out.println("Nhập ID sản phẩm cần cập nhật: ");
                    String updateId = sc.nextLine();
                    boolean found = false ;
                    for (Product product : productList){
                        if(product.getId().equals(updateId)){
                            System.out.println("Nhập tên mới: ");
                            product.setName(sc.nextLine());
                            System.out.println("Nhập giá mới: ");
                            product.setPrice(sc.nextDouble());
                            found = true;
                            System.out.println("Sản phẩm đã được cập nhật");
                            break;
                        }

                    }
                    if(!found){
                        System.err.println("Sản phẩm không tồn tại");
                    }
                    break;
                case 4:
                    //Xóa sản phẩm
                    System.out.println("Nhập ID muốn xóa: ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for (int i = 0; i < productList.size() ; i++) {
                        if(productList.get(i).getId().equals(deleteId)){
                            productList.remove(i);
                            found = true;
                            System.out.println("Sản phẩm đã được xóa.");
                            break;
                        }
                    }
                    if(!found){
                        System.err.println("Sản phẩm không tồn tại");
                    }
                    break;


                case 5:
                    //Thoát
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.Vui lòng chọn lại!");
            }

        }while(choice !=5);
    }
}
