package session3;

import java.util.ArrayList;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> dsLuong = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập lương (-1 để kết thúc): ");
                        double luong = sc.nextDouble();

                        if (luong == -1) break;

                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Lương không hợp lệ, nhập lại");
                            continue;
                        }

                        // Phân loại
                        if (luong < 5_000_000) System.out.println("Thu nhập thấp");
                        else if (luong <= 15_000_000) System.out.println("Thu nhập trung bình");
                        else if (luong <= 50_000_000) System.out.println("Thu nhập khá");
                        else System.out.println("Thu nhập cao");

                        dsLuong.add(luong);
                    }
                    break;

                case 2:
                    if (dsLuong.isEmpty()) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double sum = 0, max = dsLuong.get(0), min = dsLuong.get(0);
                        for (double l : dsLuong) {
                            sum += l;
                            if (l > max) max = l;
                            if (l < min) min = l;
                        }
                        double avg = sum / dsLuong.size();

                        System.out.println("Số nhân viên: " + dsLuong.size());
                        System.out.println("Lương trung bình: " + avg);
                        System.out.println("Lương cao nhất: " + max);
                        System.out.println("Lương thấp nhất: " + min);
                        System.out.println("Tổng tiền lương: " + sum);
                    }
                    break;

                case 3:
                    if (dsLuong.isEmpty()) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double totalBonus = 0;

                        for (double l : dsLuong) {
                            double bonus;
                            if (l < 5_000_000) bonus = l * 0.05;
                            else if (l <= 15_000_000) bonus = l * 0.10;
                            else if (l <= 50_000_000) bonus = l * 0.15;
                            else if (l <= 100_000_000) bonus = l * 0.20;
                            else bonus = l * 0.25;

                            totalBonus += bonus;
                        }

                        System.out.println("Tổng tiền thưởng: " + totalBonus);
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
