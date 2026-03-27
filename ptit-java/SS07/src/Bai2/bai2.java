package Bai2;

public class bai2 {
    static void main(String[] args) {
        //Khởi taoj book
        Book myBook = new Book();

        //Thiết lâpk thuộc tính
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");
        //Thiết lập giá
        myBook.setPrice(29.99);

        //Hiển thị thông tin sách
        System.out.println("Tiêu đề: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

        // Thử thay đổi giá thành công
        myBook.setPrice(35.50);
        System.out.println("Giá mới: " + myBook.getPrice());

        // Thử thay đổi giá không hợp lệ
        myBook.setPrice(-5.00);

    }
}
