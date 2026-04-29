package session2;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        N = Math.abs(N); // chuyển về số dương

        int sum = 0;
        while (N > 0) {
            sum += N % 10; // lấy chữ số cuối
            N /= 10;       // loại bỏ chữ số cuối
        }

        System.out.println("Tổng các chữ số là: " + sum);
    }
}
