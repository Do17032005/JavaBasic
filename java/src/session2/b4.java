package session2;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Kiểm tra tam giác hợp lệ
        if (a + b > c && a + c > b && b + c > a) {

            // Tam giác đều
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            }
            // Tam giác cân
            else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân");
            }
            // Tam giác vuông
            else if (a * a + b * b == c * c ||
                     a * a + c * c == b * b ||
                     b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");
            }
            // Tam giác thường
            else {
                System.out.println("Tam giác thường");
            }

        } else {
            System.out.println("Ba cạnh không tạo thành tam giác");
        }
    }
}
