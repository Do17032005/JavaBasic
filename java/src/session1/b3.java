package session1;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tuSo1;
        int mauSo1;
        int tuSo2;
        int mauSo2;

        System.out.print("Nhap tu so phan so thu nhat: ");
        tuSo1 = scanner.nextInt();
        System.out.print("Nhap mau so phan so thu nhat: ");
        mauSo1 = scanner.nextInt();

        System.out.print("Nhap tu so phan so thu hai: ");
        tuSo2 = scanner.nextInt();
        System.out.print("Nhap mau so phan so thu hai: ");
        mauSo2 = scanner.nextInt();

        int tuSoTong = tuSo1 * mauSo2 + tuSo2 * mauSo1;
        int mauSoTong = mauSo1 * mauSo2;

        System.out.println("Tong hai phan so = " + tuSoTong + "/" + mauSoTong);

        scanner.close();
    }
}
