package session1;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cân nặng = ");
        double canNang = scanner.nextDouble();

        System.out.print("Chiều cao = ");
        double chieuCao = scanner.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);
        System.out.printf("Chỉ số BMI = %.2f%n", bmi);

        scanner.close();
    }
}
