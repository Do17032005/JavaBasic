package session4;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[0];
        int choice;

        do {
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                    }
                    int n = sc.nextInt();
                    sc.nextLine();

                    while (n < 0) {
                        System.out.print("Số lượng không hợp lệ, nhập lại: ");
                        while (!sc.hasNextInt()) {
                            sc.next();
                            System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                        }
                        n = sc.nextInt();
                        sc.nextLine();
                    }

                    scores = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                        while (!sc.hasNextDouble()) {
                            sc.next();
                            System.out.print("Vui lòng nhập số thực hợp lệ: ");
                        }
                        scores[i] = sc.nextDouble();
                        sc.nextLine();
                        while (scores[i] < 0 || scores[i] > 10) {
                            System.out.print("Điểm phải từ 0 đến 10, nhập lại: ");
                            while (!sc.hasNextDouble()) {
                                sc.next();
                                System.out.print("Vui lòng nhập số thực hợp lệ: ");
                            }
                            scores[i] = sc.nextDouble();
                            sc.nextLine();
                        }
                    }
                    break;
                case 2:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    System.out.println("Danh sách điểm sinh viên:");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("Sinh viên " + (i + 1) + ": " + scores[i]);
                    }
                    break;
                case 3:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    double sum = 0;
                    for (double score : scores) {
                        sum += score;
                    }

                    double average = sum / scores.length;
                    System.out.printf("Điểm trung bình: %.2f%n", average);
                    break;
                case 4:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    double min = scores[0];
                    double max = scores[0];
                    for (double score : scores) {
                        if (score < min) {
                            min = score;
                        }
                        if (score > max) {
                            max = score;
                        }
                    }

                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    break;
                case 5:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    int pass = 0;
                    int fail = 0;

                    for (double score : scores) {
                        if (score >= 5) {
                            pass++;
                        } else {
                            fail++;
                        }
                    }

                    System.out.println("Số sinh viên đạt: " + pass);
                    System.out.println("Số sinh viên trượt: " + fail);
                    break;
                case 6:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    double[] sortedScores = Arrays.copyOf(scores, scores.length);
                    Arrays.sort(sortedScores);

                    System.out.println("Danh sách điểm sau khi sắp xếp tăng dần:");
                    for (int i = 0; i < sortedScores.length; i++) {
                        System.out.println("Sinh viên " + (i + 1) + ": " + sortedScores[i]);
                    }
                    break;
                case 7:
                    if (scores.length == 0) {
                        System.out.println("Chưa có dữ liệu điểm.");
                        break;
                    }

                    int good = 0;
                    int excellent = 0;

                    for (double score : scores) {
                        if (score >= 8 && score < 9) {
                            good++;
                        } else if (score >= 9) {
                            excellent++;
                        }
                    }

                    System.out.println("Số sinh viên giỏi (8.0 - dưới 9.0): " + good);
                    System.out.println("Số sinh viên xuất sắc (9.0 - 10.0): " + excellent);
                    break;
                case 8:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 8.");
            }

            System.out.println();
        } while (choice != 8);

        sc.close();
    }
}
