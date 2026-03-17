import java.util.Scanner;

public class Bai1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double[] arr = null;
        int n = 0;
        int choice;

        do {
            System.out.println("\n******** QUẢN LÝ ĐIỂM SV ********");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng đạt và trượt");
            System.out.println("6. Sắp xếp tăng dần");
            System.out.println("7. Thống kê giỏi và xuất sắc");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Nhập số sinh viên: ");
                    n = sc.nextInt();
                    arr = new double[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm SV " + (i + 1) + ": ");
                        arr[i] = sc.nextDouble();
                    }
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    System.out.print("Danh sách điểm: ");
                    for (double d : arr) {
                        System.out.print(d + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    double sum = 0;
                    for (double d : arr) {
                        sum += d;
                    }
                    System.out.println("Điểm trung bình: " + (sum / arr.length));
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    double max = arr[0];
                    double min = arr[0];

                    for (double d : arr) {
                        if (d > max) max = d;
                        if (d < min) min = d;
                    }

                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    break;

                case 5:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    int pass = 0, fail = 0;

                    for (double d : arr) {
                        if (d >= 5) pass++;
                        else fail++;
                    }

                    System.out.println("Số SV đạt: " + pass);
                    System.out.println("Số SV trượt: " + fail);
                    break;

                case 6:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }

                    // Sắp xếp nổi bọt
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                double temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Đã sắp xếp tăng dần!");
                    break;

                case 7:
                    if (arr == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }

                    int gioi = 0;

                    for (double d : arr) {
                        if (d >= 8) gioi++;
                    }

                    System.out.println("Số SV giỏi/xuất sắc: " + gioi);
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
}
