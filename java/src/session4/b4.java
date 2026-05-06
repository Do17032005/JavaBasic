package session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Mảng không có phần tử");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int v : arr) {
            if (v % 2 == 0)
                evens.add(v);
            else
                odds.add(v);
        }

        int idx = 0;
        for (int v : evens)
            arr[idx++] = v;
        for (int v : odds)
            arr[idx++] = v;

        System.out.println("Mảng sau khi sắp xếp (chẵn trước, lẻ sau):");
        for (int v : arr)
            System.out.print(v + " ");
        System.out.println();

        sc.close();
    }
}
