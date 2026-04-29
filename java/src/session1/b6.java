package session1;

import java.util.Scanner;
public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vận tốc: ");
        float vantoc ;
        vantoc = sc.nextFloat();
        System.out.println("nhập thời gian: ");
        double thoigian = sc.nextDouble();
        double quangduong = vantoc*thoigian;
        System.out.println("quáng đường là: " +quangduong);
        int b = Integer.parseInt(sc.nextLine());

    }
}
