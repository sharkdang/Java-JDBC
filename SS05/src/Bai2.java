public class Bai2 {
    public static void main(String[]args){
        //Khởi tạo chuỗi ban đầu
        StringBuilder originalString = new StringBuilder("Hello,Java World!");

        //In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: "+originalString);
        //Xóa các kí tự từ 5 đến 9
        originalString.delete(5,10);
        System.out.println("Chuỗi sau khi xóa: "+originalString);
        //Thay thế đoạn word bằng universe
        int start = originalString.indexOf("World");
        if(start !=-1){
            originalString.replace(start,start + 5,"Universe");

        }
        System.out.println("Chuỗi sau khi thay thế: "+originalString);
    }
}
