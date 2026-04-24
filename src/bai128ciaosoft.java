import java.util.Scanner;

public class bai128ciaosoft {
    public static void nhapMang(double[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextDouble();
        }
    }
    public static void xuatMang(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        double[] a = new double[n];
        nhapMang(a);
        System.out.print("Mảng vừa nhập: ");
    }
}
