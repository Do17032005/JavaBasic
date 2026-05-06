package session4;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Số hàng và số cột phải là số nguyên dương.");
            sc.close();
            return;
        }

        int[][] a = new int[rows][cols];
        long sumEven = 0;
        long sumOdd = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
                if (a[i][j] % 2 == 0)
                    sumEven += a[i][j];
                else
                    sumOdd += a[i][j];
            }
        }

        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);
        sc.close();
    }
}
