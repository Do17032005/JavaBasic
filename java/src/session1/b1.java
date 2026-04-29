package session1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh tron: ");
        float radius = scanner.nextFloat();

        float area = (float) (Math.PI * radius * radius);

        System.out.println("Dien tich hinh tron = " + area);

        scanner.close();
    }
}
