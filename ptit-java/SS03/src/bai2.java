import java.util.Scanner;

public class bai2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double max = -1;
        double min = 11;

        do{
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:

                    System.out.println("--- Nhập điểm học viên (nhập -1 để dừng) ---");
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        double score = sc.nextDouble();
                        if (score == -1) {
                            break;
                        }
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue;
                        }
                        if (score < 5) {
                            System.out.println("Học lực: Yếu");
                        } else if (score < 7) {
                            System.out.println("Học lực: Trung bình");
                        } else if (score < 8) {
                            System.out.println("Học lực: Khá");
                        } else if (score < 9) {
                            System.out.println("Học lực: Giỏi");
                        } else {
                            System.out.println("Học lực: Xuất sắc");
                        }
                        //Thực hiện cộng
                        count++;
                        sum += score;
                        if (score > max) {
                            max = score;
                        }
                        if (score < min) {
                            min = score;
                        }
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        //Điểm trung bình
                        double avg = sum / count;
                        //In kq
                        System.out.println("--- KẾT QUẢ ---");
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.println("Điểm trung bình: " + avg);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }while(true);
    }
}
