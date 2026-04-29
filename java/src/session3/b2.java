package session3;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập điểm (-1 để kết thúc): ");
                        double diem = sc.nextDouble();

                        if (diem == -1) break;

                        if (diem < 0 || diem > 10) {
                            System.out.println("Điểm không hợp lệ, nhập lại");
                            continue;
                        }

                        // Xếp loại
                        if (diem <= 5) System.out.println("Yếu");
                        else if (diem <= 7) System.out.println("Trung Bình");
                        else if (diem <= 8) System.out.println("Khá");
                        else if (diem <= 9) System.out.println("Giỏi");
                        else System.out.println("Xuất sắc");

                        // Thống kê
                        count++;
                        sum += diem;
                        if (diem > max) max = diem;
                        if (diem < min) min = diem;
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double avg = sum / count;
                        System.out.println("Số học viên: " + count);
                        System.out.println("Điểm trung bình: " + avg);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
