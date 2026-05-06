package session4;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Kích thước mảng phải là số nguyên dương.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Selection sort giảm dần
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx])
                    maxIdx = j;
            }
            if (maxIdx != i) {
                int tmp = arr[i];
                arr[i] = arr[maxIdx];
                arr[maxIdx] = tmp;
            }
        }

        System.out.println("Mảng đã sắp xếp giảm dần:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        System.out.print("Nhập số cần tìm: ");
        int key = sc.nextInt();

        int linearIdx = linearSearch(arr, key);
        int binaryIdx = binarySearchDescending(arr, key);

        if (linearIdx >= 0)
            System.out.println("Tìm kiếm tuyến tính: tìm thấy tại vị trí " + linearIdx + " (0-based)");
        else
            System.out.println("Tìm kiếm tuyến tính: không tìm thấy");

        if (binaryIdx >= 0)
            System.out.println("Tìm kiếm nhị phân: tìm thấy tại vị trí " + binaryIdx + " (0-based)");
        else
            System.out.println("Tìm kiếm nhị phân: không tìm thấy");

        sc.close();
    }

    // Linear search returns index or -1
    private static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    // Binary search on descending-sorted array
    private static int binarySearchDescending(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key)
                return mid;
            if (a[mid] < key)
                hi = mid - 1; // key larger -> left side in descending
            else
                lo = mid + 1;
        }
        return -1;
    }
}
