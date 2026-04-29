package session1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String masach;
        System.out.println("nhap ma sach:");
        Scanner sc = new Scanner(System.in);
        masach = sc.nextLine();
        String tensach;
        System.out.println("nhap ten sach:");
        tensach = sc.nextLine();
        float gia;
        System.out.println("nhap gia sach:");
        gia = Float.parseFloat(sc.nextLine());
        int namsx;
        System.out.println("nhap nam sach:");
        namsx = sc.nextInt();
        String tacgia;
        System.out.println("nhap tacgia sach:");
        tacgia = sc.nextLine();
        boolean trangthai;
        System.out.println("nhap trangthai sach:");
        trangthai = sc.nextBoolean();

        int noo = sc.nextInt();

        System.out.printf("mã sach: %s" +masach, "tên sách: %s" +tensach,
                "giá : %f"+ gia, "năm sản xuất: %d"+ namsx,
                "Tác giả: %s"+tacgia, "trạng thái: %b"+trangthai);
    }
}
