import java.util.Scanner;

public class bai129ciaosoft {
    public static void nhapMang(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        nhapMang(a);
        System.out.print("Mảng vừa nhập: ");
    }
}
